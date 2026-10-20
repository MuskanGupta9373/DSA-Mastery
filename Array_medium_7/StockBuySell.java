package Array_medium_7;

public class StockBuySell {
    static int maxProfit(int[] prices) {

        int mini = prices[0];  //mini stores the lowest price seen so far.
        int profit = 0;

        for (int i = 1; i < prices.length; i++) { //loop through prices and i=1 bcoz i=0 means prices[0] is already being used as our initial buying price.

            int currentProfit = prices[i] - mini; //calculate todays profit

            if (currentProfit > profit) {
                profit = currentProfit;
            }

            if (prices[i] < mini) { //updating minimum price if todday's price is minupdate rpice
                mini = prices[i];
            }
        }

        return profit;
    }
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int answer = maxProfit(prices);

        System.out.println("Maximum Profit: " + answer);
    }
}
