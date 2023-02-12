import java.util.ArrayList;
import java.util.List;

public class OrderedStream {
    String[] arr;

    public OrderedStream(int n) {
        arr = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        arr[idKey-1] = value;
        List<String> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == null){ break; }
            if(!arr[i].equals("0")){ list.add(arr[i]); arr[i] = "0"; }
        }
        return list;
    }
}
