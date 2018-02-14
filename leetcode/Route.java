class Solution {
    public boolean judgeCircle(String moves) {
        int original = 0;
        for(int i = 0; i < moves.length(); i ++){
            String direction = moves.substring(i, i + 1);
            if(direction.equals("U") || direction.equals("R")){
                original += 1;
            }
            else {
                original -= 1;
            }
        }
        return original == 0;
    }
}
