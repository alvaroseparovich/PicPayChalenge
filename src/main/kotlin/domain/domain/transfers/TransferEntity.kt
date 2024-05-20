package org.separovich.domain.domain.transfers

import java.util.Date
import java.util.UUID

data class TransferEntity(
    val id: UUID,
    val status: TransferStatus,
    val value: Long,
    val payer: UUID,
    val payee: UUID,
    val createdAt: Date,
) {
    enum class TransferStatus {
        TRANSFERRED,
        DENIED,
        UNDEFINED,
    }
}
