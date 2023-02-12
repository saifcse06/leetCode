/*
    https://leetcode.com/problems/jump-game-ii/description/
 */
public class JumpGame {
    public static void main(String[] args) {
        System.out.println(jump(new int[] {2,3,1,1,4}));
    }

    public static int jump(int[] nums) {
        int result=0,length = nums.length,recentEnd=0,recentFarthest=0;
        for (int i = 0; i < length-1; i++) {
            recentFarthest = Math.max(recentFarthest,i+nums[i]);
            if (i == recentEnd){
                result++;
                recentEnd = recentFarthest;
            }
        }
        return result;
    }
}
