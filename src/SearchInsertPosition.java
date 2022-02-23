/*Given a sorted array of distinct integers and a target value,
return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.*/

public class SearchInsertPosition {

    public static void main(String args[]) {
        int[] nums = {1, 3, 5, 7};
        int target = 8;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.searchInsert(nums, target));
    }

/*    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
            } else if (nums[i] != target && (nums[i] < target && nums.length == i + 1)) {
                index = i + 1;
            } else if (nums[i] != target && (nums[i] < target && nums[i + 1] > target)) {
                index = i + 1;
            }
        }
        return index;
    }

    this is a bruteforce solution, the next one is way more efficient

    */

    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= target)
                return i;
        }
        return n;
    }
}
