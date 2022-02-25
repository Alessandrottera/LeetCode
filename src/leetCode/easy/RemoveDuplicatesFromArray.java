package leetCode.easy;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromArray removeDuplicatesFromArray = new RemoveDuplicatesFromArray();
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicatesFromArray.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[result]) {
                nums[++result] = nums[i];
            }
        }
        return result + 1;
    }
}
