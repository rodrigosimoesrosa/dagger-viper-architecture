package br.com.mirabilis.daggerviperarchitecture.di.module

import br.com.mirabilis.daggerviperarchitecture.interactor.info.GetInfoInteractor
import br.com.mirabilis.daggerviperarchitecture.interactor.info.InfoInteractor
import br.com.mirabilis.daggerviperarchitecture.interactor.user.*
import dagger.Binds
import dagger.Module

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Module
abstract class InteractorModule {

    @Binds
    abstract fun bindGetInfoInteractor(interactor: GetInfoInteractor): InfoInteractor.Get

    @Binds
    abstract fun bindGetUserInteractor(interactor: GetUserInteractor): UserInteractor.Get

    @Binds
    abstract fun bindAuthenticateUserInteractor(interactor: AuthenticateUserInteractor): UserInteractor.Authenticate

    @Binds
    abstract fun bindSaveUserInteractor(interactor: SaveUserInteractor): UserInteractor.Save

    @Binds
    abstract fun bindDeleteUserInteractor(interactor: DeleteUserInteractor): UserInteractor.Delete

    @Binds
    abstract fun bindLoginInteractor(interactor: LoginUseCase): UserInteractor.Login

    @Binds
    abstract fun bindLogoutInteractor(interactor: LogoutUseCase): UserInteractor.Logout

}