package br.com.mirabilis.daggerviperarchitecture.base.router

import android.app.Activity

/**
 * Created by rodrigosimoesrosa
 */
interface RouterActions<in A : Activity> {
    fun attachActivity(view: A)
    fun unregister()
}
