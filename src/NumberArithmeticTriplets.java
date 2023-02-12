public class NumberArithmeticTriplets {
    public static void main(String[] args) {
        System.out.println(arithmeticTriplets(new int[]{0,1,4,6,7,10},3));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int resultCount = 0,length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length ; j++) {
                for (int k = j+1; k < length; k++) {
                    if (nums[j]-nums[i] == diff && nums[k] - nums[j] == diff){
                        resultCount++;
                    }
                }
            }
        }
        return  resultCount;
    }
}
