package leetCode.easy;

/*
Given an array points where points[i] = [xi, yi] represents a point on the X-Y plane, return true if these points are a boomerang.
A boomerang is a set of three points that are all distinct and not in a straight line.
Input: points = [[1,1],[2,2],[3,3]]
Output: false
Input: points = [[1,1],[2,3],[3,2]]
Output: true
*/

public class ValidBoomerang {

    public static void main(String[] args){
        ValidBoomerang validBoomerang = new ValidBoomerang();
        int[][] points = {{1,1},{2,3},{3,2}};
        System.out.println(validBoomerang.isBoomerang(points));
    }

    public boolean isBoomerang(int[][] points) {


    }

}
