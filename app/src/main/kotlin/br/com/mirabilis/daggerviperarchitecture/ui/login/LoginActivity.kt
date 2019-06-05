package br.com.mirabilis.daggerviperarchitecture.ui.login

import android.os.Bundle
import android.view.View
import br.com.mirabilis.daggerviperarchitecture.R
import br.com.mirabilis.daggerviperarchitecture.base.ui.MVPBaseActivity
import br.com.mirabilis.daggerviperarchitecture.entity.business.User
import br.com.mirabilis.daggerviperarchitecture.presenter.login.Login
import kotlinx.android.synthetic.main.activity_login.*

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
class LoginActivity : MVPBaseActivity<Login.View, Login.Presenter>(), Login.View {

    override fun getLayout(): Int = R.layout.activity_login

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btnLogin.setOnClickListener {
            presenter.doLogin(editUsername.text.toString(), editPassword.text.toString())
        }
    }

    override fun showFailed(throwable: Throwable) {
        showToast(throwable.message)
    }

    override fun showUser(user: User) {
        fieldsLinearLayout.visibility = View.GONE
        lblUsername.visibility = View.VISIBLE

        lblUsername.text = user.name
    }

}
