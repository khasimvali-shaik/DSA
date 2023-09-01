import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 13;
        int[] res = findIndexes(nums, target);
        for(int i : res){
            System.out.print(i + " ");
        }
    }

    private static int[] findIndexes(int[] nums, int target){
        int[] res = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int val = target - nums[i];
            if(map.containsKey(val)){
                res[0] = map.get(val);
                res[1] = i;
                return res;
            }

            map.put(nums[i], i);
        }
        return res;
    }
}
