import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>(); 

        for(int i = 0; i < operations.length; i++){
            String str = operations[i]; 
            if( str.equals("C")){
                if(!stack.isEmpty()){
                    stack.pop(); 
                }
            } else if(str.equals("D")){
                if(!stack.isEmpty()){
                    int num = 2 * stack.peek(); 
                    stack.push(num); 
                }
            } else if(str.equals("+")){
                if(stack.size() >= 2){
                    int num1 = stack.pop(); 
                    int num2 = stack.peek(); 
                    int num = num1 + num2; 

                    stack.push(num1); 
                    stack.push(num); 
                }
            } else {
                stack.push(Integer.parseInt(str));
            } 
        }

        int total = 0; 
        while(!stack.isEmpty()){
            total = total + stack.pop(); 
        }

        return total; 
    }
}