public class Solution {
  public static String compressString(String str){
		String compressed = "";
		String lastSeen = str.substring(0,1);
		int count = 1;
		for(int i = 1; i < str.length(); i ++){
			if(str.substring(i, i + 1).equals(lastSeen)){
				count += 1;
			}
			else {
				compressed += lastSeen + String.valueOf(count);
				lastSeen = str.substring(i, i + 1);
				count = 1;
			}
		}
		compressed = compressed + lastSeen + String.valueOf(count);
		if(compressed.length() > str.length()){
			return str;
		}
		return compressed;
	}
}
