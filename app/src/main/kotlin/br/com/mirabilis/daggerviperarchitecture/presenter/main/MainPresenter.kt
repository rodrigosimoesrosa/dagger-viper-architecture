package br.com.mirabilis.daggerviperarchitecture.presenter.main

import br.com.mirabilis.daggerviperarchitecture.base.presenter.mvp.Presenter
import br.com.mirabilis.daggerviperarchitecture.interactor.user.UserInteractor
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class MainPresenter @Inject constructor(private val getUserInteractor: UserInteractor.Get) :
        Presenter<Main.View>(), Main.Presenter {

    init {
        addInteractor(getUserInteractor)
    }

    override fun loadUser() {
        view?.showUser(getUserInteractor.getUser())
    }
}