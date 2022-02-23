//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println(maximumSubarray.maxSubArray(nums));

    }

    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int bestSum = currentSum;
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            bestSum = Math.max(currentSum, bestSum);
        }
        return bestSum;
    }
}
