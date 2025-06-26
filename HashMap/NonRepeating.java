package HashMap;
import java.util.HashMap;
import java.util.Map;
// public class NonRepeating {
//     public static void main(String[] args){
//         int[] arr = {10,1,2,3,3,1};

//         Map<Integer,Integer>Map= new HashMap<>();{
//             int flag = -1;
//             for(int i =0; i<arr.length;i++){
//                 if(Map.containsKey(arr[i])){
//                     flag--;
//                     Map.put(arr[i],flag);
//                 }
//                 else{
//                     Map.put(arr[i],1);
//                             }

                           
//         }
//         System.out.println(Map);
//     }
//     }
// }
// import java.util.HashMap;
// import java.util.Map;

// public class NonRepeating {
//     public static void main(String[] args) {
//         int[] arr = {10, 1, 2, 3, 3, 1};

//         Map<Integer, Integer> map = new HashMap<>();

//         // First pass: Count occurrences
//         for (int num : arr) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         // Second pass: Find the first number with frequency 1
//         for (int num : arr) {
//             if (map.get(num) == 1) {
//                 System.out.println("First non-repeating number is: " + num);
//                 return;
//             }
//         }

//         System.out.println("No non-repeating number found.");
//     }
// }
import java.util.HashMap;
import java.util.Map;

public class NonRepeating {
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 3, 3, 1};

        Map<Integer, Integer> map = new HashMap<>(); 

        
        for (int i=0;i<arr.length;i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1); 
            } else {
                map.put(arr[i], i);
            }
        }

        for (int i=0;i<arr.length;i++) {
            if (map.get(arr[i]) == i) { 
                System.out.println("First non-repeating no. is: " +arr[i]);
                return;
            }
        }

      
        System.out.println("No non-repeating number found.");
    }
}



