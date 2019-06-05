package br.com.mirabilis.daggerviperarchitecture.interactor.user

import br.com.mirabilis.daggerviperarchitecture.base.interactor.Interactor
import br.com.mirabilis.daggerviperarchitecture.entity.business.User

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
object UserInteractor {

    interface OnLogin {
        fun onSuccess()
        fun onFailed(throwable: Throwable)
    }

    interface Login : Interactor.LifeCycle {
        fun login(username: String, password: String, listener: OnLogin)
    }

    interface Save {
        fun saveUser(user: User): Boolean
    }

    interface Get {
        fun getUser(): User?
    }

    interface Authenticate : Interactor.LifeCycle {
        fun authenticate(username: String, password: String, listener: OnAuthenticated)
    }

    interface OnAuthenticated {
        fun onAuthenticated(data: br.com.mirabilis.daggerviperarchitecture.entity.api.User)
        fun onFailed(throwable: Throwable)
    }

    interface OnLogout {
        fun onSuccess()
        fun onFailed(throwable: Throwable)
    }

    interface Logout : Interactor.LifeCycle {
        fun logout(listener: OnLogout)
    }

    interface Delete {
        fun deleteUser(): Boolean
    }

}
