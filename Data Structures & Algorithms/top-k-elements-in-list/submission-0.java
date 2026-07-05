class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        List<List<Integer>> freq = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i =0;i<nums.length;i++){
            freq.add(new ArrayList<Integer>());
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        freq.add(new ArrayList<Integer>());
         
         map.forEach((key,value)->{
            freq.get(value).add(key);
         });       
         
         int i =nums.length, j= 0;

          while(i>=0 && j<k){
            List<Integer> count = freq.get(i);
            int l = 0;
            while(j<k && l<count.size()){
              ans[j] = count.get(l);
              l++;
              j++;
            }
            i--;
          } 



        return ans;
    }
}
