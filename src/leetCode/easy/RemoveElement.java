package leetCode.easy;

/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.
Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
Input: nums = [3,2,2,3], val = 3
       Output: 2, nums = [2,2,_,_]
 */
public class RemoveElement {
    public static void main(String[] args){
        int val = 3;
        int[] nums = {3,2,2,3};
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(nums, val));
    }

    public int removeElement(int[] nums, int val) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
