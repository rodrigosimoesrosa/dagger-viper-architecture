package br.com.mirabilis.daggerviperarchitecture.repository.info

import br.com.mirabilis.daggerviperarchitecture.entity.Info
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-06-03.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class GetInfoRepository @Inject constructor() : InfoRepository.Get {

    override fun unregister() {
        //TODO "not implemented"
    }

    override fun getInfo(): Info {
        return Info("Sample")
    }

}
