public class Solution {

    static int birthdayCakeCandles(int n, int[] arr) {
        // Complete this function
        //map for height and num occurrences of that height
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i ++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        int maxHeight = 0;
        for(int height : map.keySet()){
            if(height > maxHeight){
                maxHeight = height;
            }
        }
        return map.get(maxHeight);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
