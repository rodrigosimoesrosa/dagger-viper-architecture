package br.com.mirabilis.daggerviperarchitecture.presenter.main.router

import br.com.mirabilis.daggerviperarchitecture.presenter.main.Main
import br.com.mirabilis.daggerviperarchitecture.ui.login.LoginActivity
import br.com.mirabilis.daggerviperarchitecture.ui.main.MainActivity
import javax.inject.Inject

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
class Router @Inject constructor():
        br.com.mirabilis.daggerviperarchitecture.base.router.Router<MainActivity>, Main.Router {

    override var activity: MainActivity? = null

    override fun showLogin() {
        activity?.startActivity(LoginActivity::class.java)
        activity?.finish()
    }

}