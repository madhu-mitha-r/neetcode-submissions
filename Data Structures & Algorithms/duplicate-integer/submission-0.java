class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean ans = false;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int num: nums){
            if(map.containsKey(num)){
                ans = true;
            }else{
                map.put(num,1);
            }
        }

        return ans;
    }
}