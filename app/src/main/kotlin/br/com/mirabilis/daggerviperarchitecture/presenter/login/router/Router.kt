package br.com.mirabilis.daggerviperarchitecture.presenter.login.router

import br.com.mirabilis.daggerviperarchitecture.presenter.login.Login
import br.com.mirabilis.daggerviperarchitecture.ui.login.LoginActivity
import br.com.mirabilis.daggerviperarchitecture.ui.main.MainActivity
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class Router @Inject constructor(): Login.Router<LoginActivity> {

    override var activity: LoginActivity? = null

    override fun goBackToMain() {
        activity?.startActivity(MainActivity::class.java)
        activity?.finish()
    }

}