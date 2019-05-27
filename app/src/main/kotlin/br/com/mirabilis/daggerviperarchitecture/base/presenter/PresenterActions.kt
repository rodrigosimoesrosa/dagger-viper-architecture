package br.com.mirabilis.daggerviperarchitecture.base.presenter

import br.com.mirabilis.daggerviperarchitecture.base.view.PresenterView

/**
 * Created by rodrigosimoesrosa
 */
interface PresenterActions<in V : PresenterView> {
    fun attachView(view: V)
    fun detachView()
}
