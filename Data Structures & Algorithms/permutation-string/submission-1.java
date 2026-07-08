class Solution {
    public boolean checkInclusion(String s1, String s2) {
     int[] count = new int[26]; 
     int[] slidingCount = new int[26];  
     int n = s1.length();
     if ( n > s2.length()){
        return false;
     }
     
     for(int i = 0;i<n;i++){
        count[s1.charAt(i)-'a']++;
        slidingCount[s2.charAt(i)-'a']++;
     }
     
     String primary = Arrays.toString(count);

     int i = 0, j = n-1;
     
     
     while(j < s2.length()){
         if (primary.equals(Arrays.toString(slidingCount))){
            return true;
         }
         slidingCount[s2.charAt(i)-'a']--;
         i++;

         j++;
         if(j<s2.length()) slidingCount[s2.charAt(j)-'a'] ++;
     }

    return false;
     
    }
}
