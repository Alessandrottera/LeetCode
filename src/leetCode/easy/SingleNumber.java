package leetCode.easy;/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Input: nums = [2,2,1]
Output: 1
*/

import java.util.HashSet;
import java.util.Iterator;

public class SingleNumber {

    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 4, 1};

        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(nums));
    }


    private int singleNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i))
                set.remove(i);
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }


    //solution: usando un hashset non posso avere elementi uguali dentro questo set, il metodo add ritorna falso.
    // se ritorna falso entra nell'if e rimuove dal set il numero gia' presente sul set
}
