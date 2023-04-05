package linklist;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
         String strings = "abcde";

        System.out.println(strings);
        Stack<String> stringStack = new Stack<>();
        for(int i=0;i<strings.length();i++){
            stringStack.add(String.valueOf(strings.charAt(i)));
        }

        String newStr = "";
        while (!stringStack.isEmpty()){
            newStr += stringStack.pop();
        }
        System.out.println(newStr);

    }
}
