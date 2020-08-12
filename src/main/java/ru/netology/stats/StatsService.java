package ru.netology.stats;

public class StatsService {

    public int calculateSumTotal(int[] sales) {
        int sumTotal = 0;
        for (long sale : sales) {
            sumTotal += sale;
        }
        return sumTotal;
    }

    public int calculateSumAverage(int[] sales) {
        int sumAverage = calculateSumTotal(sales) / 12;
        return sumAverage;
    }

    public int calculateSumMax(int[] sales) {
        int sumMax = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[sumMax]) {
                sumMax = i;
            }
        }
        return sumMax + 1;
    }
    public int calculateSumMin(int[] sales) {
        int sumMin = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[sumMin]) {
                sumMin = i;
            }
        }
        return sumMin + 1;
    }

    public int calculateSumsBelowAverage (int [] sales){
        int sumBelowAverage = calculateSumAverage(sales);
        int sum1 = 0;
        for (int i = 0; i < 12; i++) {
            if (sales[i] < sumBelowAverage) {
                sum1++;
            }
        }
        return sum1;
    }

    public int calculateSumsAboveAverage (int [] sales){
        int sumAboveAverage = calculateSumAverage(sales);
        int sum2 = 0;
        for (int i = 0; i < 12; i++) {
            if (sales[i] > sumAboveAverage) {
                sum2++;
            }
        }
        return sum2;
    }
}
