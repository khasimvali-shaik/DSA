/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
Then return the number of elements in nums which are not equal to val.
*/
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;

        System.out.println(removeElement(nums, val));
    }

    private static int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[j++] = nums[i];
            }
        }

        return j;
    }
}
