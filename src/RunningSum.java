import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[] {3,1,2,10,1})));
    }
    public static int[] runningSum(int[] nums) {
        int sumValue = 0;
        int[] sumArrayResult = new  int[nums.length];
        for (int i = 0; i <= nums.length-1; i++) {
            sumArrayResult[i] = nums[i]+sumValue;
            sumValue+=nums[i];
        }
        return sumArrayResult;
    }
}
