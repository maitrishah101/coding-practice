class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < S.length(); i ++){
            String sub1 = S.substring(i, i + 1);
            if(map.containsKey(sub1)){
                map.put(sub1, map.get(sub1) + 1);
            }
            else {
                map.put(sub1, 1);
            }
        }
        for(int j = 0; j < J.length(); j ++){
            String sub2 = J.substring(j, j + 1);
            if(map.containsKey(sub2)){
                count += map.get(sub2);
            }
        }
        return count;
    }
}
