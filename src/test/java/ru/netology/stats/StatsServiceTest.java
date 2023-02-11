package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void testOfAmountOfSales() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedSum = 180;
        double actualSum = service.amountOfSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testOfAverageSales() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedAvrg = 15;
        double actualAvgr = service.averageSales(sales);
        Assertions.assertEquals(expectedAvrg, actualAvgr);

    }

    @Test
    public void testOfMaxSales() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedMaxM = 8;
        double actualMaxM = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxM, actualMaxM);

    }

    @Test
    public void testOfMinSales() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedMinM = 9;
        double actualMinM = service.minSales(sales);
        Assertions.assertEquals(expectedMinM, actualMinM);
    }

    @Test
    public void testOfGetNumMothsBelowAverage() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedNumBelow = 5;
        double actualNumBelow = service.getNumMothsBelowAverage(sales);
        Assertions.assertEquals(expectedNumBelow, actualNumBelow);
    }

    @Test
    public void testOfGetNumMonthsAboveAverage() {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedNumAbove = 5;
        double actualNumBelow = service.getNumMonthsAboveAverage(sales);
        Assertions.assertEquals(expectedNumAbove, actualNumBelow);
    }
}
