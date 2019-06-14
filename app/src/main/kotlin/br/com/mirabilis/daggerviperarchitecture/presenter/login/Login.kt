package br.com.mirabilis.daggerviperarchitecture.presenter.login

import android.app.Activity
import br.com.mirabilis.daggerviperarchitecture.base.presenter.PresenterActions
import br.com.mirabilis.daggerviperarchitecture.base.view.PresenterView

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
object Login {

    interface View : PresenterView {
        fun showFailed(throwable: Throwable)

        fun showFailedUsernameEmpty()
        fun showFailedPasswordEmpty()
    }

    interface Presenter: PresenterActions<View> {
        fun doLogin(username: String, password: String)
    }

    interface Router<ACTIVITY : Activity> : br.com.mirabilis.daggerviperarchitecture.base.router.Router<ACTIVITY> {
        fun goBackToMain()
    }

}