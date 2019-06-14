package br.com.mirabilis.daggerviperarchitecture.presenter.main

import android.app.Activity
import br.com.mirabilis.daggerviperarchitecture.base.presenter.PresenterActions
import br.com.mirabilis.daggerviperarchitecture.base.view.PresenterView
import br.com.mirabilis.daggerviperarchitecture.entity.business.User

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
object Main {

    interface View : PresenterView {
        fun showUser(user: User)
        fun showFailed(throwable: Throwable)
    }

    interface Presenter: PresenterActions<View> {
        fun loadUser()
        fun logout()
    }

    interface Router<ACTIVITY : Activity> : br.com.mirabilis.daggerviperarchitecture.base.router.Router<ACTIVITY> {
        fun showLogin()
    }

}