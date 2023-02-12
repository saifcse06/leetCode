import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRunLengthEncoded {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decompressRLElist(new int[] {1,2,3,4})));
    }
    public static int[] decompressRLElist(int[] nums) {
        int size = 0;
        for(int i = 0; i < nums.length; i += 2)
            size += nums[i];

        int[] resultArray = new int[size];
        for(int i = 0, j = 0; i < nums.length; i += 2) {
            while(nums[i]-- > 0) {
                resultArray[j] = nums[i + 1];
                j++;
            }
        }
        return resultArray;
    }
}
