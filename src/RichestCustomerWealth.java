import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][] {{2,8,7},{7,1,3},{1,9,5}}));
    }
    public static int maximumWealth(int[][] accounts) {
        int tarray = accounts.length;
        int[] temA = new int[tarray];
        int k = 0;
        for(int[] account: accounts){
            int tsum = 0;
            for (int i = 0; i < account.length; i++) {
                tsum+=account[i];
            }
            temA[k++] = tsum;
        }
        return Arrays.stream(temA).max().getAsInt();
    }
}
