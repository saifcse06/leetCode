public class SumAllOddLengthSubarrays {
    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[] {1,4,2,5,3}));
        System.out.println(sumOddLengthSubarrays(new int[] {1,2}));
        System.out.println(sumOddLengthSubarrays(new int[] {10,11,12}));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i<n ; i++) {
            int start = n-i;
            int end = i+1;
            int target  = start * end;
            int odd = target/2;
            if(target%2 == 1)
                odd++;
            sum += odd * arr[i];
        }
        return sum;
    }
}
