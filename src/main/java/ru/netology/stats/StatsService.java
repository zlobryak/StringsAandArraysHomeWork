package ru.netology.stats;

public class StatsService {
    public double amountOfSales(double[] sales) {
        double amount = 0;
        for (double sale : sales) amount = amount + sale;
        // amount переменная для суммы продаж за весь период
        // sale - продажи в рассматриваемом месяце
        return amount;
    }

    public double averageSales(double[] sales) {
        return amountOfSales(sales) / sales.length; // среднее значение продаж за весь период
    }

    public double maxSales(double[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (double sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }


    public double minSales(double[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (double sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
        public double getNumMothsBelowAverage(double[] sales) {
        int daysBelowAverage = 0;
        double avgr = averageSales(sales);
        for (double sale : sales) {
            if (sale < avgr) {
                daysBelowAverage++;
                // daysBelowAverage переменная для корличества месяцев ниже среднего
                // sale - продажи в рассматриваемом месяце
            }
        }
        return daysBelowAverage;
    }

    public double getNumMonthsAboveAverage(double[] sales) {
        int daysAboveAverage = 0;
        double avgr = averageSales(sales);
        for (double sale : sales) {
            if (sale > avgr) {
                daysAboveAverage++;
                // daysAboveAverage переменная для количества месяцев выше среднего
                // sale - продажи в рассматриваемом месяце
            }
        }
        return daysAboveAverage;
    }

}
