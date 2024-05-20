package org.separovich.domain.domain.users

import java.util.Date
import java.util.UUID

data class UserEntity(
    val id: UUID,
    val name: String,
    val walletId: String,
    val document: String,
    val email: String,
    val telephone: String,
    val password: String,
    val createdAt: Date,
)
