public class AlternatingDigitSum {
    public static void main(String[] args) {
      System.out.println(alternateDigitSum(10));
    }
    public static int alternateDigitSum(int n) {
        int result = 0,checkValue = String.valueOf(n).length();;
        while (n>0){
            int rem = n%10;
            if (checkValue % 2 != 0){
                result += rem;
            }else {
                result-=rem;
            }
            n /= 10;
            checkValue--;
        }
        return result;
    }
}
