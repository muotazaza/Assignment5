package assigment;

import java.util.ArrayDeque;
import java.util.Deque;

public class bracket {

    public static boolean isValid(String s){

        Deque<Character> stack =new ArrayDeque<>();
        for (char c : s.toCharArray()){
            if (c=='('){
                stack.push(c);
            }else if(c==')'){
                if (stack.isEmpty()){
                    return false;
                }
                char top= stack.pop();
                if (c==')' && top!='('){return false;}
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s="(()())";
        String s1="(()))))()";
        System.out.println("isValid(s) = " + isValid(s));
        System.out.println("isValid(s1) = " + isValid(s1));
    }

}
