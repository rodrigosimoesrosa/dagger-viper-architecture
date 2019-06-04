package br.com.mirabilis.daggerviperarchitecture

import android.app.Activity
import android.app.Application
import br.com.mirabilis.daggerviperarchitecture.di.component.DaggerApplicationComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by rodrigosimoesrosa on 2019-05-29.
 * Copyright © 2019. All rights reserved.
 */
class MyApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): DispatchingAndroidInjector<Activity>? {
        return dispatchingAndroidInjector
    }

    override fun onCreate() {
        super.onCreate()
        DaggerApplicationComponent
            .builder()
            .application(this)
            .build()
            .inject(this)
    }
}
