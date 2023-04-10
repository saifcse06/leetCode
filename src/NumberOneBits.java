import java.util.Arrays;

/*
 * https://leetcode.com/problems/number-of-1-bits/
 */
public class NumberOneBits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
        //System.out.println(hammingWeight(00000000000000000000000010000000));
//        System.out.println(hammingWeight(11111111111111111111111111111101));
    }
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count += 1;

        }
        return count;
    }
}
