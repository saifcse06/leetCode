public class Main {
    public static void main(String[] args) {
        //System.out.println(alternateDigitSum(521));
        System.out.println(findTheArrayConcVal(new int[] {7,52,2,4}));
    }
    public static long findTheArrayConcVal(int[] nums) {
            long sumResult = 0;
            String output = "";
            for (int i = 0,j=nums.length-1; i <= nums.length-1 && j>=i ; i++,j--) {
                if (i == j){
                    output = output+nums[i];
                    sumResult+= Integer.valueOf(output);
                }else {
                    output = output+nums[i]+nums[j];
                    sumResult+= Integer.valueOf(output);
                }
                output = "";
            }
            return sumResult;
    }
    public static int alternateDigitSum(int n) {
        int result = 0;
        while (n>0){
            int rem = n%10;
            if (rem % 2 != 0){
                result -= rem;
            }else {
                result+=rem;
            }
        }
        return result;
    }
}