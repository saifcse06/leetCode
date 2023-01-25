import java.util.Arrays;

public class ManyNumbersSmallerCurrentNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] {8,1,2,2,3})));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ansArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int smallNumberCount = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]>nums[j]){
                    smallNumberCount++;
                }
            }
            ansArray[i]=smallNumberCount;
        }
        return  ansArray;
    }
}
