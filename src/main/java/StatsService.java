

public class StatsService {

    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverageMonths(long[] sales) {
        long average = average(sales);
        int belowAverageCount = 0;
        for (long sale : sales) {
            if (sale < average) {
                belowAverageCount++;
            }
        }
        return belowAverageCount;
    }

    public int aboveAverageMonths(long[] sales) {
        long average = average(sales);
        int aboveAverageCount = 0;
        for (long sale : sales) {
            if (sale > average) {
                aboveAverageCount++;
            }
        }
        return aboveAverageCount;
    }
}
