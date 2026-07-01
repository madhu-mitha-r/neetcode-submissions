class Solution {
    public boolean isAnagram(String s, String t) {
      
      if(s.length() != t.length()){
        return false;
      }

      int i =0;
      int j =0;
      boolean ans = false;
      
      char[] s1 = s.toCharArray();
      char[] s2= t.toCharArray();
      
      while(i<s1.length && j< s2.length){
        if (s1[i] != s2[j]){
            j++;
        }else{
            s2[j] = '0';
            i++;
            j=0;
        }
      }
      
      return i == s.length();
    }
}
