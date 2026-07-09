class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Set<Character> openBrackets = new HashSet<>();
        
        openBrackets.addAll(Arrays.asList('(','{','['));
        
        for(char ch : s.toCharArray()){
         if(openBrackets.contains(ch)){
            stack.push(ch);
         }
         else {
           if(stack.isEmpty()) return false; 
           if(ch == '}' && stack.peek()!='{') return false;
           if(ch == ']' && stack.peek()!='[') return false;
           if(ch == ')' && stack.peek()!='(') return false;
           stack.pop();
         }
        }

        return stack.isEmpty() ? true : false;
    }
}
