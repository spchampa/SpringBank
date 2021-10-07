package org.sizzle.tutorials.kotlinapi.banks.controller

import org.sizzle.tutorials.kotlinapi.banks.model.Bank
import org.sizzle.tutorials.kotlinapi.banks.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService) {

    @GetMapping
    fun getBanks(): Collection<Bank> = service.getBanks()


}