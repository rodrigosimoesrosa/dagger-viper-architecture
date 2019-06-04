package br.com.mirabilis.daggerviperarchitecture.presenter.second

import br.com.mirabilis.daggerviperarchitecture.base.presenter.mvp.Presenter
import br.com.mirabilis.daggerviperarchitecture.interactor.info.InfoInteractor
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class SecondPresenter @Inject constructor() : Presenter<Second.View>(), Second.Presenter {

    @Inject lateinit var getInfoInteractor: InfoInteractor.Get

    override fun loadInfo() {
        view?.showInfo(getInfoInteractor.getInfo())
    }
}