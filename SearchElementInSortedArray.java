public class SearchElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 10;

        System.out.println(findElement(arr, key));
    }

    private static int findElement(int[] arr, int key) {

        int index = -1;

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == key) return mid;

            if(arr[start] <= arr[mid]){

                if(key >= arr[start] && key <= arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(key >= arr[mid] && key <= arr[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return index;
    }
}
