package leetCode.easy;

/*
Given an array of integers nums which is sorted in ascending order,
and an integer target, write a function to search target in nums.
If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
*/

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(nums, target));
    }

    public int search(int[] nums, int target) {

        int solution = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                solution = i;
                break;
            }
        }
        return solution;
    }
}
