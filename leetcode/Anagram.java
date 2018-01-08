class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i ++){
            if(t.contains(s.substring(i, i + 1))){
                t = t.replaceFirst(s.substring(i, i + 1), "");
            }
            else {
                return false;
            }
        }
        if(t.length() == 0){
            return true;
        }
        return false;
    }
}
