public class ElementSumDigitSum {
    public static void main(String[] args) {
        System.out.println(differenceOfSum(new int[] {1,15,6,3}));
    }
    public static int differenceOfSum(int[] nums) {
        int elementSum = 0,digitSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>9){
                int maxDigit= nums[i];
                while (maxDigit>0){
                    int rem = maxDigit % 10;
                    digitSum+= rem;
                    maxDigit/=10;
                }

            }else {
                digitSum+=nums[i];
            }
            elementSum += nums[i];
        }

        return elementSum-digitSum;
    }
}
