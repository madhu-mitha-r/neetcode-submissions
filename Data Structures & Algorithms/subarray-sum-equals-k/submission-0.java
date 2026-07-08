class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int[] pf = new int[nums.length];
        Map<Integer,Integer> map = new HashMap<>();
        pf[0] = nums[0];
        
        for(int i =1;i<nums.length;i++){
           pf[i] = pf[i-1]+nums[i];
        }

        for(int i =0;i< nums.length;i++){
            if (pf[i] == k){
                ans++;
            }
            int toFind = pf[i]-k;
            if(map.containsKey(toFind)){
                ans+=map.get(toFind);
            }
            map.put(pf[i],map.getOrDefault(pf[i], 0)+1);
            
        }

        return ans;
    }
}