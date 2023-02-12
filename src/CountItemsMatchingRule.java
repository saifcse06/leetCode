import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
       //countMatches(new ArrayList<>() {{"jk","hkh","kh";}},"color","silver");
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        // loop through the items
        for(List<String> list : items) {
            if(ruleKey.equals("type") && ruleValue.equals(list.get(0))) count++;
            else if(ruleKey.equals("color") && ruleValue.equals(list.get(1))) count++;
            else if(ruleKey.equals("name") && ruleValue.equals(list.get(2))) count++;
        }
        System.out.println("resule: " + count);
        return count;
    }
}
