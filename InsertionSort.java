import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[15];
        for(int i=0;i<arr.length;i++)
            arr[i] = rand.nextInt(100);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        insertion(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");

    }
    private static void insertion(int[] sort) {
        for(int i=1;i<sort.length;i++) {
            int current = sort[i];
            int j = i-1;
            while(j>=0 && sort[j] > current) {
                sort[j+1] = sort[j];
                j--;
            }
            sort[j+1] = current;
        }
    }
}
