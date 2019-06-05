package br.com.mirabilis.daggerviperarchitecture.base.presenter.mvp

import android.app.Activity
import android.content.Context
import android.support.v4.app.Fragment
import br.com.mirabilis.daggerviperarchitecture.base.interactor.Interactor
import br.com.mirabilis.daggerviperarchitecture.base.presenter.PresenterActions
import br.com.mirabilis.daggerviperarchitecture.base.view.PresenterView

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
@Suppress("DEPRECATION")
abstract class Presenter<VIEW : PresenterView> : PresenterActions<VIEW> {

    var view: VIEW? = null

    private val interactors: MutableList<Interactor.LifeCycle> = mutableListOf()

    @Suppress("UNCHECKED_CAST")
    override fun attachView(view: VIEW) {
        this.view = view
    }

    override fun detachView() {
        view = null
        interactors.forEach { it.unregister() }
        interactors.clear()
    }

    protected fun <INTERACTOR : Interactor.LifeCycle> addInteractor(interactor: INTERACTOR) {
        interactors.add(interactor)
    }

    protected fun <INTERACTOR : Interactor.LifeCycle> removeInteractor(interactor: INTERACTOR): Boolean {
        return interactors.remove(interactor)
    }

    protected fun call(function: () -> Unit) {
        when (view) {
            is android.app.Fragment -> (view as android.app.Fragment).activity.runOnUiThread { function() }
            is Fragment -> (view as Fragment).activity?.runOnUiThread { function() }
            is Activity -> (view as Activity).runOnUiThread { function() }
            else -> function()
        }
    }

    protected fun <TYPE> call(parameter: TYPE, function: (parameter: TYPE) -> Unit) {
        when (view) {
            is android.app.Fragment -> (view as android.app.Fragment).activity.runOnUiThread { function(parameter) }
            is Fragment -> (view as Fragment).activity?.runOnUiThread { function(parameter) }
            is Activity -> (view as Activity).runOnUiThread { function(parameter) }
            else -> function(parameter)
        }
    }

    fun getContext(): Context {
        return when (view) {
            is android.app.Fragment -> (view as android.app.Fragment).activity
            is Fragment -> (view as Fragment).context!!
            is Activity -> view as Activity
            else -> view as Context
        }
    }
}
