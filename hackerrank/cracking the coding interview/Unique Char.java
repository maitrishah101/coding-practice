public class Solution {
  
  //using a HashMap
  public static boolean isUnique(String str){
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      for(int i = 0; i < str.length(); i ++){
       String letter = str.substring(i, i + 1);
         if(map.containsKey(letter)){
          return false;
         }
         map.put(letter, 1);
      }
      return true;
   }
}
