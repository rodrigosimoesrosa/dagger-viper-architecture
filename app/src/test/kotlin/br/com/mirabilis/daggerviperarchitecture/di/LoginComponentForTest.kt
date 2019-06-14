package br.com.mirabilis.daggerviperarchitecture.di

import br.com.mirabilis.daggerviperarchitecture.di.module.InteractorModuleForTest
import br.com.mirabilis.daggerviperarchitecture.di.module.PresenterModuleForTest
import br.com.mirabilis.daggerviperarchitecture.di.module.RouterModuleForTest
import br.com.mirabilis.daggerviperarchitecture.presenter.LoginPresenterTest
import dagger.Component
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-06-14.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
@Component(modules = [
    PresenterModuleForTest::class,
    RouterModuleForTest::class,
    InteractorModuleForTest::class])
interface LoginComponentForTest {

    fun inject(presenter: LoginPresenterTest)

}
