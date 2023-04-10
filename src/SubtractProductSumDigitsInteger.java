public class SubtractProductSumDigitsInteger {
    public static void main(String[] args) {
        SubtractProductSumDigitsInteger  spsdi = new   SubtractProductSumDigitsInteger();
        System.out.println(spsdi.subtractProductAndSum(234));

    }
    public int subtractProductAndSum(int n) {
    int sum=0,multi=1;
    while (n>0){
        int rem = n%10;
        sum +=rem;
        multi *=rem;
        n/=10;
    }
    return multi-sum;

    }
}
