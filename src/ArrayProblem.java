import java.util.Arrays;

public class ArrayProblem {
    public static void main(String[] args) {
        merge(new int[] {1,2,3,0,0,0},3,new int[] {2,5,6},3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length-1,i = m-1;
        for (int j = n-1; j >=0;) {
            if (i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
                k--;
            }else {
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
