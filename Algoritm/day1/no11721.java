package Algoritm.day1;

import java.util.Scanner;

import static java.lang.System.in;

// 열 글자씩 끊어찍기
public class no11721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String str = scanner.nextLine();
        int str_len = str.length();

        for (int i = 0; i < str_len; i++) {
            char charAt = str.charAt(i);
            if (i > 0 && i % 10 == 0) {
                System.out.println("");
            }
            System.out.print(charAt);
        }
    }
}

