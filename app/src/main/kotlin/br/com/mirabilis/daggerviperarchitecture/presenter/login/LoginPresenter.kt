package br.com.mirabilis.daggerviperarchitecture.presenter.login

import br.com.mirabilis.daggerviperarchitecture.base.presenter.viper.Presenter
import br.com.mirabilis.daggerviperarchitecture.interactor.user.UserInteractor
import br.com.mirabilis.daggerviperarchitecture.presenter.login.router.Router
import br.com.mirabilis.daggerviperarchitecture.ui.login.LoginActivity
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class LoginPresenter @Inject constructor(private val loginInteractor: UserInteractor.Login) :
        Presenter<Login.View, LoginActivity, Router>(), Login.Presenter {

    init {
        addInteractor(loginInteractor)
    }

    private inner class OnLogin : UserInteractor.OnLogin {

        override fun onSuccess() {
            router.goBackToMain()
        }

        override fun onFailed(throwable: Throwable) {
            view?.showFailed(throwable)
        }

    }

    override fun doLogin(username: String, password: String) {
        loginInteractor.login(username, password, OnLogin())
    }

}