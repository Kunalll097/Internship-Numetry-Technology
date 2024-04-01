public class DSA {
    public static void main(String[] args) {

        //------------------------   Binary Search  --------------------------------  
        // int[] arr = {2, 3, 5, 9, 14, 16, 18};
        // int target = 15;
        // int ans = binarysearch(arr, target);
        // System.out.println(ans);


        //------------------------   Linear Search  --------------------------------  
        int[] nums = {12, 45, 2, 19, 95, -4, 37, -6, 55};
        int target = 19;
        boolean ans = linearsearch3(nums, target);
        System.out.println(ans);
    }


    // static int binarysearch(int[] arr, int target){

    //     if(target > arr[arr.length -1]){
    //         return -1;
    //     }
    //     int start = 0;
    //     int end = arr.length - 1;

    //     while(start <= end){
    //         int mid = start + (end - start) / 2;

    //         if(target < arr[mid]){
    //             end = mid - 1;
    //         } else if (target > arr[mid]) {
    //             start = mid + 1;
    //         }else{
    //             return mid;
    //         }
    //     }

    //     return end;

    // }

    
    static boolean linearsearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
