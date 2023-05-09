package Arrays.leedcode;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int[] prices1 = new int[]{2, 4, 1};
        int[] prices2 = new int[]{3, 2, 6, 5, 0, 3, 4, 8, 5, 1, 7, 4, 9, 3, 5, 6, 2, 8, 4, 5, 9, 6, 1, 5, 2, 5, 8, 7,
                5, 9, 3, 3, 12, 5, 9, 6, 1,};
        System.out.println(maxProfitV3(prices2));
//        maxProfit(prices);
//        System.out.println(maxProfit(prices2));
    }

    /**
     * в одном цикле, сперва находим минимум, и сразу смотрим на (мах = 0 или текущая - мин)
     *
     * @param prices
     * @return
     */
    public static int maxProfitV3(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            min = min(min, prices[i]); // нашли минимум
            maxProfit = max(maxProfit, prices[i] - min); // maxi
        }
        return maxProfit;
    }
}
