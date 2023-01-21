public class VariablePerformingOperations {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"++X","X++","X++"}));
    }

    public static int finalValueAfterOperations(String[] operations) {
      int x = 0;
      for (String operation:operations){
          x = (operation.equals("--X") || operation.equals("X--")) ? x-1:x+1;
      }
      return x;
    }
}
