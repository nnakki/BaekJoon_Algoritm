package Algoritm;

import java.util.Scanner;

import static java.lang.System.in;

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

