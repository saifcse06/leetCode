import java.util.Arrays;

public class LeftRightSumDifferences {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRigthDifference(new int[] {10,4,8,3})));
        System.out.println(Arrays.toString(leftRigthDifference(new int[] {1})));
    }
    public static int[] leftRigthDifference(int[] nums) {
        int[] result = new int[nums.length];
        int[] leftA = new int[nums.length];
        int[] rightA = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            leftA[i] = leftA[i-1]+nums[i-1];
        }
        for(int i=nums.length-2; i>=0; i--){
            rightA[i] = rightA[i+1] + nums[i+1];
        }
        for(int i=0; i<nums.length; i++){
            result[i] = Math.abs(leftA[i]-rightA[i]);
        }
        return result;
    }
}
