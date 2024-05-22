package org.separovich.domain.domain.users

import org.separovich.domain.domain.wallets.WalletEntity
import java.util.Date
import java.util.UUID

data class UserEntity(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val walletId: UUID,
    val wallet: WalletEntity,
    val document: String,
    val documentType: DocumentType,
    val email: String,
    val telephone: String?,
    val password: String,
    val createdAt: Date,
) {
    enum class DocumentType {
        CPF,
        CNPJ,
        ;

        companion object {
            fun toWalletType(type: DocumentType): WalletEntity.WalletType {
                return when (type) {
                    CPF -> WalletEntity.WalletType.INDIVIDUAL
                    CNPJ -> WalletEntity.WalletType.COMPANY
                }
            }
        }
    }
}
