package Balancepackage;

import java.util.Stack;

public class BalanceClass {
    public static void main(String[] args) {
        haveBalance("( { } ) [ ] < >");
        haveBalance("( { ) [ } ] < >");
    }

    private static void haveBalance(String s) {
        if(s.length()==0) return;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char bs = s.charAt(i);
            switch(bs){
                case '(': stack.push("(");
                    break;
                case '{': stack.push("{");
                    break;
                case '[': stack.push("[");
                    break;
                case '<': stack.push("<");
                    break;
                case ')': 
                    if(stack.pop()!="(") {
                        System.out.println("Unbalanced Parentheses");
                        return;}
                    break;
                case '}': 
                    if(stack.pop()!="{"){
                        System.out.println("Unbalanced Parentheses");
                        return;}
                    break;
                case ']': 
                    if(stack.pop()!="[") {
                        System.out.println("Unbalanced Parentheses");
                        return;}
                    break;
                case '>': 
                    if(stack.pop()!="<") {
                        System.out.println("Unbalanced Parentheses");
                        return;}
                    break;
            }
        }
        System.out.println("Balanced Parentheses");
    }
}
