package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum / sales.length;

    }

    public int findMaxSalesMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale > sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMinSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findQuantityOfMonthWhenSalesLowerThanAverage(int[] sales) {
        int monthWhenSalesLowerThanAverage = 0;
        for (int sale : sales) {
            if (sale < calculateAverage(sales)) {
                monthWhenSalesLowerThanAverage = monthWhenSalesLowerThanAverage + 1;
            }
        }
        return monthWhenSalesLowerThanAverage;

    }

    public int findQuantityOfMonthWhenSalesHigherThanAverage(int[] sales) {
        int monthWhenSalesHigherThanAverage = 0;
        for (int sale : sales) {
            if (sale > calculateAverage(sales)) {
                monthWhenSalesHigherThanAverage++;
            }
        }
        return monthWhenSalesHigherThanAverage;

    }
}
