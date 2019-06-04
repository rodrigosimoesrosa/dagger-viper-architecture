package br.com.mirabilis.daggerviperarchitecture.ui.login

import android.os.Bundle
import br.com.mirabilis.daggerviperarchitecture.R
import br.com.mirabilis.daggerviperarchitecture.base.ui.MVPBaseActivity
import br.com.mirabilis.daggerviperarchitecture.presenter.login.Login

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
class LoginActivity : MVPBaseActivity<Login.View, Login.Presenter>(), Login.View {

    override fun getLayout(): Int = R.layout.activity_login

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

}
