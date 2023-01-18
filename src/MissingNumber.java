public class MissingNumber {
    public static void main(String[] args) {
    System.out.println(missingNumber2(new  int[] {0,1}));
    }
    static int missingNumber1(int[] nums) {
        int n = nums.length;
        int finalResult = n * (n+1)/2;
        for (int i = 0; i < n; i++) {
            finalResult -= nums[i];
        }
        return finalResult;
    }
    static int missingNumber2(int[] nums){
        int finalResult = 0;
        for (int i = 0; i < nums.length; i++) {
            finalResult ^= nums[i];
            finalResult ^= i +1;
        }
        return finalResult;
    }
}
