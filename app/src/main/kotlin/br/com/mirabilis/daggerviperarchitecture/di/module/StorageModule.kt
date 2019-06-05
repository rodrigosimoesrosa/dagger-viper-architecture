package br.com.mirabilis.daggerviperarchitecture.di.module

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import br.com.mirabilis.daggerviperarchitecture.storage.Storage
import dagger.Module
import dagger.Provides

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
@Module
class StorageModule {

    @Provides
    fun provideSharePreferences(application: Application): SharedPreferences {
        return application.getSharedPreferences(Storage.NAME, Context.MODE_PRIVATE)
    }

}