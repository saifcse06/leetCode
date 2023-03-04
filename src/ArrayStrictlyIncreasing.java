public class ArrayStrictlyIncreasing {
    public static void main(String[] args) {
        System.out.println(canBeIncreasing(new int[] {1,2,10,5,7}));
        System.out.println(canBeIncreasing(new int[] {2,3,1,2}));
    }
    public static boolean canBeIncreasing(int[] nums) {
        for (int i = 0, faults = 0; i + 1 < nums.length; i++)
            if (nums[i] >= nums[i + 1]) {
                if (++faults == 2)
                    return false;
                if (i != 0 && nums[i - 1] >= nums[i + 1])
                    nums[i + 1] = nums[i];
            }
        return true;
    }
}
