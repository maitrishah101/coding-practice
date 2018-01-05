public class Solution {
  
  public static boolean isPermutation(String str1, String str2){

		if(str1.length() != str2.length()){
			return false;
		}

		for(int i = 0; i < str1.length(); i ++){
			if(str2.contains(str1.substring(i, i + 1))){
				str2.replace(str1.substring(i, i + 1), "");
			}
			else {
				return false;
			}
		}
		return true;
	}
}
