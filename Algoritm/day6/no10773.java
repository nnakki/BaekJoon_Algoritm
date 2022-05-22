package Algoritm.day6;

import java.io.*;
import java.util.Stack;

//제로
public class no10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        while (K-- > 0) {
            int num = Integer.parseInt(br.readLine());

            switch (num) {
                case 0:
                    stack.pop();
                    break;
                default:
                    stack.push(num);
                    break;
            }
        }

        int sum = 0;

        if (stack.isEmpty()) {
            sum = 0;
        } else {
            for (int i = 0; i < stack.size(); i++) {
                sum += stack.get(i);
            }
        }
        System.out.println(sum);
    }
}
