class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }

        int max = Integer.MIN_VALUE;
        int maxKey = -1;
        for(Integer key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                maxKey = key;
            }
        }
        return maxKey;
    }
}
