class Solution {
    public int calPoints(String[] operations) {
     Stack<Integer> stack = new Stack<>();
     int ans = 0;
     for(String s : operations){
        if(s.equals("+")){
          int x = stack.pop();
          int y = stack.pop();
          int z = x+y;
          stack.push(y);
          stack.push(x);
          stack.push(z);
        }else if(s.equals("D")){
          stack.push(stack.peek() * 2);  
        }else if(s.equals("C")){
            stack.pop();
        }else {
            stack.push(Integer.parseInt(s));
        }
     }
     
     while(!stack.isEmpty()){
      ans+=stack.pop();
     }

     return ans;
    }
}