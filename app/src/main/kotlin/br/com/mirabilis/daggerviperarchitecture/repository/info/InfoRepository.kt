package br.com.mirabilis.daggerviperarchitecture.repository.info

import br.com.mirabilis.daggerviperarchitecture.base.repository.Repository
import br.com.mirabilis.daggerviperarchitecture.entity.business.Info

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
object InfoRepository {

    interface Get : Repository.Behavior {
        fun getInfo(): Info
    }
}
