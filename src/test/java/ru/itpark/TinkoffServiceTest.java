package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinkoffServiceTest {

    @Test
    void calculateCashbackWithZeroResults() {
        TinkoffService tinkoffService = new TinkoffService();
        int cashback = tinkoffService.calculateCashback(0, 0, 0);

        assertEquals(0, cashback);
    }

    @Test
    void calculateCashbackWithLowerBound() {
        TinkoffService tinkoffService = new TinkoffService();
        int cashback = tinkoffService.calculateCashback(100, 200, 250);

        assertEquals(86, cashback);
    }

    @Test
    void calculateCashbackWithUpperBound() {
        TinkoffService tinkoffService = new TinkoffService();
        int cashback = tinkoffService.calculateCashback(10_000, 20_000, 25_000);

        assertEquals(3_000, cashback);
    }
}