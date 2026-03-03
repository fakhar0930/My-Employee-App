package Package3;

public class StockProblem {

    public static String stockProblem(int [] prices){
        int buyPosition=0;
        int sellPosition=0;
        int profit=0;

        for (int i=0;i< prices.length;i++){
            for (int j=i+1;j<prices.length;j++){
                if (prices[j]-prices[i]>profit){
                    buyPosition=i;
                    sellPosition=j;
                    profit=prices[j]-prices[i];
                }
            }
        }
        buyPosition+=1;
        sellPosition+=1;

        return "Buy On " + buyPosition + " day And Sell On " + sellPosition + " day For A MAximim profit of " + profit;

    }


    public static void main(String[] args) {


//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 5.


        int [] prices = {7,5,1,6,4,8,3};

        System.out.println(stockProblem(prices));

    }
}
