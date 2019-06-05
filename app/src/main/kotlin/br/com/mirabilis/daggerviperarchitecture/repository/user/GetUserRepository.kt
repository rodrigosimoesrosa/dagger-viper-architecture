package br.com.mirabilis.daggerviperarchitecture.repository.user

import br.com.mirabilis.daggerviperarchitecture.entity.business.User
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class GetUserRepository @Inject constructor() : UserRepository.Get {

    override fun unregister() {
        //TODO "not implemented"
    }

    override fun getUser(): User? {
        return User("Rodrigo", "TOKEN")
    }

}
