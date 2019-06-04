package br.com.mirabilis.daggerviperarchitecture.interactor.user

import br.com.mirabilis.daggerviperarchitecture.entity.api.User
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class LoginUseCase @Inject constructor(): UserInteractor.Login {

    @Inject lateinit var authenticate: UserInteractor.Authenticate
    @Inject lateinit var save: UserInteractor.Save

    private inner class OnAuthenticated(private val listener: UserInteractor.OnLogin) :
        UserInteractor.OnAuthenticated {

        override fun onAuthenticated(data: User) {
            save.saveUser(data.toBusiness())
            listener.onSuccess()
        }

        override fun onFailed(throwable: Throwable) {
            listener.onFailed(throwable)
        }
    }

    override fun login(username: String, password: String, listener: UserInteractor.OnLogin) {
        authenticate.authenticate(username, password, OnAuthenticated(listener))
    }

    override fun unregister() {
        authenticate.unregister()
    }

}
