package leetCode.easy;
/*
Given a 0-indexed integer array nums, return the number of distinct quadruplets (a, b, c, d) such that:
        nums[a] + nums[b] + nums[c] == nums[d], and
        a < b < c < d

        Input: nums = [3,3,6,4,5]
                Output: 0
                Explanation: There are no such quadruplets in [3,3,6,4,5].

        Input: nums = [1,1,1,3,5]
                Output: 4
                Explanation: The 4 quadruplets that satisfy the requirement are:
                - (0, 1, 2, 3): 1 + 1 + 1 == 3
                - (0, 1, 3, 4): 1 + 1 + 3 == 5
                - (0, 2, 3, 4): 1 + 1 + 3 == 5
                - (1, 2, 3, 4): 1 + 1 + 3 == 5
*/

public class CountSpecialQuadruplets {

    public static void main(String[] args) {
        CountSpecialQuadruplets countSpecialQuadruplets = new CountSpecialQuadruplets();
        int[] nums = {1,1,1,3,5};
        System.out.println(countSpecialQuadruplets.countQuadruplets(nums));
    }

    public int countQuadruplets(int[] nums) {
        int count = 0, n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (nums[l] == nums[i] + nums[j] + nums[k]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
