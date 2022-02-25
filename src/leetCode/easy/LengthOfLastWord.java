package leetCode.easy;

public class LengthOfLastWord {

    public static void main(String[] args){

        String s = "test dwwwrive sss";

        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord(s));

    }

    public int lengthOfLastWord(String s) {

        String[] words = s.split("\\s+");
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }
}
