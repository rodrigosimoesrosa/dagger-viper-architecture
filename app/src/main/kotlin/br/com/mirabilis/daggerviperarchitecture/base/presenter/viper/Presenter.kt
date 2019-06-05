package br.com.mirabilis.daggerviperarchitecture.base.presenter.viper

import android.app.Activity
import android.support.v4.app.Fragment
import br.com.mirabilis.daggerviperarchitecture.base.presenter.mvp.Presenter
import br.com.mirabilis.daggerviperarchitecture.base.router.Router
import br.com.mirabilis.daggerviperarchitecture.base.view.PresenterView
import javax.inject.Inject

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
@Suppress("DEPRECATION")
abstract class Presenter<VIEW : PresenterView, ACTIVITY : Activity, ROUTER : Router<ACTIVITY>> :
        Presenter<VIEW>() {

    @Inject lateinit var router: ROUTER

    @Suppress("UNCHECKED_CAST")
    override fun attachView(view: VIEW) {
        super.attachView(view)

        when (view) {
            is android.app.Fragment -> router.attachActivity(view.activity as ACTIVITY)
            is Fragment -> router.attachActivity(view.activity as ACTIVITY)
            is Activity -> router.attachActivity(view as ACTIVITY)
        }
    }

    override fun detachView() {
        super.detachView()
        router.unregister()
    }
}
