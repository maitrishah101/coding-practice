class Solution {
    public boolean detectCapitalUse(String word) {
        int numUpper = 0;
        for(int i = 0; i < word.length(); i ++){
            String sub = word.substring(i, i + 1);
            if(sub.equals(sub.toUpperCase())){
                numUpper += 1;
            }
        }
        if(numUpper == word.length() || numUpper == 0){
            return true;
        }
        if(numUpper == 1 && word.substring(0,1).equals(word.substring(0,1).toUpperCase())){
            return true;
        }
        return false;
    }
}
