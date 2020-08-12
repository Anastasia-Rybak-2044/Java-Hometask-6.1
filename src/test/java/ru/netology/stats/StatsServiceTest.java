package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

@Test
void CalculateSumTotal() {
    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 180;
    int actual = service.calculateSumTotal(sales);
    assertEquals(expected, actual);
    }

@Test
void CalculateSumAverage() {
    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected = 15;
    int actual = service.calculateSumAverage(sales);
    assertEquals(expected, actual);
    }

    @Test
    void CalculateSumMax() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateSumMax(sales);
        assertEquals(expected, actual);
    }
    @Test
    void CalculateSumMin() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateSumMin(sales);
        assertEquals(expected, actual);
    }
    @Test
    void calculateSumsBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateSumsBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateSumsAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateSumsAboveAverage(sales);
        assertEquals(expected, actual);
    }
}



