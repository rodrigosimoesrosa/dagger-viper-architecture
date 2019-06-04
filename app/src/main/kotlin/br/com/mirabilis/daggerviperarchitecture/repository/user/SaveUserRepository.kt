package br.com.mirabilis.daggerviperarchitecture.repository.user

import br.com.mirabilis.daggerviperarchitecture.entity.business.User
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class SaveUserRepository @Inject constructor() : UserRepository.Save {

    override fun saveUser(user: User): Boolean {
        //TODO "not implemented"
        return true
    }

    override fun unregister() {
        //TODO "not implemented"
    }

}
