package com.bank.thebankcrud.datasource

import com.bank.thebankcrud.model.Bank

interface BankDataSource {
    fun retrieveBanks():Collection<Bank>
}