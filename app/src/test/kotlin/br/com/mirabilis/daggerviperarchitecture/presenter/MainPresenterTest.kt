package br.com.mirabilis.daggerviperarchitecture.presenter

import br.com.mirabilis.daggerviperarchitecture.di.DaggerMainComponentForTest
import br.com.mirabilis.daggerviperarchitecture.entity.business.User
import br.com.mirabilis.daggerviperarchitecture.interactor.user.UserInteractor
import br.com.mirabilis.daggerviperarchitecture.presenter.main.Main
import br.com.mirabilis.daggerviperarchitecture.presenter.main.MainPresenter
import br.com.mirabilis.daggerviperarchitecture.ui.main.MainActivity
import com.nhaarman.mockito_kotlin.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import javax.inject.Inject

/**
 * Created by rodrigosimoesrosa on 2019-06-12.
 * Copyright © 2019. All rights reserved.
 */
@RunWith(MockitoJUnitRunner::class)
class MainPresenterTest {

    private lateinit var view: Main.View

    private lateinit var router: Main.Router<MainActivity>
    private lateinit var logoutInteractor: UserInteractor.Logout
    private lateinit var getUserInteractor: UserInteractor.Get

    @Inject lateinit var presenter: Main.Presenter

    private val user = User("software-engineer@android.com", "XXXX")

    @Before
    fun setup() {

        view = mock()

        DaggerMainComponentForTest.builder().build().inject(this)

        router = (presenter as MainPresenter).router
        logoutInteractor = (presenter as MainPresenter).logoutUserInteractor
        getUserInteractor = (presenter as MainPresenter).getUserInteractor

        presenter.attachView(view)
    }

    @Test
    fun `check loadUser() when there is user`() {
        doReturn(user).whenever(getUserInteractor).getUser()

        presenter.loadUser()
        verify(view).showUser(user)
    }

    @Test
    fun `check loadUser() when there is no user`() {
        doReturn(null).whenever(getUserInteractor).getUser()

        presenter.loadUser()
        verify(router, times(2)).showLogin()
    }

    @Test
    fun `check logout() success`() {
        doAnswer {
            val callback: UserInteractor.OnLogout = it.getArgument(0)
            callback.onSuccess()
        }.whenever(logoutInteractor).logout(any())

        presenter.logout()
        verify(router).showLogin()
    }

    @Test
    fun `check logout() error`() {
        val throwable = Throwable()

        doAnswer {
            val callback: UserInteractor.OnLogout = it.getArgument(0)
            callback.onFailed(throwable)
        }.whenever(logoutInteractor).logout(any())

        presenter.logout()
        verify(view).showFailed(throwable)
    }

}