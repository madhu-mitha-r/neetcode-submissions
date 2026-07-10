class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        int ans = 0;
        
        for(int i = 0;i<nums.length;i++){
             set.add(nums[i]);
        }

        int i = 0;
        
        while(i<nums.length){
           if(!set.contains(nums[i]-1)){
             int currLength = 0;
             int base = nums[i];
             while(set.contains(base+currLength)){
                    currLength++;
             }
             ans = Math.max(ans,currLength);
           }
           i++;
        }

        return ans;
    }
}
