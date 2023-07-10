import java.util.HashMap;
import java.util.Map;

public class ContailsDuplicate {
    public static void main(String[] args) {
        int[] input = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(isDuplicate(input));
    }

    private static boolean isDuplicate(int[] input) {
        
        // Using sort -> O(n log n) Time Complexity and O(1) Space Complexity
        // Sort uses combination of Quick Sort, Merge Sort and Insertion Sort

        /* Arrays.sort(input);
        for(int i=0; i<input.length-1; i++){
            if(input[i] == input[i+1]) return true;
        }
        return false; */

        // Using HasMap -> O(n) Time Complexity and O(n) Space Complexity

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<input.length; i++){
            if(map.containsKey(input[i])){
                return true;
            }
            map.put(input[i], 1);
        }
        return false;
    }
}
