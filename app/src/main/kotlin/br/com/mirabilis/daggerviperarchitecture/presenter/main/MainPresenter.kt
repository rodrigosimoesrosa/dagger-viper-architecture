package br.com.mirabilis.daggerviperarchitecture.presenter.main

import br.com.mirabilis.daggerviperarchitecture.base.presenter.viper.Presenter
import br.com.mirabilis.daggerviperarchitecture.interactor.user.UserInteractor
import br.com.mirabilis.daggerviperarchitecture.presenter.main.router.Router
import br.com.mirabilis.daggerviperarchitecture.ui.main.MainActivity
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class MainPresenter @Inject constructor(private val logoutUserInteractor: UserInteractor.Logout) :
        Presenter<Main.View, MainActivity, Router>(), Main.Presenter {

    @Inject lateinit var getUserInteractor: UserInteractor.Get

    override fun loadUser() {
        val user = getUserInteractor.getUser()
        if (user == null) {
            router.showLogin()
            return
        }

        view?.showUser(user)
    }

    private inner class OnLogout : UserInteractor.OnLogout {

        override fun onSuccess() {
            router.showLogin()
        }

        override fun onFailed(throwable: Throwable) {
            view?.showFailed(throwable)
        }

    }

    override fun logout() {
        logoutUserInteractor.logout(OnLogout())
    }

}