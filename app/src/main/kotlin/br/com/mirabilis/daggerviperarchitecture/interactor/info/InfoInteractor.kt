package br.com.mirabilis.daggerviperarchitecture.interactor.info

import br.com.mirabilis.daggerviperarchitecture.entity.business.Info

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
object InfoInteractor {

    interface Get {
        fun getInfo(): Info
    }
}
