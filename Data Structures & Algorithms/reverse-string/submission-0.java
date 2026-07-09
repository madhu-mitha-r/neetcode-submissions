class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length-1;
        while(i<j){
         char ch = s[j];
         s[j] = s[i];
         s[i] = ch;
         i++;
         j--;
        }

    }
}