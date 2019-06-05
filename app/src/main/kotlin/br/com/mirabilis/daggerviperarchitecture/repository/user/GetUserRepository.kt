package br.com.mirabilis.daggerviperarchitecture.repository.user

import android.content.SharedPreferences
import br.com.mirabilis.daggerviperarchitecture.entity.business.User
import br.com.mirabilis.daggerviperarchitecture.extension.toSerializedObject
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class GetUserRepository @Inject constructor() : UserRepository.Get {

    @Inject lateinit var preferences: SharedPreferences

    override fun unregister() {}

    override fun getUser(): User? {
        val userString = preferences.getString(UserRepository.USER, null) ?: return null
        return userString.toSerializedObject()
    }

}
