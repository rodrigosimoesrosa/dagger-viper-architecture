package br.com.mirabilis.daggerviperarchitecture.interactor.info

import br.com.mirabilis.daggerviperarchitecture.entity.Info
import br.com.mirabilis.daggerviperarchitecture.repository.info.InfoRepository
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class GetInfoInteractor @Inject constructor() : InfoInteractor.Get {

    @Inject lateinit var repository: InfoRepository.Get

    override fun getInfo(): Info {
        return repository.getInfo()
    }

}
