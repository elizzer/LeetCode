import com.sun.jdi.Value;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        int len=s.length();

        Stack <Character> stack =  new Stack<Character>();
        stack.push(s.charAt(0));
        if(len%2!=0){
            return false;
        }
        for(int i=1;i<len;i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else{
                char temp = stack.peek();
                char temp1 = s.charAt(i);
                int flag=0;
                if(temp=='[' && temp1==']'){
                    flag=1;
                } else if (temp=='{' && temp1=='}' ) {
                    flag=1;
                } else if (temp == '(' && temp1==')') {
                    flag=1;
                }
                else{
                    flag=0;
                }
                if(flag==1){
                    System.out.println(stack.pop());
                }else{
                    stack.push(s.charAt(i));
                }
            }

        }
        System.out.println(stack);
        return stack.isEmpty();
    }
}
