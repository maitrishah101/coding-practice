class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        int index = 0;
        while(index < nums.length){
            for(int i = index + 1; i < nums.length; i++){
                if(nums[index] + nums[i] == target){
                    indices[0] = index;
                    indices[1] = i;
                }
            }
            index ++;
        }
        return indices;
    }
}
