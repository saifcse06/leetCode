import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[] {3,1,2,10,1})));
    }
    public static int[] runningSum(int[] nums) {
        int sumN = 0;
        int[] temArray =new int[nums.length];
        for (int i = 0; i <= nums.length-1; i++) {
            temArray[i] =nums[i]+sumN;
            sumN += nums[i];
        }
        return temArray;
    }
}
