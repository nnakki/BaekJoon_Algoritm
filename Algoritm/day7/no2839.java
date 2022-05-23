package Algoritm.day7;

import java.util.Scanner;

public class no2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int answer = 0;

        while (true) {
            if (N % 5 == 0) {
                answer += N / 5;
                System.out.println(answer);
                break;
            } else {
                N -= 3;
                answer++;
            }
            if (N < 0) {
                System.out.println("-1");
                break;
            }
        }
    }
}
