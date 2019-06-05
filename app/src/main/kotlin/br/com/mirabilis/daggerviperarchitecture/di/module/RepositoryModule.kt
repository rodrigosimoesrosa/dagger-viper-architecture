package br.com.mirabilis.daggerviperarchitecture.di.module

import br.com.mirabilis.daggerviperarchitecture.repository.info.GetInfoRepository
import br.com.mirabilis.daggerviperarchitecture.repository.info.InfoRepository
import br.com.mirabilis.daggerviperarchitecture.repository.user.*
import dagger.Binds
import dagger.Module

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindGetInfoRepository(repository: GetInfoRepository): InfoRepository.Get

    @Binds
    abstract fun bindGetUserRepository(repository: GetUserRepository): UserRepository.Get

    @Binds
    abstract fun bindAuthenticateUserRepository(repository: AuthenticateUserRepository): UserRepository.Authenticate

    @Binds
    abstract fun bindSaveUserRepository(repository: SaveUserRepository): UserRepository.Save

    @Binds
    abstract fun bindDeleteUserRepository(repository: DeleteUserRepository): UserRepository.Delete
}