// package HashMap;
import java.util.HashMap;

public class ElementsAppearsOnce {
    public static void main(String[] args) {
        int [] arr = {4,1,2,1,2};
          HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count=0;
        for (int i = 0; i <arr.length; i++) {
         if(freqMap.containsKey(arr[i])){
            count = freqMap.get(arr[i]);
            count++;
            freqMap.put(arr[i],count);
            }
            else{
                freqMap.put(arr[i],1);
            }
         
            }
        
            System.out.println("Frequency Map: " + freqMap);
        
            System.out.println("Elements that appear only once:");
            for (int i = 0; i <arr.length; i++) {
             
                if (freqMap.get(arr[i]) == 1) {
                    System.out.println(arr[i]);
                }
            }
    
            
        }
    }
    



