package br.com.mirabilis.daggerviperarchitecture.interactor.user

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class LogoutUseCase @Inject constructor(): UserInteractor.Logout {

    @Inject lateinit var delete: UserInteractor.Delete

    override fun logout(listener: UserInteractor.OnLogout) {
        val success = delete.deleteUser()
        if (success) {
            listener.onSuccess()
            return
        }

        listener.onFailed(Throwable("Some error"))
    }

    override fun unregister() {
        //TODO do something if need
    }

}
