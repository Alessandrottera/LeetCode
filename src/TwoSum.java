//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String args[]){

        int[] nums = {2,7,11,15};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        int[] solutions = twoSum.twoSum(nums, target);
        System.out.println(twoSum.twoSum(nums, target));
    }


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> solution = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int difference = target - nums[i];
            if(solution.containsKey(difference)){
                return new int[] {solution.get(difference), i};
            }
            solution.put(nums[i], i);
        }
        return null;
    }
}
// quando entro nel ciclo for del metodo vado a calcolare la differenza tra il mio target ed il valore preso in considerazione dell'array nums.
// quella differenza deve essere trovata all'interno della mappa solutions, altrimenti si aggiunge indice e valore alla mappa. Si ripete il giro fino a quando non si trova il valore nella mappa.
// A quel punto si fa ritornare nell'array l'indice dei valori che mi servono.