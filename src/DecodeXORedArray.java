import java.util.Arrays;

public class DecodeXORedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decode(new int[] {1,2,3},1)));
    }

    public static int[] decode(int[] encoded, int first) {
        int[] resultDecode = new int[encoded.length+1];
        resultDecode[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            resultDecode[i+1] = resultDecode[i] ^ encoded[i];
        }
        return resultDecode;

    }
}
