package kata_2;

import java.util.HashMap;
import java.util.Map;

public class Kata_2 {

    public static void main(String[] args) {
        int[] data = {0,15,4,0,15,15,102,4,102,102,4,4,4,4,4};
        Map<Integer, Integer> histogram = new HashMap();
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i]) + 1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
    }
    
}
