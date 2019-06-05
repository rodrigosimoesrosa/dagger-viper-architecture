package br.com.mirabilis.daggerviperarchitecture.presenter.login

import br.com.mirabilis.daggerviperarchitecture.base.presenter.mvp.Presenter
import br.com.mirabilis.daggerviperarchitecture.interactor.user.UserInteractor
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class LoginPresenter @Inject constructor() : Presenter<Login.View>(), Login.Presenter {

    @Inject lateinit var loginInteractor: UserInteractor.Login
    @Inject lateinit var getUserInteractor: UserInteractor.Get

    init {
        addInteractor(loginInteractor)
    }

    private inner class OnLogin : UserInteractor.OnLogin {

        override fun onSuccess() {
            view?.showUser(getUserInteractor.getUser())
        }

        override fun onFailed(throwable: Throwable) {
            view?.showFailed(throwable)
        }

    }

    override fun doLogin(username: String, password: String) {
        loginInteractor.login(username, password, OnLogin())
    }

}