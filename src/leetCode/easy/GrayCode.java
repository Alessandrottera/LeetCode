package leetCode.easy;

/*
An n-bit gray code sequence is a sequence of 2n integers where:
Every integer is in the inclusive range [0, 2n - 1],
The first integer is 0,
An integer appears no more than once in the sequence,
The binary representation of every pair of adjacent integers differs by exactly one bit, and
The binary representation of the first and last integers differs by exactly one bit.
Given an integer n, return any valid n-bit gray code sequence.
*/


// WORK IN PROGRESS, STILL DON'T UNDERSTAND GRAY CODE SEQUENCE

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

public static void main(String[] args){
    int a = 10;
    GrayCode grayCode = new GrayCode();
    grayCode.grayCode(2);
}


    public List<Integer> grayCode(int n) {

        int listLength = (int) Math.pow(2, n);
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < listLength; i++){
            result.add(Integer.parseInt(Integer.toBinaryString(i)));
        }

        return result;
    }
}
