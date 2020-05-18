package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] amounts) {
        int sum = 0;
        for (int amount : amounts) {
            sum += amount;
        }
        return sum;
    }


    public int averageAmountOfMonth(int[] amounts) {
        int sum = calculateSum(amounts);
        int arithmeticalMean = sum / amounts.length;
        return arithmeticalMean;
    }



    public int monthWithMaxSum(int[] amounts) {
        int maximum = amounts[0];
        int month = 0;
        for (int i=1; i < amounts.length; i++) {
            if (maximum <= amounts[i]) {
                maximum = amounts[i];
                month = i + 1;
            }
        }
        return month;
    }

    public int monthWithMinimumSum(int[] amounts) {
        int minimum = amounts[0];
        int month = 0;
        for (int i = 1; i < amounts.length; i++) {
            if (minimum >= amounts[i]) {
                minimum = amounts[i];
                month = i + 1;
            }
        }
        return month;

    }

    public int amountMonthsWithMinAverageSales(int[] amounts) {
        int arithmeticalMean = averageAmountOfMonth(amounts);
        int amountMonths = 0;
        for (int i = 0; i < amounts.length; i++) {
            if (arithmeticalMean > amounts[i]) {
                amountMonths++;

            }
        }
        return amountMonths;
    }
    public int amountMonthsWithMaxAverageSales(int[] amounts) {
        int arithmeticalMean = averageAmountOfMonth(amounts);
        int amountMonths = 0;
        for (int i = 0; i < amounts.length; i++) {
            if (arithmeticalMean < amounts[i])  {
                amountMonths++;

            }
        }
        return amountMonths;
    }

}

