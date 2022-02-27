//Given two binary strings a and b, return their sum as a binary string.
package leetCode.easy;

public class AddBinary {

    public static void main(String args[]){
        String a = "11";
        String b = "1";
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.addBinarySolution(a, b));
    }


    public String addBinarySolution(String a, String b) {
        // I create result name string and initially it is empuyt end in the end I'm going to return it as our answer
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1; // i create i variable for string and I have to start adding from right to left
        int j = b.length() - 1; // similar variable j for string b
        int carry = 0;
        //


        return null;
    }
}
