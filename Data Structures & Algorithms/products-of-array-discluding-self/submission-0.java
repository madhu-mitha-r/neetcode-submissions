class Solution {
    public int[] productExceptSelf(int[] nums) {
     int[] prefixProduct = new int[nums.length];
     int[] suffixProduct = new int[nums.length];
     int[] ans = new int[nums.length];
     
     prefixProduct[0] = nums[0];
     suffixProduct[nums.length-1] = nums[nums.length-1];

     for(int i = 1 ; i < nums.length; i++){
        prefixProduct[i] = prefixProduct[i-1] * nums[i];
     }

     for(int j = nums.length-2; j>=0;j--){
            suffixProduct[j] = suffixProduct[j+1] * nums[j];
     }
     ans[0] = suffixProduct[1];
     ans[nums.length-1] = prefixProduct[nums.length-2];

     for(int i = 1; i<nums.length-1;i++){
        ans[i] = prefixProduct[i-1] * suffixProduct[i+1];
     }
    
     return ans;
    }
}  
