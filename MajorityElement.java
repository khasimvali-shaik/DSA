public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(findMajorityElement(arr));
    }

    private static int findMajorityElement(int[] arr) {

        int count = 0;
        int candidate = 0;
        for(int num : arr){
            if(count == 0) candidate = num;
            count += num == candidate ? 1 : -1;
        }
        return candidate;
    }
}
