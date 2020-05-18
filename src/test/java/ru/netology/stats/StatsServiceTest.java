package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(amounts);
        assertEquals(expected, actual);

    }

    @Test
    void averageAmountOfMonth() {
        StatsService service = new StatsService();
        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageAmountOfMonth(amounts);
        assertEquals(expected, actual);

    }
    @Test
    void monthWithMaxSum() {
        StatsService service = new StatsService();
        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.monthWithMaxSum(amounts);
        assertEquals(expected, actual);
    }

    @Test
    void monthWithMinimumSum() {
        StatsService service = new StatsService();
        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.monthWithMinimumSum(amounts);
        assertEquals(expected, actual);
    }

    @Test
    void amountMonthsWithMinAverageSales() {
        StatsService service = new StatsService();
        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.amountMonthsWithMinAverageSales(amounts);
        assertEquals(expected, actual);
    }
    @Test
    void amountMonthsWithMaxAverageSales() {
        StatsService service = new StatsService();
        int[] amounts = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.amountMonthsWithMaxAverageSales(amounts);
        assertEquals(expected, actual);
    }

}

