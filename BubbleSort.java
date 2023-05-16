import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[15];
        for(int i=0;i<arr.length;i++)
            arr[i] = rand.nextInt(100);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        bubble(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
    private static void bubble(int[] arr) {
        for(int i=0;i < arr.length-1;i++) {
            for(int j=i+1;j < arr.length;j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
