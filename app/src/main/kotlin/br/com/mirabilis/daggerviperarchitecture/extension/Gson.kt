package br.com.mirabilis.daggerviperarchitecture.extension

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * Created by rodrigosimoesrosa on 2019-06-05.
 * Copyright © 2019. All rights reserved.
 */

inline fun <reified T> Gson.fromJson(json: String) = this.fromJson<T>(json, object: TypeToken<T>() {}.type)

inline fun <reified T> String.toSerializedObject(): T {
    return Gson().fromJson<T>(this)
}

fun Any.toGson(): String {
    return Gson().toJson(this)
}