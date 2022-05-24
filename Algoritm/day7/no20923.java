package Algoritm.day7;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

//숫자 할리갈리
public class no20923 {
    public static Deque<Integer> dd = new ArrayDeque<>();
    public static Deque<Integer> sy = new ArrayDeque<>();
    public static Deque<Integer> dGround = new ArrayDeque<>();
    public static Deque<Integer> sGround = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 카드 갯수
        int M = Integer.parseInt(st.nextToken());   // 게임 진행 횟수

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int dNum = Integer.parseInt(st.nextToken());
            int sNUm = Integer.parseInt(st.nextToken());
            dd.push(dNum);     //처음 들어온 걸 처음에 저장
            sy.push(sNUm);
        }

        int dCard = 0;
        int sCard = 0;

        for (int i = 0; i < M; i++) {
            if (i % 2 == 0) {
                dCard = dd.poll();
                dGround.offer(dCard);
                if (dd.isEmpty()) {
                    System.out.println("su");
                    break;
                }
            } else {
                sCard = sy.poll();
                sGround.offer(sCard);
                if (sy.isEmpty()) {
                    System.out.println("do");
                    break;
                }
            }

            int nowDGround = dGround.size();
            int nowSGround = sGround.size();

            if (dCard == 5 | sCard == 5) {
                for (int g = 0; g < nowSGround; g++) {
                    dd.offer(sGround.poll());
                }
                for (int g = 0; g < nowDGround; g++) {
                    dd.offer(dGround.poll());
                }
                dCard = 0;
                sCard = 0;
            } else if (dCard + sCard == 5) {
                for (int g = 0; g < nowDGround; g++) {
                    sy.offer(dGround.poll());
                }
                for (int g = 0; g < nowSGround; g++) {
                    sy.offer(sGround.poll());
                }
                dCard = 0;
                sCard = 0;
            }
        }


        if (!dd.isEmpty() && !sy.isEmpty()) {
            if (dd.size() > sy.size()) {
                System.out.println("do");
            } else if (dd.size() < sy.size()) {
                System.out.println("su");
            } else {
                System.out.println("dosu");
            }
        }
    }
}
