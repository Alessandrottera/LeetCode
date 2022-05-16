package leetCode.easy;

/*
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Input: numRows = 1
Output: [[1]]
*/

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        PascalTriangle pascalTriangle = new PascalTriangle();
        result = pascalTriangle.generate(30);
        result.stream().forEach( row -> {
            List<Integer> line = row;
            line.stream().forEach(number -> {
                System.out.println(number);
            });
        });
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int line = 0; line < numRows; line++) {
            List<Integer> row = new ArrayList<>();
            result.add(row);
            for (int i = 0; i <= line; i++)
               row.add(Integer.valueOf(binomialCoeff(line, i)));
        }
        return result;
    }

    public int binomialCoeff(int n, int k) {
        int res = 1;

        if (k > n - k) {
            k = n - k;
        }

        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

}
