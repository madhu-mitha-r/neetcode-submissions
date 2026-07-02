class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] ans = new int[2];
        for(int i =0;i<nums.length;i++){
            int key = target-nums[i];
            if(map.containsKey(key)){
              ans[0] = map.get(key);
              ans[1] = i;
              break;
            }else{
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
