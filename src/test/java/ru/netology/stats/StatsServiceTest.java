package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldAmountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedDay = 180;
        long actualDay = service.getAmountSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldMiddleAmountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedDay = 15;
        long actualDay = service.getMiddleAmountSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldMaxMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedDay = 8;
        long actualDay = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedDay = 9;
        long actualDay = service.getMinMonth(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldMinNumberOfMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedDay = 5;
        long actualDay = service.getMinNumberOfMonth(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldMaxNumberOfMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedDay = 5;
        long actualDay = service.getMaxNumberOfMonth(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}