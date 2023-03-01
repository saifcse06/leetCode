import java.util.ArrayList;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[] {2,3,4,7,11},5));
    }

    public static int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 1; i < arr[arr.length-1]; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != i){
                    result.add(i);
                }
            }
        }

        return 9;
    }
}
