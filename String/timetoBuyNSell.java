public class timetoBuyNSell{

    public int maxProfit(int[] prices) {   // non-static
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        timetoBuyNSell obj = new timetoBuyNSell();               // create object
        int[] prices = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices)); // ✅ works
    }
}
