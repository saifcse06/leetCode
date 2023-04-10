import java.util.Arrays;

/*
https://leetcode.com/problems/largest-perimeter-triangle/description/
 */
public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        LargestPerimeterTriangle lpt = new LargestPerimeterTriangle();
        //System.out.println(lpt.largestPerimeter(new int[] {2,1,2}));
        System.out.println(lpt.largestPerimeter(new int[] {1,2,1,10}));
    }

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int per=0;
        // case where triangle will not be formed will be handled by per=0;
        for(int i=nums.length-1;i>=2; i--)
        {
            if(nums[i-1]+nums[i-2]>nums[i])
            {
                per=nums[i]+nums[i-1]+nums[i-2];
                break;
            }

        }
        return per;
    }
}
