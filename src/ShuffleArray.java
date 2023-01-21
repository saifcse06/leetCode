import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[] {2,5,1,3,4,7},3)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] resultArray = new int[n*2];
        int f=0,s=1;
        for (int i = 0; i < n; i++) {
            resultArray[f] = nums[i];
            resultArray[s] = nums[i+n];
            f+=2;
            s+=2;
        }
        return resultArray;
    }
}
