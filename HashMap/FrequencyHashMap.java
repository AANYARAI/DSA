package HashMap;
import java.util.HashMap;

public class FrequencyHashMap {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 5};
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count=0;
        for (int i = 0; i <arr.length; i++) {
        if(freqMap.containsKey(arr[i])){
        count = freqMap.get(arr[i]);
        count++;
        freqc
        }
        else{
            freqMap.put(arr[i],1);
        }
     
        }
    
            System.out.println(freqMap);
    }
}
