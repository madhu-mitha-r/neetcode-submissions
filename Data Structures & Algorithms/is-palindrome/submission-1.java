class Solution {
    public boolean isPalindrome(String s) {
        char[] actualString = s.toLowerCase().toCharArray();
        int i = 0;
        int j = actualString.length - 1;
        int n = actualString.length;
        boolean ans = true;
        
        while(i < j){
            if(i < n && !Character.isLetterOrDigit(actualString[i])){
              i++;
              continue;
            }
            
            if(j >= 0 && !Character.isLetterOrDigit(actualString[j])){
               j--;
               continue;
            }

            if(i < j && actualString[i]!=actualString[j]){
                ans = false;
                break;

            }else{
             i++;
             j--;
            }
            
        }

        return ans;
    }
}