package br.com.mirabilis.daggerviperarchitecture.ui.second

import android.os.Bundle
import br.com.mirabilis.daggerviperarchitecture.R
import br.com.mirabilis.daggerviperarchitecture.base.ui.MVPBaseActivity
import br.com.mirabilis.daggerviperarchitecture.entity.Info
import br.com.mirabilis.daggerviperarchitecture.presenter.second.Second
import kotlinx.android.synthetic.main.activity_second.*

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
class SecondActivity : MVPBaseActivity<Second.View, Second.Presenter>(), Second.View {

    override fun getLayout(): Int = R.layout.activity_second

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.loadInfo()
    }

    override fun showInfo(info: Info) {
        lblText.text = info.description
    }
}
