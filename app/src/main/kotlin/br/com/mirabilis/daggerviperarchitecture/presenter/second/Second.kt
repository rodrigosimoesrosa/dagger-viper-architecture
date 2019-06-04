package br.com.mirabilis.daggerviperarchitecture.presenter.second

import br.com.mirabilis.daggerviperarchitecture.base.presenter.PresenterActions
import br.com.mirabilis.daggerviperarchitecture.base.view.PresenterView
import br.com.mirabilis.daggerviperarchitecture.entity.business.Info

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
object Second {

    interface View : PresenterView {
        fun showInfo(info: Info)
    }

    interface Presenter: PresenterActions<View> {
        fun loadInfo()
    }
}