public class Solution {

    static void staircase(int n) {
        // Complete this function
        String space = "";
        for(int i = 0; i < n - 1; i ++){
            space += " ";
        }
        space += "#";
        for(int j = 0; j < n; j ++){
            System.out.println(space);
            space = space + "#";
            space = space.substring(1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
