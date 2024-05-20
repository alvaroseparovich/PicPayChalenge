package org.separovich.domain.domain.wallets

import java.util.Date
import java.util.UUID

data class WalletEntity(
    val id: UUID,
    val userId: UUID,
    val balance: Long,
    val type: WalletType,
    val createdAt: Date,
) {
    enum class WalletType {
        INDIVIDUAL,
        COMPANY,
    }
}
