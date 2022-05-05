package leetCode.easy;

/*
You are a product manager and currently leading a team to develop a new product.
Unfortunately,the latest version of your product fails the quality check.
Since each version is developed based on the previous version,all the versions after a bad version are also bad.
Suppose you have n versions[1,2,...,n]and you want to find out the first bad one,which causes all the following ones to be bad.
You are given an API bool isBadVersion(version)which returns whether version is bad.Implement a function to find the first bad version.
You should minimize the number of calls to the API.
Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
*/



public class FirstBadVersion {

    final int badVersion = 6;

    public static void main(String[] args) {
        FirstBadVersion binaryTreeInOrderTraversal = new FirstBadVersion();
        System.out.println(binaryTreeInOrderTraversal.firstBadVersion(6));
    }


    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int version){
        boolean result = false;
        if (version >= badVersion){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
