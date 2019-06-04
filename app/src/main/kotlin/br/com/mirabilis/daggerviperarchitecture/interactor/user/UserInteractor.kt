package br.com.mirabilis.daggerviperarchitecture.interactor.user

import br.com.mirabilis.daggerviperarchitecture.base.interactor.Interactor
import br.com.mirabilis.daggerviperarchitecture.entity.User

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
object UserInteractor {

    interface Get : Interactor.LifeCycle {
        fun getUser(): User
    }

}
