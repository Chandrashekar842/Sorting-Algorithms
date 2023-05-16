import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [15];
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        //this function sorts the array in ascending order
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
        int index = binary(arr,35);
        if(index == -1)
            System.out.println("Element is not found");
        else
            System.out.print("ELement is found at index : " + index);

    }
    private static int binary(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;
        while(low <= high) {
            int mid = low + (high-low) / 2;
            if(key < arr[mid])
                high = mid-1;
            else if(key > arr[mid])
                low = mid+1;
            else
                return mid;
        }
        return -1;
    }
}
