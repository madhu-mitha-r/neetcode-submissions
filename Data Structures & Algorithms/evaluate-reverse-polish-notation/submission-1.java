class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();

        for(String s :tokens){
            switch(s){
                case "+":{
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(x + y);
                    break;
                }
                case "*":{
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(x * y);
                    break;
                }
                case "-":{
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(y-x);
                    break;
                }
                case "/":{
                    int x = stack.pop();
                    int y = stack.pop();
                    stack.push(y/x);
                    break;
                }
                default:{
                    stack.push(Integer.parseInt(s));
                }
            }
        }
        
        return stack.pop();

    }
}
