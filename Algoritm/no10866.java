package Algoritm;

import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

//덱
//push_front X: 정수 X를 덱의 앞에 넣는다.
//push_back X: 정수 X를 덱의 뒤에 넣는다.
//pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 덱에 들어있는 정수의 개수를 출력한다.
//empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
//front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.

public class no10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push_back":
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;

                case "push_front":
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;

                case "pop_front":
                    if (dq.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(dq.pollFirst() + "\n");
                    }
                    break;

                case "pop_back":
                    if (dq.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(dq.pollLast() + "\n");
                    }
                    break;

                case "size":
                    bw.write(dq.size() + "\n");
                    break;

                case "empty":
                    bw.write(dq.isEmpty() ? "1\n" : "0\n");
                    break;

                case "front":
                    if (dq.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(dq.peekFirst() + "\n");
                    }
                    break;

                case "back":
                    if (dq.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(dq.peekLast() + "\n");
                    }
                    break;
            }
        }
        bw.flush();
    }
}
