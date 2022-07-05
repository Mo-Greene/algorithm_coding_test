package week2.ct1;

import java.util.Scanner;
import java.util.Stack;

public class ct1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++){
            String input = sc.next();

            if(input.contains("push")){
                int input2 = sc.nextInt();
                stack.push(input2);

            } else if(input.equals("pop")){
                System.out.println(stack.isEmpty()? -1 : stack.pop());

            } else if(input.equals("size")){
                System.out.println(stack.size());

            } else if(input.equals("empty")){
                System.out.println(stack.isEmpty()? -1 : 0);

            } else if(input.equals("top")){
                System.out.println(stack.isEmpty()? -1 : stack.peek());

            }
        }

    }
}
