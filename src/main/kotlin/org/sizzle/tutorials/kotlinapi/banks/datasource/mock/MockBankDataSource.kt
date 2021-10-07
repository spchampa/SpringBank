package org.sizzle.tutorials.kotlinapi.banks.datasource.mock

import org.sizzle.tutorials.kotlinapi.banks.datasource.BankDataSource
import org.sizzle.tutorials.kotlinapi.banks.model.Bank
import org.springframework.stereotype.Repository


@Repository
class MockBankDataSource : BankDataSource{

    val banks = listOf(
        Bank("1234", 3.14, 17),
        Bank("1222", 5.22, 0),
        Bank("1999", 3.00, 3),
    )


    override fun retrieveBanks(): Collection<Bank> {
        return banks
    }
}