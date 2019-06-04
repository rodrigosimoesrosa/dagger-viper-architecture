package br.com.mirabilis.daggerviperarchitecture.di.module

import br.com.mirabilis.daggerviperarchitecture.repository.info.GetInfoRepository
import br.com.mirabilis.daggerviperarchitecture.repository.info.InfoRepository
import br.com.mirabilis.daggerviperarchitecture.repository.user.GetUserRepository
import br.com.mirabilis.daggerviperarchitecture.repository.user.UserRepository
import dagger.Binds
import dagger.Module

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindGetUserRepository(repository: GetUserRepository): UserRepository.Get

    @Binds
    abstract fun bindGetInfoRepository(repository: GetInfoRepository): InfoRepository.Get

}