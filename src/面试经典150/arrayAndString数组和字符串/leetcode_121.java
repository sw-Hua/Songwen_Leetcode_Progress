package 面试经典150.arrayAndString数组和字符串;

public class leetcode_121 {
    public static void main(String[] args) {
        int [] num = {7,1,5,3,6,4};
    }
}
class Solution121{
    int  bestOpportunityBuySellStock(int [] prices){
        //
        if(prices != null || prices.length == 0){
            return 0;
        }

        // 设置最大利润
        int maxProfit = 0;
        // 到目前为止的最低价格
        int lowestPrice = prices[0];

        for (int price : prices) {

            // 当前价格比之前的还低，就更新最低价格
            if (price < lowestPrice ){
                lowestPrice = price;
            } else if (price - lowestPrice > maxProfit) {
                //否则，计算当前价格和最低价格的差值，看看是否能更新最高利润
                maxProfit = price - lowestPrice;
            }
        }
        return maxProfit;
    }
}