public class MinimumRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2}));
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
        System.out.println(findMin(new int[]{11,13,15,17}));
        System.out.println(findMin(new int[]{2,1}));
    }

    public static int findMin(int[] nums) {
        int minResult = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<minResult){
                minResult=nums[i];
            }
        }
        return minResult;
    }
}
