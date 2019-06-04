package br.com.mirabilis.daggerviperarchitecture.repository.user

import br.com.mirabilis.daggerviperarchitecture.base.repository.Repository
import br.com.mirabilis.daggerviperarchitecture.entity.api.User
import br.com.mirabilis.daggerviperarchitecture.repository.listener.RepositoryListener

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
object UserRepository {

    interface Get : Repository.Behavior {
        fun getUser(): br.com.mirabilis.daggerviperarchitecture.entity.business.User
    }

    interface Authenticate : Repository.Behavior {
        fun authenticate(username: String,
                         password: String,
                         listener: RepositoryListener<User>)
    }

    interface Save : Repository.Behavior {
        fun saveUser(user: br.com.mirabilis.daggerviperarchitecture.entity.business.User): Boolean
    }
}
