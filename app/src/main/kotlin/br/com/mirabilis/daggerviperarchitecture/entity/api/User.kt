package br.com.mirabilis.daggerviperarchitecture.entity.api

import br.com.mirabilis.daggerviperarchitecture.entity.business.User
import java.io.Serializable

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
data class User(val name: String,
                val token: String): Serializable {

    fun toBusiness() = User(name, token)

}