import java.util.*;
public class minimumAdd_toMake_ParenthesesValid {
    public static void main(String[] args) {
        String s="())))((()";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push('(');
            }
            if(ch==')'){
            
                if(stack.isEmpty()|| stack.peek()==')'){
                    stack.push(')');
                }
                else
                stack.pop();
            }
        }
        
        System.out.println(stack.size());
    }
    
}
