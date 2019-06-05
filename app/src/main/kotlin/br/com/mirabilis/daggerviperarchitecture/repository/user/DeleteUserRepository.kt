package br.com.mirabilis.daggerviperarchitecture.repository.user

import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class DeleteUserRepository @Inject constructor() : UserRepository.Delete {

    @Inject lateinit var preference: SharedPreferences

    override fun deleteUser(): Boolean {
        preference.edit().remove(UserRepository.USER).apply()
        return true
    }

    override fun unregister() {}

}
