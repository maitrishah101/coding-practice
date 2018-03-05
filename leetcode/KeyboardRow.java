class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> result = new ArrayList<>();

        HashMap<String, String> keyboardMap = new HashMap<>();
        keyboardMap.put("top", "qwertyuiop");
        keyboardMap.put("middle", "asdfghjkl");
        keyboardMap.put("bottom", "zxcvbnm");

        String row = "";
        for(String word: words){
            //find out which row the word should be made out of
            String firstChar = word.substring(0, 1).toLowerCase();
            if(keyboardMap.get("top").contains(firstChar)){
                row = "top";
            }
            else if(keyboardMap.get("middle").contains(firstChar)){
                row = "middle";
            }
            else {
                row = "bottom";
            }
            boolean flag = true;
            for(int i = 1; i < word.length(); i ++){
                if(!(keyboardMap.get(row).contains(word.substring(i, i + 1).toLowerCase()))){
                    flag = false;
                }
            }
            if(flag){
                result.add(word);
            }

        }
        String[] wordsArr = new String[result.size()];
        wordsArr = result.toArray(wordsArr);
        return wordsArr;
    }
}
