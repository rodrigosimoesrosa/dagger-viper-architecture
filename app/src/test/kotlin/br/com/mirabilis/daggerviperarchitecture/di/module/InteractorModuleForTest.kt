package br.com.mirabilis.daggerviperarchitecture.di.module

import br.com.mirabilis.daggerviperarchitecture.interactor.user.UserInteractor
import com.nhaarman.mockito_kotlin.mock
import dagger.Module
import dagger.Provides

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Module
class InteractorModuleForTest {

    companion object {
        val getUserInteractor: UserInteractor.Get = mock()
        val logoutInteractor: UserInteractor.Logout = mock()
        val loginInteractor: UserInteractor.Login = mock()
    }

    @Provides
    fun provideGetUserInteractor(): UserInteractor.Get {
        return getUserInteractor
    }

    @Provides
    fun provideLoginInteractor(): UserInteractor.Login {
        return loginInteractor
    }

    @Provides
    fun provideLogoutInteractor(): UserInteractor.Logout {
        return logoutInteractor
    }
}