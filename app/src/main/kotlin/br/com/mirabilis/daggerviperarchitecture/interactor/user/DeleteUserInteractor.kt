package br.com.mirabilis.daggerviperarchitecture.interactor.user

import br.com.mirabilis.daggerviperarchitecture.repository.user.UserRepository
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by rodrigosimoesrosa on 2019-05-27.
 * Copyright © 2019. All rights reserved.
 */
@Singleton
class DeleteUserInteractor @Inject constructor(): UserInteractor.Delete {

    @Inject lateinit var repository: UserRepository.Delete

    override fun deleteUser(): Boolean {
        return repository.deleteUser()
    }

}
