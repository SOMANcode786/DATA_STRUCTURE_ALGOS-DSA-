import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ForEachloop {

    public static void main(String[] args) {

        // int[] arr= {21,23,34,45,6,1};
        // for(int i=0;i<arr.length;i++) {
        // System.out.println(arr[i]);
        // }
        // for(int value:arr) {
        // System.out.println(value);
        // }
        // System.out.println();

        // iteration in HashMap

        HashMap<String, Integer> map = new HashMap<>();
        // Insertion
        map.put("india", 200);
        map.put("Pakistan", 12);

        System.out.println(map);

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println(k);
        }

    }

}
