package br.com.mirabilis.daggerviperarchitecture.di.module

import br.com.mirabilis.daggerviperarchitecture.presenter.login.Login
import br.com.mirabilis.daggerviperarchitecture.presenter.main.Main
import dagger.Binds
import dagger.Module

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Module
abstract class RouterModule {

    @Binds
    abstract fun bindMainRouter(
            presenter: br.com.mirabilis.daggerviperarchitecture.presenter.main.router.Router): Main.Router

    @Binds
    abstract fun bindLoginRouter(
            presenter: br.com.mirabilis.daggerviperarchitecture.presenter.login.router.Router): Login.Router

}