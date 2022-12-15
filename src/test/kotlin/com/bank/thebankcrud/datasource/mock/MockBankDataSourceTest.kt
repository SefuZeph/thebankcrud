package com.bank.thebankcrud.datasource.mock

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockBankDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
        // given

        // when
        var banks = mockBankDataSource.retrieveBanks()

        // then
        Assertions.assertThat(banks.size).isGreaterThanOrEqualTo(3)

    }

    @Test
    fun `should provide some mock data`() {
        // when
        val banks = mockBankDataSource.retrieveBanks()

        Assertions.assertThat(banks).anyMatch {
            it.accountNumber.isNotBlank()
        }

        Assertions.assertThat(banks).anyMatch {
            it.trust != 0.0
        }

        Assertions.assertThat(banks).anyMatch {
            it.transactionFee != 0
        }

    }
}