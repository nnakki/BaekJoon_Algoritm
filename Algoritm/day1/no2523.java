package Algoritm.day1;

import java.util.Scanner;

//별찍기
public class no2523 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();                   // int형 입력 및 리턴

        for (int i = 1; i <= (2 * n - 1); i++) {
            if (i <= n) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < (2 * n - i); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
