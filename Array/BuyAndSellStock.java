package Array;
public class BuyAndSellStock {
    public static int buyAndSell(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit, profit);
            }else{
                buyPrice=prices[i];
            }

        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,3,4,6,5};
        System.out.println(buyAndSell(prices));
    }
    
}
