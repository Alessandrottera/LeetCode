package leetCode.easy;
/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/

public class ClimbingStairs {

    public static void main(String[] args) {
        int x = 1;
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(x));
    }

    public int climbStairs(int n) {
        double A=(1+Math.sqrt(5))/2;
        double B=(1-Math.sqrt(5))/2;
        double fib = (Math.pow(A,n+1) - Math.pow(B,n+1)) / Math.sqrt(5);
        return (int)fib;
    }
}
