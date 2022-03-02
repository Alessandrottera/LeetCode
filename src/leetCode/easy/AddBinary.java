//Given two binary strings a and b, return their sum as a binary string.
package leetCode.easy;

import java.math.BigInteger;

public class AddBinary {

    public static void main(String args[]){
        String a = "11";
        String b = "11";
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinarySolution(a, b));
    }

    public String addBinarySolution(String a, String b) {
        BigInteger binary1 = new BigInteger(a, 2);
        BigInteger binary2 = new BigInteger(b, 2);
        return (binary1.add(binary2)).toString(2);
    }
}
