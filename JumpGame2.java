public class JumpGame2 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
        int jumps = 0;
        int r = 0; int l = 0;
        while(r < nums.length - 1){
            int maxJumps = 0;
            for(int i=l; i<=r; i++){
                maxJumps = Math.max(maxJumps, i + nums[i]);
            }
            l = r + 1;
            r = maxJumps;
            jumps++;
        }
        return jumps;
    }
}
