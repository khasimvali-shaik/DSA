import javax.sound.sampled.ReverbType;

public class RotateSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        k = k%arr.length;
        rotateArray(arr, k);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    private static void rotateArray(int[] arr, int k) {
        // Using extra space O(n)
        // int[] res = new int[arr.length];
        // int j = 0;
        // for(int i=arr.length - k; i<arr.length; i++){
        //     res[j++] = arr[i];
        // }
        // for(int i=0; i<arr.length - k; i++){
        //     res[j++] = arr[i];
        // }

        // for(int i=0; i<arr.length; i++){
        //     arr[i] = res[i];
        // }

        // Without extra space O(1)
        k = k%arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
    }

    private static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}
