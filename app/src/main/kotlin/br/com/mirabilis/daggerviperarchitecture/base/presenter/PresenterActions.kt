package br.com.mirabilis.daggerviperarchitecture.base.presenter

import br.com.mirabilis.daggerviperarchitecture.base.view.PresenterView

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
interface PresenterActions<in V : PresenterView> {
    fun attachView(view: V)
    fun detachView()
}
