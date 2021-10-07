package org.sizzle.tutorials.kotlinapi.banks.model

data class Bank(
    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int
)