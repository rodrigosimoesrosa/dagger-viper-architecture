package br.com.mirabilis.daggerviperarchitecture.repository.user

import br.com.mirabilis.daggerviperarchitecture.base.repository.Repository
import br.com.mirabilis.daggerviperarchitecture.entity.User

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
object UserRepository {

    interface Get : Repository.Behavior {
        fun getUser(): User
    }
}
