import java.util.*;
public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                arr[i][j] = sc.nextInt();
        System.out.println("Enter the key value :");
        int key = sc.nextInt();
        search(arr,key);
    }
    private static boolean binary(int[][] arr, int key) {
        int rows = arr.length;
        int cols = arr[0].length;

        int low = 0;
        int high = (rows * cols)-1;

        while(low <= high) {
            int mid = low + (high-low) / 2;
            if(arr[mid/cols][mid%cols] == key) {
                System.out.println("Found at index [ " + mid/cols + ", " + mid%cols + "]");
                return true;
            }
            else if(arr[mid/cols][mid%cols] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
    private static void search(int[][] arr, int key){
        int rows = arr.length-1;
        int i=0;
        int j=arr[0].length-1;
        while(i<rows && j>=0) {
            if(arr[i][j] == key)
                System.out.println("Found at index [ " + i + ", " + j + "]");
            if(arr[i][j] > key)
                j--;
            else
                i++;
        }
    }
}
