// Last updated: 09/07/2026, 10:04:57
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char i: s.toCharArray()){
            if(i=='[' || i=='(' || i=='{'){
                stack.push(i);
            }
            else{
                if(!stack.empty()){
                    if(i==')' && stack.pop()!='('){
                        return false; 
                        
                    }
                    else if(i==']' && stack.pop()!='['){
                        return false; 
                        
                    }
                    else if (i=='}' && stack.pop()!='{'){
                        return false;
                        
                    }
                }
                else{
                    return false ; 
                                
            }
        }
        
    }
    if(stack.empty()==true)
    return true;
    else
    return false;
}
}