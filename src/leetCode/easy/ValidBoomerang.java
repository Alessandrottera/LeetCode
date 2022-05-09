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

    public static void main(String[] args) {
        ValidBoomerang validBoomerang = new ValidBoomerang();
        int[][] points = {{1, 1}, {2, 3}, {3, 2}};
        System.out.println(validBoomerang.isBoomerang(points));
    }

    public boolean isBoomerang(int[][] points) {
        double n1 = points[0][0] - points[1][0];
        double d1 = points[0][1] - points[1][1];

        double n2 = points[1][0] - points[2][0];
        double d2 = points[1][1] - points[2][1];

        if (d1 == 0 && d2 == 0)
            return false;
        else if ((n1 == 0 && d1 == 0) || (n2 == 0 && d2 == 0))
            return false;
        else if ((d1 == 0 && d2 != 0) || (d1 != 0 && d2 == 0))
            return true;
        else if (n1 / d1 == n2 / d2)
            return false;
        else
            return true;
    }

}
