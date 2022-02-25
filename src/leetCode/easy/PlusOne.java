package leetCode.easy;
/*
You are given a large integer represented as an integer array digits,
where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
*/
public class PlusOne {

    public static void main(String[] args) {
        int[] num = {9,8,7,6,5,4,3,2,1,0};
        PlusOne plusOne = new PlusOne();
        System.out.println(plusOne.plusOne(num));
    }

    public int[] plusOne(int[] digits) {

        int[] plusOne = new int[digits.length + 1];
        int carry = 0, sum = 0;

        sum = digits[digits.length - 1] + 1;
        if (sum == 10)
            carry = 1;

        plusOne[plusOne.length - 1] = sum % 10;

        for (int i = digits.length - 2; i >= 0; i--) {
            sum = digits[i] + carry;
            carry = sum / 10;
            plusOne[i + 1] = sum % 10;
        }

        if (carry == 1)
            plusOne[0] = 1;
        else {
            int[] plusOneReduced = new int[digits.length];
            for (int i = 0; i < plusOneReduced.length; i++) {
                plusOneReduced[i] = plusOne[i + 1];
            }
            return plusOneReduced;
        }

        return plusOne;
    }
}
