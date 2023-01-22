public class Main {
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(521));
    }
    public static int alternateDigitSum(int n) {
        int result = 0;
        while (n>0){
            int rem = n%10;
            if (rem % 2 != 0){
                result -= rem;
            }else {
                result+=rem;
            }
        }
        return result;
    }
}