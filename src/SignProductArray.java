public class SignProductArray {
    public static void main(String[] args) {
        System.out.println(arraySign(new int[] {-1,-2,-3,-4,3,2,1}));
        System.out.println(arraySign(new int[] {1,5,0,2,-3}));
        System.out.println(arraySign(new int[] {-1,1,-1,1,-1}));
    }

    public static int arraySign(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] <0) {
                count++;
            }
        }
        if (count % 2 ==0){
            return 1;
        } else if (count % 2 !=0) {
            return -1;
        }
        return  -1;
    }
}
