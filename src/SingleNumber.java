public class SingleNumber {
    public static void main(String[] args) {
       System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
    static int singleNumber(int[] nums) {
        int result = 0;
        for (int n :nums) {
            result ^= n;
        }
        return  result;
    }
}
