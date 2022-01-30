package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(sales);
        assertEquals(actual, expected);

    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverage(sales);
        assertEquals(actual, expected);

    }

    @Test
    void shouldCalculateMaxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;

        int actual = service.findMaxSalesMonth(sales);
        assertEquals(actual, expected);

    }

    @Test
    void shouldFindMinMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findMinSalesMonth(sales);
        assertEquals(actual, expected);
    }

    @Test
    void shouldFindQuantityOfMonthWhenSalesLowerThanAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findQuantityOfMonthWhenSalesLowerThanAverage(sales);
        assertEquals(actual, expected);
    }

    @Test
    void shouldFindQuantityOfMonthWhenSalesHigherThanAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findQuantityOfMonthWhenSalesHigherThanAverage(sales);
        assertEquals(actual, expected);
    }

}