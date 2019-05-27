package br.com.mirabilis.daggerviperarchitecture.extension

import java.io.Serializable

/**
 * Created by rodrigosimoesrosa on 2019-05-21.
 * Copyright © 2019. All rights reserved.
 */
@Suppress("UNCHECKED_CAST")
inline fun <reified T : Any> List<*>.checkItemsAre() =
        if (all { it is T }) this as List<T>
        else null

@Suppress("UNCHECKED_CAST")
inline fun <reified T : Any> ArrayList<*>.checkItemsAre() =
        if (all { it is T }) this as ArrayList<T>
        else null

@Suppress("UNCHECKED_CAST")
inline fun <reified T> Array<*>.checkItemsAre() =
    if (all { it is T }) this as Array<T>
    else null

@Suppress("UNCHECKED_CAST")
fun <T : Serializable> Serializable.cast() = this as T

inline fun <reified T> cast(from: Any): T? = from as? T

inline fun <reified T> Array<*>.isOfType() = all { it is T }

const val ONLY_ONE = 1

inline fun <reified T : Any> List<T>.haveMany() = size > ONLY_ONE
inline fun <reified T : Any> ArrayList<T>.haveMany() = size > ONLY_ONE
inline fun <reified T : Any> Array<T>.haveMany() = size > ONLY_ONE

