package org.separovich.domain.domain.transfers

import org.separovich.domain.domain.users.UserEntity
import java.util.Date
import java.util.UUID

data class TransferEntity(
    val id: UUID,
    val status: TransferStatus,
    val value: Long,
    val payerId: UUID,
    val payer: UserEntity,
    val payeeId: UUID,
    val payee: UserEntity,
    val createdAt: Date,
) {
    enum class TransferStatus {
        TRANSFERRED,
        DENIED,
        UNDEFINED,
    }
}
