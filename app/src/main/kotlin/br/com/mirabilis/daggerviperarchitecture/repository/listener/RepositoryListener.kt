package br.com.mirabilis.daggerviperarchitecture.repository.listener

/**
 * Created by rodrigosimoesrosa on 2019-06-04.
 * Copyright © 2019. All rights reserved.
 */
interface RepositoryListener<TYPE : Any> {

    fun onResult(data : TYPE?)
    fun onFailure(throwable: Throwable?)

}
