class Solution {
    public String reverseWords(String s) {
        String reversed = "";
        int index = 0;
        int spaceIndex = s.indexOf(" ", index);
        while(spaceIndex >= 0 && spaceIndex < s.length()){
            reversed += reverseString(s.substring(index, spaceIndex)) + " ";
            index = spaceIndex + 1;
            spaceIndex = s.indexOf(" ", index);
        }
        reversed += reverseString(s.substring(index));
        return reversed;
    }

    public String reverseString(String s){
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i ++;
            j --;
        }
        return new String(word);
    }
}
