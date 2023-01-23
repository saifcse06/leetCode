import java.util.Arrays;

public class MaximumNumberWordsFoundSentences {
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new  String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }
    public static int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int[] temA = new int[n];
        for (int i = 0; i < sentences.length; i++) {
           String[] s =sentences[i].split(" ");
           int sumWord = 0;
            for (int j = 0; j < s.length; j++) {
                sumWord++;
            }
            temA[i] = sumWord;
        }
        return Arrays.stream(temA).max().getAsInt();
    }
}
