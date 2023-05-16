import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[15];
        for(int i=0;i<arr.length;i++)
            arr[i] = rand.nextInt(100);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        merge(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
    private static void merge(int[] arr) {
        int length = arr.length;
        if(length <= 1)
            return;

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];

        int i;
        int j = 0;

        for(i=0;i < length;i++) {
            if(i < middle) {
                leftArray[i] = arr[i];
            }
            else {
                rightArray[j] = arr[i];
                j++;
            }
        }
        merge(leftArray);
        merge(rightArray);
        arrange(arr,leftArray,rightArray);
    }

    private static void arrange(int[] array, int[] leftArray, int[] rightArray) {
        int left = array.length / 2;
        int right = array.length - left;
        int l=0,r=0,i=0;
        while(l < left && r < right) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
            while(l < left) {
                array[i] = leftArray[l];
                i++;
                l++;
            }
            while(r < right) {
                array[i] = rightArray[r];
                i++;
                r++;
            }
    }
}
