import java.util.Arrays;

import org.w3c.dom.css.Counter;

public class CountingSort {
    public static void main(String[] args) {
        int[] a = {1, 4, 1, 2, 7, 5, 2};
        countingSort(a);
    }

    private static void countingSort(int[] a) {
        // Find the value of K (max element in the given array)
        int k = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i] > k){
                k = a[i];
            }
        }

        // Intialize the count array with the size of K + 1 
        // (becuases the range of elements in given array is from 0 to K)
        int[] count = new int[k+1];
        Arrays.fill(count, 0);  // Fill all the values with 0

        // Find the count of each element in the given array and add in respective position in count arary
        for(int i=0; i<a.length; i++){
            count[a[i]]++;
        }

        // Now fill the actual positions for the elementes to be to make array sorted
        for(int i=1; i<count.length; i++){
            count[i] = count[i-1] + count[i];
        }

        // we have the to create the new res array to store sorted elements
        int[] res = new int[a.length];

        // Fill the res array with given array element at proper place
        for(int i=0; i<res.length; i++){
            res[--count[a[i]]] = a[i];
        }

        // Now copy the res elements into given array
        for(int i=0; i<res.length; i++){
            a[i] = res[i];
        }

        // Print the sorted array
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
