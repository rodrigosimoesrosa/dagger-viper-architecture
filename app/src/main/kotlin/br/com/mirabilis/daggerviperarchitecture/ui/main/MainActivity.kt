package br.com.mirabilis.daggerviperarchitecture.ui.main

import android.os.Bundle
import br.com.mirabilis.daggerviperarchitecture.R
import br.com.mirabilis.daggerviperarchitecture.base.ui.MVPBaseActivity
import br.com.mirabilis.daggerviperarchitecture.entity.User
import br.com.mirabilis.daggerviperarchitecture.presenter.main.Main
import br.com.mirabilis.daggerviperarchitecture.ui.second.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
class MainActivity : MVPBaseActivity<Main.View, Main.Presenter>(), Main.View {

    override fun getLayout(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btnSecondActivity.setOnClickListener { startActivity(SecondActivity::class.java) }
        presenter.loadUser()
    }

    override fun showUser(user: User) {
        lblText.text = user.name
    }

}
