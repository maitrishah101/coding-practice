public class Solution {

    public static int numberNeeded(String first, String second) {
        int numSame = findSameChars(first, second);
        return (first.length() - numSame) + (second.length() - numSame);
    }

    //return the number of similar characters between the two strings 
    public static int findSameChars(String first, String second){
       int numSame = 0;
       for(int i = 0; i < first.length(); i ++){
            if(second.contains(first.substring(i, i + 1))){
                int index = second.indexOf(first.substring(i, i + 1));
                second = second.replaceFirst(second.substring(index, index + 1), "");
                numSame ++;
            }
        }
       return numSame;
    }
}
