import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[15];
        for(int i=0;i<arr.length;i++)
            arr[i] = rand.nextInt(100);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        selection(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
    private static void selection(int[] sort) {
        for(int i=0;i<sort.length-1;i++) {
            int min = i;
            for(int j=i+1;j<sort.length;j++) {
                if(sort[min] > sort[j])
                    min = j;
            }
            int temp = sort[i];
            sort[i] = sort[min];
            sort[min] = temp;
        }
    }
}
