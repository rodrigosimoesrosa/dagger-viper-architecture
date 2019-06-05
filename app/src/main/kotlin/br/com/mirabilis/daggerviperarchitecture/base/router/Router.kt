package br.com.mirabilis.daggerviperarchitecture.base.router

import android.app.Activity

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
interface Router<ACTIVITY : Activity> {

    var activity: ACTIVITY?

    fun attachActivity(view: ACTIVITY) {
        this.activity = view
    }

    fun unregister() {
        this.activity = null
    }

}
