package ru.itpark;

public class TinkoffService {
    public int calculateCashback(int ordinaryAmount, int increasedAmount, int specialOffersAmount) {
        int result;
        int ordinaryPercent = 1;
        int increasedPercent = 5;
        int specialOffersPercent = 30;
        int upperBound = 3_000;

        result = (ordinaryAmount * ordinaryPercent + increasedAmount * increasedPercent + specialOffersAmount * specialOffersPercent) / 100;
        if (result > upperBound) {
            result = upperBound;
        }
        return result;
    }
}

