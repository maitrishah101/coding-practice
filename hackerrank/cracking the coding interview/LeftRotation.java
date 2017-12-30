public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        for(int i = 0; i < k; i ++){
            leftRotateOne(a, n);
        }
        return a;
    }

    //helper method to rotate left one time 
    public static void leftRotateOne(int[] arr, int length){
        int temp = arr[0];
        for(int i = 0; i < length - 1; i ++){
            arr[i] = arr[i + 1];
        }
        arr[length - 1] = temp;
    }
}
