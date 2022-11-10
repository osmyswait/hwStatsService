package ru.netology.stats;

public class StatsService {

    public long getAmountSales(long[] sales) {
        long AmountSales = 0;
        for (long sale : sales) {
            AmountSales += sale;
        }
        return AmountSales;
    }

    public long getMiddleAmountSales(long[] sales) {
        long MiddleAmountSales;
        MiddleAmountSales = getAmountSales(sales) / 12;
        return MiddleAmountSales;
    }

    public int getMaxMonth(long[] sales) {
        int maxMonth = 0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long getMinNumberOfMonth(long[] sales) {
        int number = 0;
        long MiddleAmountSales = getMiddleAmountSales(sales);
        for (long sale: sales) {
            if (sale < MiddleAmountSales) {
                number++;
            }
        }
        return number;
    }

    public long getMaxNumberOfMonth(long[] sales) {
        int number = 0;
        long MiddleAmountSales = getMiddleAmountSales(sales);
        for (long sale: sales) {
            if (sale > MiddleAmountSales) {
                number++;
            }
        }
        return number;
    }
}





