package br.com.mirabilis.daggerviperarchitecture.base.presenter.viper

import android.app.Activity
import android.support.v4.app.Fragment
import br.com.mirabilis.daggerviperarchitecture.base.presenter.mvp.Presenter
import br.com.mirabilis.daggerviperarchitecture.base.router.Router
import br.com.mirabilis.daggerviperarchitecture.base.view.PresenterView

/**
 * Created by rodrigosimoesrosa on 27/05/19.
 * Copyright © 2019. All rights reserved.
 */
abstract class Presenter<V : PresenterView, A : Activity, R : Router<A>> :
        Presenter<V>() {

    abstract var router: R

    @Suppress("UNCHECKED_CAST")
    override fun attachView(view: V) {
        super.attachView(view)

        when (view) {
            is android.app.Fragment -> router.attachActivity(view.activity as A)
            is Fragment -> router.attachActivity(view.activity as A)
            is Activity -> router.attachActivity(view as A)
        }
    }

    override fun detachView() {
        super.detachView()
        router.unregister()
    }
}
