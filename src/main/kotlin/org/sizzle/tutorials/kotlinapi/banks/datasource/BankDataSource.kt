package org.sizzle.tutorials.kotlinapi.banks.datasource

import org.sizzle.tutorials.kotlinapi.banks.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}