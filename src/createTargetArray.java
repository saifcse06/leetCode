import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class createTargetArray {
    public static void main(String[] args) {
    System.out.println(Arrays.toString(createTargetArray(new int[] {0,1,2,3,4},new int[] {0,1,2,2,1})));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(index[i],nums[i]);
        }
        for (int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return nums;
    }
}
