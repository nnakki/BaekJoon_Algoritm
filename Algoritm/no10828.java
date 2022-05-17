package Algoritm;

import java.util.Scanner;
import java.util.Stack;

//스택
//push X: 정수 X를 스택에 넣는 연산이다.
//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 스택에 들어있는 정수의 개수를 출력한다.
//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
public class no10828 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            String str = sc.next();
            if(str.contains("push")){
                int inputNumber = sc.nextInt();
                stack.push(inputNumber);
            }else if(str.equals("pop")){
                System.out.println(stack.isEmpty()?-1:stack.pop());
            }else if(str.equals("size")){
                System.out.println(stack.size());
            }else if(str.equals("empty")){
                System.out.println(stack.isEmpty()?1:0);
            }else if(str.equals("top")){
                System.out.println(stack.isEmpty()?-1:stack.peek());
            }
        }
    }
}
