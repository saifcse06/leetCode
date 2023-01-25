import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsGreatestNumberCandies {
    public static void main(String[] args) {
      System.out.println((kidsWithCandies(new int[] {2,3,5,1,3},3)));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         List booleanResult = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int maxCandie = Arrays.stream(candies).max().getAsInt();
            if (candies[i]+extraCandies>=maxCandie){
                booleanResult.add(i,true);
            }else {
                booleanResult.add(i,false);
            }
        }
        return booleanResult;
    }
}
