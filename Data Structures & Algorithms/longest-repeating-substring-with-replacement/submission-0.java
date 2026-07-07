class Solution {
    public int characterReplacement(String s, int k) {
        char[] st = s.toCharArray();
        int ans = 0;
        
        
        for(int i =0;i<st.length;i++){
            int maxChar = 0;
            HashMap<Character,Integer> count = new HashMap<>();
            for(int j = i;j<st.length;j++){
                count.put(st[j],count.getOrDefault(st[j], 0)+1);
                maxChar = Math.max(maxChar,count.get(st[j]));
                int replacements = (j-i+1) - maxChar;
                if ( replacements <= k){
                  ans = Math.max(ans, j-i+1);
                }
            }
            

        }
        return ans;
    }
}
