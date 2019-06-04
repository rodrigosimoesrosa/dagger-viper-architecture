package br.com.mirabilis.daggerviperarchitecture.repository.user

import br.com.mirabilis.daggerviperarchitecture.entity.api.User
import br.com.mirabilis.daggerviperarchitecture.repository.listener.RepositoryListener
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class AuthenticateUserRepository @Inject constructor() : UserRepository.Authenticate {

    override fun authenticate(username: String, password: String,
                              listener: RepositoryListener<User>) {
        //TODO "not implemented"
    }

    override fun unregister() {
        //TODO "not implemented"
    }

}
