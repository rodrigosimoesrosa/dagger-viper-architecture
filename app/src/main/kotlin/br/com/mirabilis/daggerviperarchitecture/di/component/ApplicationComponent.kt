package br.com.mirabilis.daggerviperarchitecture.di.component

import android.app.Application
import br.com.mirabilis.daggerviperarchitecture.MyApplication
import br.com.mirabilis.daggerviperarchitecture.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-29.
 * Copyright © 2019. All rights reserved.
 */
@Component(modules = [
    RouterModule::class,
    StorageModule::class,
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

        @BindsInstance
        fun storageModule(storageModule: StorageModule): Builder

        fun build(): ApplicationComponent
    }

    fun inject(appController: MyApplication)
}
