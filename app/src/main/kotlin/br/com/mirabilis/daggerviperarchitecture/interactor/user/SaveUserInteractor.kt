package br.com.mirabilis.daggerviperarchitecture.interactor.user

import br.com.mirabilis.daggerviperarchitecture.entity.business.User
import br.com.mirabilis.daggerviperarchitecture.repository.user.UserRepository
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class SaveUserInteractor @Inject constructor(): UserInteractor.Save {

    @Inject lateinit var repository: UserRepository.Save

    override fun saveUser(user: User): Boolean {
        return repository.saveUser(user)
    }

}
