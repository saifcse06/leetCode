import java.util.Arrays;

public class MakeArithmeticProgressionSequence {
    public static void main(String[] args) {
        System.out.println(canMakeArithmeticProgression(new int[] {3,5,1}));
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        for (int i = 1; i < arr.length-1; i++) {
            int a = arr[i]-arr[i-1];
            int b = arr[i+1]-arr[i];
            if (a != b){
                return false;
            }
        }
        return true;
    }
}
