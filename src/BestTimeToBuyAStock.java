/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/

public class BestTimeToBuyAStock {

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        BestTimeToBuyAStock bestTimeToBuyAStock = new BestTimeToBuyAStock();
        System.out.println(bestTimeToBuyAStock.maxProfit(nums));
    }

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int result = 0;

        if (prices == null || prices.length <= 1) {
            result = 0;
        } else {
            for (int i = 1; i < prices.length; i++) {
                result = Math.max(result, prices[i] - min);
                min = Math.min(min, prices[i]);
            }
        }
        return result;
    }
}
