package br.com.mirabilis.daggerviperarchitecture.di.module

import br.com.mirabilis.daggerviperarchitecture.presenter.main.Main
import br.com.mirabilis.daggerviperarchitecture.presenter.main.MainPresenter
import br.com.mirabilis.daggerviperarchitecture.presenter.second.Second
import br.com.mirabilis.daggerviperarchitecture.presenter.second.SecondPresenter
import dagger.Binds
import dagger.Module

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Module
abstract class PresenterModule {

    @Binds
    abstract fun bindMainPresenter(presenter: MainPresenter): Main.Presenter

    @Binds
    abstract fun bindSecondPresenter(presenter: SecondPresenter): Second.Presenter

}