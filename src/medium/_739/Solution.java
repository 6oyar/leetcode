package medium._739;

import java.util.Stack;

/**
 * 739. Daily Temperatures
 * https://leetcode.com/problems/daily-temperatures/
 */
public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] t = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        s.dailyTemperatures(t);
    }

    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        Stack<Integer> indexes = new Stack<>();

        for (int i = 0; i < res.length; i++) {
            while (!indexes.isEmpty() && T[indexes.peek()] < T[i]) {
                res[indexes.peek()] = i - indexes.pop();
            }
            indexes.push(i);
        }

        return res;
    }
}
