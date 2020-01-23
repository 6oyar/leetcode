package easy._1281;

/**
 * 1281. Subtract the Product and Sum of Digits of an Integer
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
public class Solution {

    public static void main(String[] args) {
        subtractProductAndSum(4421);
    }

    public static int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;

        while (n / 10 != 0) {
            sum += n % 10;
            prod *= n % 10;
            n = n / 10;
        }
        sum += n % 10;
        prod *= n % 10;

        return prod - sum;
    }
}
