package ru.netology.statistic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void findMax() {
            StatisticService service = new StatisticService();

            long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
            long expected = 12;
            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        StatisticService service = new StatisticService();
        long[] incomesInBillions = {1, 5, 8, 4, 5, 3, 8, 6, 10, 9, 3};
        long expected = 10;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }


}