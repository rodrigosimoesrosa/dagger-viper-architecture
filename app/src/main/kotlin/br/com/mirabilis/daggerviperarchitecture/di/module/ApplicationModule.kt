package br.com.mirabilis.daggerviperarchitecture.di.module

import android.app.Application
import br.com.mirabilis.daggerviperarchitecture.MyApplication
import br.com.mirabilis.daggerviperarchitecture.di.scope.PerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-29.
 * Copyright © 2019. All rights reserved.
 */
@Module
class ApplicationModule(private val myApplication: MyApplication) {

    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application {
        return myApplication
    }
}