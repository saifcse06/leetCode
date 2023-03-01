public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }

    public static String addBinary(String b1, String b2) {
        int len1 = b1.length();
        int len2 = b2.length();
        int carry = 0;
        String res = "";
        // the final length of the result depends on the bigger length between b1
        // and b,
        // (also the value of carry, if carry = 1, add "1" at the head of result,
        // otherwise)
        int maxLen = Math.max(len1, len2);
        for (int i = 0; i < maxLen; i++) {

            // start from last char of String b1 and b2
            // notice that left side is an int and right side is char
            // so we need to minus the decimal value of '0'
            int p = i < len1 ? b1.charAt(len1 - 1 - i) - '0' : 0;
            int q = i < len2 ? b2.charAt(len2 - 1 - i) - '0' : 0;
            int tmp = p + q + carry;
            carry = tmp / 2;
            res = tmp % 2 + res;
        }
        return (carry == 0) ? res : "1" + res;


      //  Read more: https://www.java67.com/2018/05/coding-2-ways-to-add-binary-numbers-in-Java.html#ixzz7tFgpTkJi

//        int number1 = Integer.parseInt(a,2);
//        int number2 = Integer.parseInt(b,2);
//        return Integer.toBinaryString(number1+number2);
    }
}
