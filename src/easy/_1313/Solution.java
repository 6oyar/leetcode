package easy._1313;

/**
 * 1313. Decompress Run-Length Encoded List
 * https://leetcode.com/problems/decompress-run-length-encoded-list/
 */
class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        decompressRLElist(nums);
    }

    public static int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            size += nums[i];
        }
        int[] res = new int[size];
        int k = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums[i]; j++) {
                res[k] = nums[i + 1];
                k++;
            }
        }
        return res;
    }
}
