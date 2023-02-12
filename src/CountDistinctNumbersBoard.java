public class CountDistinctNumbersBoard {
    public static void main(String[] args) {
        System.out.println(distinctIntegers(5));
    }

    public static int distinctIntegers(int n) {
        return Math.max(n - 1, 1);
    }
}
