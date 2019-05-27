package br.com.mirabilis.daggerviperarchitecture.base.ui

import android.os.Bundle
import br.com.mirabilis.daggerviperarchitecture.base.presenter.PresenterActions
import br.com.mirabilis.daggerviperarchitecture.base.view.PresenterView

/**
 * Created by rodrigosimoesrosa on 2019-05-21.
 * Copyright © 2019. All rights reserved.
 */
abstract class MVPBaseFragment<in V : PresenterView, P : PresenterActions<V>> : BaseFragment() {

    lateinit var presenter: P

    abstract fun buildPresenter(): P

    @Suppress("UNCHECKED_CAST")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = buildPresenter()
        presenter.attachView(this as V)
    }

    override fun onDestroy() {
        presenter.detachView()
        super.onDestroy()
    }
}
