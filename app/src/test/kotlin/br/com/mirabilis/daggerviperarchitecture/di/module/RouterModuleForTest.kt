package br.com.mirabilis.daggerviperarchitecture.di.module

import br.com.mirabilis.daggerviperarchitecture.presenter.login.Login
import br.com.mirabilis.daggerviperarchitecture.presenter.main.Main
import br.com.mirabilis.daggerviperarchitecture.ui.login.LoginActivity
import br.com.mirabilis.daggerviperarchitecture.ui.main.MainActivity
import com.nhaarman.mockito_kotlin.mock
import dagger.Module
import dagger.Provides

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Module
class RouterModuleForTest {

    companion object {
        val mainRouter: Main.Router<MainActivity> = mock()
        val loginRouter: Login.Router<LoginActivity> = mock()
    }

    @Provides
    fun provideMainRouter(): Main.Router<MainActivity> {
        return mainRouter
    }

    @Provides
    fun provideLoginRouter(): Login.Router<LoginActivity> {
        return loginRouter
    }

}