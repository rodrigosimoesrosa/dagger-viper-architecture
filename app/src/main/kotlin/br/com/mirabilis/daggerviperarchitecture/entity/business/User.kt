package br.com.mirabilis.daggerviperarchitecture.entity.business

import java.io.Serializable

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
data class User(val name: String,
                val token: String): Serializable