/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
*/

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String args[]) {
        String[] strs = {"a"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {

        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);
        int arrayLength = strs.length;

        if (arrayLength == 0) {
            return "";
        } else if (strs[0].length() == 0) {
            return "";
        } else if (arrayLength == 1) {
            return strs[0];
        } else {
            int fistStringLength = strs[0].length();
            for (int i = 0; i < fistStringLength; i++) {
                if (strs[0].charAt(i) == strs[arrayLength - 1].charAt(i)) {
                    res.append(strs[0].charAt(i));
                } else {
                    break;
                }
            }
        }
        return res.toString();
    }
}
