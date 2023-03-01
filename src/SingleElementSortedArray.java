public class SingleElementSortedArray {
    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}));
        System.out.println(singleNonDuplicate(new int[] {3,3,7,7,10,11,11}));
    }
    public static int singleNonDuplicate(int[] nums) {
        int a=0;
        if(nums.length==1)
            return nums[0];
        if(nums[0]!=nums[1])
            return nums[0];
        if(nums[nums.length-2]!=nums[nums.length-1])
            return nums[nums.length-1];
        for(int i=0;i<nums.length-1;i++)
        {
            if(i!=0&&nums[i]!=nums[i-1]&&nums[i]!=nums[i+1])
            {
                a=nums[i];
                break;
            }
        }
        return a;
    }
}
