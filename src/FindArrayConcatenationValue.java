import java.io.FilterOutputStream;
/*
*https://leetcode.com/problems/find-the-array-concatenation-value/
*/
public class FindArrayConcatenationValue {
    public static void main(String[] args) {
        System.out.println(findTheArrayConcVal(new int[] {5,14,13,8,12}));
    }
    public static long findTheArrayConcVal(int[] nums) {
        long sumResult = 0;
        String outPut = "";
        for (int i = 0,j=nums.length-1; i < nums.length-1 && j>=i; i++,j--) {
            if (i == j){
                outPut=outPut+nums[i];
            }else {
                outPut=outPut+nums[i]+nums[j];
            }
            sumResult+=Integer.valueOf(outPut);
            outPut = "";
        }
        return sumResult;
    }
}
