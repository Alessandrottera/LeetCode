package leetCode.easy;

public class SqrtX {

    public static void main(String[] args){
        int a = 17;
        SqrtX sqrtX = new SqrtX();
        System.out.println(sqrtX.mySqrt(a));
    }

    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }
}
