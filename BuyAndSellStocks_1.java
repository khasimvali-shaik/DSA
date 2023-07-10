public class BuyAndSellStocks_1 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(findMaxProfit(arr));
    }

    private static int findMaxProfit(int[] arr) {
        int buy = arr[0];
        int profit = 0;
        int maxProfit = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i] < buy){
                buy = arr[i];
            }
            else if(arr[i] > buy){
                profit = arr[i] - buy;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }
}
