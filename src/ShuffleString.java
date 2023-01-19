import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
        System.out.println(restoreString("codeleet",new int[] {4,5,6,7,0,2,1,3}));
    }
    public static String restoreString(String s, int[] indices) {
        char[] ch = s.toCharArray();
        char[] temString = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            temString[indices[i]] = ch[i];
        }
        return String.valueOf(temString);
    }
}
