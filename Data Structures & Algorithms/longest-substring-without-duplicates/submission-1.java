class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        char[] st = s.toCharArray();
        int i =0,j=0, ans = 0;
        while(i<=j && j<st.length){
            while(i<=j && j<st.length && set.contains(st[j])){
                set.remove(st[i]);
                i++;
            }

                set.add(st[j]);
                ans = Math.max(ans,j-i+1);
                j++;
    
            }
            
        

        return ans;

    }
}
