package org.separovich.domain.domain.transfers

import org.separovich.domain.domain.wallets.WalletEntity
import org.separovich.domain.interfaces.ITransferRepository

class TransferService(
    trasferRepository: ITransferRepository,
) {
    fun transfer(
        value: Long,
        payerWallet: WalletEntity,
        payeeWallet: WalletEntity,
    ) {
        // TODO: payer Has money
        // TODO: external Validation

        // Transaction
        // TODO: Remove Value from Payer
        // TODO: Add value to payee
        // TODO: save Transfer
        // Commit
        // TODO: Notification
    }
}
