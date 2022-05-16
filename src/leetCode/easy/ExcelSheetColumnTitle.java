package leetCode.easy;

/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
example:
A -> 1 B -> 2 C -> 3
Z -> 26 AA -> 27 AB -> 28
Example 1: Input: columnNumber = 1 Output: "A"
Example 2: Input: columnNumber = 28 Output: "AB"
Example 3: Input: columnNumber = 701 Output: "ZY"
*/

public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        System.out.println(excelSheetColumnTitle.convertToTitle(28));
    }

    public String convertToTitle(int columnNumber) {
        int n = columnNumber;
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--;
            result.insert(0, (char) ('A' + n % 26));
            n /= 26;
        }
        return result.toString();
    }
}

