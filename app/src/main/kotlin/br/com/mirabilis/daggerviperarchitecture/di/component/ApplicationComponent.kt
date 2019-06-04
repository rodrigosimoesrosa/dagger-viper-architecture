package br.com.mirabilis.daggerviperarchitecture.di.component

import android.app.Application
import br.com.mirabilis.daggerviperarchitecture.MyApplication
import br.com.mirabilis.daggerviperarchitecture.di.module.ActivitiesModule
import br.com.mirabilis.daggerviperarchitecture.di.module.InteractorModule
import br.com.mirabilis.daggerviperarchitecture.di.module.PresenterModule
import br.com.mirabilis.daggerviperarchitecture.di.module.RepositoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-29.
 * Copyright © 2019. All rights reserved.
 */
@Component(modules = [
    PresenterModule::class,
    RepositoryModule::class,
    InteractorModule::class,
    ActivitiesModule::class,
    AndroidSupportInjectionModule::class])
@Singleton
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

    fun inject(appController: MyApplication)
}
