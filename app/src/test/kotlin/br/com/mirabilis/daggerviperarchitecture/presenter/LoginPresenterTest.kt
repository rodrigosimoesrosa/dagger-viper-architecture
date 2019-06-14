package br.com.mirabilis.daggerviperarchitecture.presenter

import br.com.mirabilis.daggerviperarchitecture.di.DaggerLoginComponentForTest
import br.com.mirabilis.daggerviperarchitecture.interactor.user.UserInteractor
import br.com.mirabilis.daggerviperarchitecture.presenter.login.Login
import br.com.mirabilis.daggerviperarchitecture.presenter.login.LoginPresenter
import br.com.mirabilis.daggerviperarchitecture.ui.login.LoginActivity
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
class LoginPresenterTest {

    private lateinit var view: Login.View

    private lateinit var router: Login.Router<LoginActivity>
    private lateinit var interactor: UserInteractor.Login

    @Inject lateinit var presenter: Login.Presenter

    private val username = "software-engineer@android.com"
    private val password = "123"

    @Before
    fun setup() {
        view = mock()

        DaggerLoginComponentForTest.builder().build().inject(this)

        router = (presenter as LoginPresenter).router
        interactor = (presenter as LoginPresenter).loginInteractor

        presenter.attachView(view)
    }

    @Test
    fun `check doLogin() failed by empty username and password`() {
        presenter.doLogin("", "")
        verify(view).showFailedUsernameEmpty()
    }

    @Test
    fun `check doLogin() failed by empty username`() {
        presenter.doLogin("", password)
        verify(view).showFailedUsernameEmpty()
    }

    @Test
    fun `check doLogin() failed by empty password`() {
        presenter.doLogin(username, "")
        verify(view).showFailedPasswordEmpty()
    }

    @Test
    fun `check doLogin() success`() {
        doAnswer {
            val callback: UserInteractor.OnLogin = it.getArgument(2)
            callback.onSuccess()
        }.whenever(interactor).login(eq(username), eq(password), any())

        presenter.doLogin(username, password)
        verify(router).goBackToMain()
    }

    @Test
    fun `check doLogin() error`() {
        val throwable = Throwable()

        doAnswer {
            val callback: UserInteractor.OnLogin = it.getArgument(2)
            callback.onFailed(throwable)
        }.whenever(interactor).login(eq(username), eq(password), any())

        presenter.doLogin(username, password)
        verify(view).showFailed(throwable)
    }

}