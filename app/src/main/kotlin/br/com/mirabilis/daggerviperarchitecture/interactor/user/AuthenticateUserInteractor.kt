package br.com.mirabilis.daggerviperarchitecture.interactor.user

import br.com.mirabilis.daggerviperarchitecture.entity.api.User
import br.com.mirabilis.daggerviperarchitecture.repository.listener.RepositoryListener
import br.com.mirabilis.daggerviperarchitecture.repository.user.UserRepository
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class AuthenticateUserInteractor @Inject constructor(): UserInteractor.Authenticate {

    @Inject lateinit var repository: UserRepository.Authenticate

    inner class OnAuthenticated(private val listener: UserInteractor.OnAuthenticated) :
        RepositoryListener<User> {

        override fun onResult(data: User?) {
            if (data == null) {
                listener.onFailed(Throwable("Some error"))
                return
            }

            listener.onAuthenticated(data)
        }

        override fun onFailure(throwable: Throwable?) {
            if (throwable != null) {
                listener.onFailed(throwable)
                return
            }

            listener.onFailed(Throwable("Some error"))
        }

    }

    override fun authenticate(username: String,
                              password: String,
                              listener: UserInteractor.OnAuthenticated) {
        repository.authenticate(username, password, OnAuthenticated(listener))
    }

    override fun unregister() {
        repository.unregister()
    }

}
