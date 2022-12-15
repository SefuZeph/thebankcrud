package com.bank.thebankcrud.datasource.mock

import com.bank.thebankcrud.datasource.BankDataSource
import com.bank.thebankcrud.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
            Bank("12345", 3.14, 17),
            Bank("1011", 34.14, 0),
            Bank("4564", 0.0, 100),
    )

    override fun retrieveBanks(): Collection<Bank> = banks

}