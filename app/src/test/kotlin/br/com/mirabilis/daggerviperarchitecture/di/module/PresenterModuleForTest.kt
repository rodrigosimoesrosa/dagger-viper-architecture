package br.com.mirabilis.daggerviperarchitecture.di.module

import br.com.mirabilis.daggerviperarchitecture.presenter.login.Login
import br.com.mirabilis.daggerviperarchitecture.presenter.login.LoginPresenter
import br.com.mirabilis.daggerviperarchitecture.presenter.main.Main
import br.com.mirabilis.daggerviperarchitecture.presenter.main.MainPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Module
class PresenterModuleForTest {

    @Provides
    fun bindMainPresenter(): Main.Presenter {
        val router = RouterModuleForTest.mainRouter
        val presenter = MainPresenter(InteractorModuleForTest.logoutInteractor)
        presenter.getUserInteractor = InteractorModuleForTest.getUserInteractor
        presenter.router = router

        return presenter
    }

    @Provides
    fun bindLoginPresenter(): Login.Presenter {
        val router = RouterModuleForTest.loginRouter
        val interactor = InteractorModuleForTest.loginInteractor
        val presenter = LoginPresenter(interactor)
        presenter.router = router

        return presenter
    }
}