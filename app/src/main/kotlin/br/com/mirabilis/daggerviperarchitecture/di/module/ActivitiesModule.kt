package br.com.mirabilis.daggerviperarchitecture.di.module

import br.com.mirabilis.daggerviperarchitecture.ui.login.LoginActivity
import br.com.mirabilis.daggerviperarchitecture.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by rodrigosimoesrosa on 2019-05-21.
 * Copyright © 2019. All rights reserved.
 */
@Module
interface ActivitiesModule {

    @ContributesAndroidInjector
    fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector
    fun contributeSecondActivity(): LoginActivity
}