package kata_2;

import java.util.HashMap;
import java.util.Map;

public class Kata_2 {

    public static void main(String[] args) {
        int[] data = {0,15,4,0,15,15,102,4,102,102,4,4,4,4,4};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
    
}
