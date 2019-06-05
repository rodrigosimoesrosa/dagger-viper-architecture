package br.com.mirabilis.daggerviperarchitecture.presenter.login

import br.com.mirabilis.daggerviperarchitecture.base.presenter.PresenterActions
import br.com.mirabilis.daggerviperarchitecture.base.view.PresenterView
import br.com.mirabilis.daggerviperarchitecture.ui.login.LoginActivity

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
object Login {

    interface View : PresenterView {
        fun showFailed(throwable: Throwable)
    }

    interface Presenter: PresenterActions<View> {
        fun doLogin(username: String, password: String)
    }

    interface Router : br.com.mirabilis.daggerviperarchitecture.base.router.Router<LoginActivity> {
        fun goBackToMain()
    }

}