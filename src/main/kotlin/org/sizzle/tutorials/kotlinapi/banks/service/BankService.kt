package org.sizzle.tutorials.kotlinapi.banks.service

import org.sizzle.tutorials.kotlinapi.banks.datasource.BankDataSource
import org.sizzle.tutorials.kotlinapi.banks.model.Bank
import org.springframework.stereotype.Service


@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> {
        return dataSource.retrieveBanks()
    }

}