import java.util.*;

public class DSA1 {

    public static void main(String[] args) {

        int[][] arr = {
                {23, 4, 8},
                {12, 14, 9, 3},
                {78, 99, 34, 56},
                {18, 17},
        };
        int target = 17;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

        System.out.println("Maximum Value is: "+max(arr));
        System.out.println("Minimum Value is: "+min(arr));
    }

    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
           for(int col = 0; col < arr[row].length; col++) {
               if(arr[row][col] == target){
                   return new int[]{row, col};
               }
           }
        }

        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }

        return max;
    }

    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }

        return min;
    }
}
