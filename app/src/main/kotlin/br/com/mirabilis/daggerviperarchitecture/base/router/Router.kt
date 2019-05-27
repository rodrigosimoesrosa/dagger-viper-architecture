package br.com.mirabilis.daggerviperarchitecture.base.router

import android.app.Activity

/**
 * Created by rodrigosimoesrosa
 */
abstract class Router<A : Activity> : RouterActions<A> {

    protected var activity: A? = null

    override fun attachActivity(view: A) {
        activity = view
    }

    override fun unregister() {
        activity = null
    }
}
