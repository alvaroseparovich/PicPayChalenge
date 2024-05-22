package org.separovich.domain.domain.wallets

import java.util.Date
import java.util.UUID

data class WalletEntity(
    val id: UUID = UUID.randomUUID(),
    val userId: UUID,
    val balance: Long = 0,
    val type: WalletType,
    val createdAt: Date = Date(),
) {
    enum class WalletType {
        INDIVIDUAL,
        COMPANY,
    }
}
