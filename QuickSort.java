import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[15];
        for(int i=0;i<arr.length;i++)
            arr[i] = rand.nextInt(200);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        quick(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
    private static void quick(int[] sort, int start, int end) {
        if(end <= start)
            return;
        int pivot = partition(sort,start,end);
        quick(sort,start,pivot-1);
        quick(sort,pivot+1,end);
    }
    private static int partition(int[] sort, int start, int end) {
        int pivot = sort[end];
        int i = start - 1;
        int j;
        for (j = start; j <= end - 1; j++) {
            if (sort[j] < pivot) {
                i++;
                int temp = sort[i];
                sort[i] = sort[j];
                sort[j] = temp;
            }
        }
        i++;
        int temp = sort[i];
        sort[i] = sort[j];
        sort[j] = temp;
        return i;
    }

}
