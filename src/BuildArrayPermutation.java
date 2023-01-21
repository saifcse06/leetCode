import java.util.Arrays;

public class BuildArrayPermutation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray(new  int[] {5,0,1,2,3,4})));
    }
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
