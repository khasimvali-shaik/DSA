import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(findMajorityElement(arr));
    }

    private static int findMajorityElement(int[] arr) {

        // Using Hasmap

        Map<Integer, Integer> map = new HashMap<>();
        int count = Integer.MIN_VALUE;
        int val = -1;
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.getOrDefault(i, 1) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if(m.getValue() > count){
                count = m.getValue();
                val = m.getKey();
            }
        }
        return val;
        // Optimal Solution
        // int count = 0;
        // int candidate = 0;
        // for(int num : arr){
        // if(count == 0) candidate = num;
        // count += num == candidate ? 1 : -1;
        // }
        // return candidate;
    }
}
