public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(numWays(n));
        }
    }

    public static int numWays(int numStairs){
        if(numStairs < 0){
            return 0;
        }
        if(numStairs == 1 || numStairs == 0) {
            return 1;
        }
        if(numStairs == 2){
            return 2;
        }
        if(numStairs == 3){
            return 4;
        }
        return numWays(numStairs - 1) + numWays(numStairs - 2) + numWays(numStairs - 3);

    }
}
