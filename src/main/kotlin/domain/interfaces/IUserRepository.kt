package org.separovich.domain.interfaces

import org.separovich.domain.domain.users.UserEntity

interface IUserRepository {
    fun save(user: UserEntity)
}
