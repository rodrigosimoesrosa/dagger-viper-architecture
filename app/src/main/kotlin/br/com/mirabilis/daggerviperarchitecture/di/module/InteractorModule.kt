package br.com.mirabilis.daggerviperarchitecture.di.module

import br.com.mirabilis.daggerviperarchitecture.interactor.info.GetInfoInteractor
import br.com.mirabilis.daggerviperarchitecture.interactor.info.InfoInteractor
import br.com.mirabilis.daggerviperarchitecture.interactor.user.GetUserInteractor
import br.com.mirabilis.daggerviperarchitecture.interactor.user.UserInteractor
import dagger.Binds
import dagger.Module

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Module
abstract class InteractorModule {

    @Binds
    abstract fun bindGetUserInteractor(interactor: GetUserInteractor): UserInteractor.Get

    @Binds
    abstract fun bindGetInfoInteractor(interactor: GetInfoInteractor): InfoInteractor.Get

}