package br.com.mirabilis.daggerviperarchitecture.base.ui

import android.os.Bundle
import android.os.Parcelable
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.mirabilis.daggerviperarchitecture.extension.cast
import br.com.mirabilis.daggerviperarchitecture.extension.checkItemsAre
import java.io.Serializable

/**
 * Created by rodrigosimoesrosa on 2019-05-21.
 * Copyright © 2019. All rights reserved.
 */
abstract class BaseFragment : Fragment() {

    abstract fun getName(): String
    abstract fun getLayout(): Int

    object Values {
        const val PARCELABLE = "parcelable"
        const val SERIALIZABLE = "serializable"
        const val PARCELABLE_LIST = "parcelable_list"
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(getLayout(), container, false)
    }

    @Suppress("UNCHECKED_CAST")
    protected fun <A : ActivityAction> getActions(): A {
        return activity as A
    }

    protected fun setData(value: Any,
                          key: String? = null) {
        val bundle = arguments ?: Bundle()
        when (value) {
            is Serializable -> bundle.putSerializable(key ?: Values.SERIALIZABLE, value)
            is Parcelable -> bundle.putParcelable(key ?: Values.PARCELABLE, value)
            is ArrayList<*> -> bundle.putParcelableArrayList(key ?: Values.PARCELABLE_LIST,
                    value.checkItemsAre())
        }
        arguments = bundle
    }

    protected fun <S : Serializable> getSerializable(key: String? = null): S {
        return arguments?.getSerializable(key ?: Values.SERIALIZABLE)!!.cast()
    }

    protected fun <P : Parcelable> getParcelable(key: String? = null): P? {
        return arguments?.getParcelable(key ?: Values.PARCELABLE)
    }

    protected fun <P : Parcelable> getParcelableList(key: String? = null): ArrayList<P> {
        return arguments?.getParcelableArrayList<P>(key ?: Values.PARCELABLE_LIST)!!
    }

    fun showSnack(view: View?, msg: String) {
        if (activity is BaseActivity) {
            (activity as BaseActivity).showSnack(view, msg)
        }
    }
}
