package hackerrank;

public class MarkAndToys {

    public static void main(String[] args) {

        int[] prices = {1, 12, 5, 111, 200, 1000, 10};
        maximumToys(prices, 50);

        int[] prices2 = {3, 7, 2, 9, 4};
        maximumToys(prices2, 15);
    }

    static int maximumToys(int[] prices, int k) {
        int toysBought = 0;
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            if (sum == 0) {
                sum += prices[i];
            }
            if (prices[i] < sum) {
                toysBought++;
                sum += prices[i];
            }
        }
        System.out.println(toysBought);
        return toysBought;
    }

}
