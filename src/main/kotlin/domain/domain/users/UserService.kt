package org.separovich.domain.domain.users

import org.separovich.domain.domain.users.UserEntity.DocumentType
import org.separovich.domain.domain.wallets.WalletEntity
import org.separovich.domain.interfaces.IUserRepository
import java.util.Date
import java.util.UUID

class UserService(
    userRepository: IUserRepository,
) {
    val userRepository = userRepository

    fun create(
        name: String,
        document: String,
        email: String,
        telephone: String,
        password: String,
        walletType: WalletEntity.WalletType?,
    ): UserEntity {
        val id = UUID.randomUUID()

        val userWalletType: WalletEntity.WalletType =
            walletType ?: DocumentType.toWalletType(getDocumentType(document))

        val wallet =
            WalletEntity(userId = id, balance = 0, type = userWalletType)

        return UserEntity(
            id,
            name,
            wallet.id,
            wallet,
            document,
            getDocumentType(document),
            email,
            telephone,
            password,
            Date(),
        )
    }

    fun save(user: UserEntity): UserEntity {
        userRepository.save(user)
        return user
    }

    private fun getDocumentType(document: String): DocumentType = if (document.length > 11) DocumentType.CNPJ else DocumentType.CPF
}
