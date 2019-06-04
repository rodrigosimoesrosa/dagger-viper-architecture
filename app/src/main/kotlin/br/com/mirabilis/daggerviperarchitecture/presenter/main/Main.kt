package br.com.mirabilis.daggerviperarchitecture.presenter.main

import br.com.mirabilis.daggerviperarchitecture.base.presenter.PresenterActions
import br.com.mirabilis.daggerviperarchitecture.base.view.PresenterView
import br.com.mirabilis.daggerviperarchitecture.entity.User

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
object Main {

    interface View : PresenterView {
        fun showUser(user: User)
    }

    interface Presenter: PresenterActions<View> {
        fun loadUser()
    }
}