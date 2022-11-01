package Collections.List.Vector.Stack;

import java.util.Stack;

public class StackExmpl2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack <>();
        stack.push("Zaur");
        stack.push("Misha");
        stack.add("Oleg");
        stack.push("Kate");
        System.out.println(stack);
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
