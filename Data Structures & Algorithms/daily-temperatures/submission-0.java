class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     Stack<Integer> stack = new Stack();
     int n = temperatures.length;
     int[] ans = new int[n];
     
     ans[n-1] = 0;
     stack.push(n-1);
     
     for(int i = n-2;i>=0;i--){
       while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
           stack.pop();
       }
       if(stack.isEmpty()){
        ans[i] =0;
       }else{
        int index = stack.peek();
        ans[i] = index-i;
       }

       stack.push(i);
     }

     return ans;
    }
}
