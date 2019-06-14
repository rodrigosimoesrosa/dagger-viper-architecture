package br.com.mirabilis.daggerviperarchitecture.presenter.main.router

import br.com.mirabilis.daggerviperarchitecture.presenter.main.Main
import br.com.mirabilis.daggerviperarchitecture.ui.login.LoginActivity
import br.com.mirabilis.daggerviperarchitecture.ui.main.MainActivity
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class Router @Inject constructor() : Main.Router<MainActivity> {

    override var activity: MainActivity? = null

    override fun showLogin() {
        activity?.startActivity(LoginActivity::class.java)
        activity?.finish()
    }

}