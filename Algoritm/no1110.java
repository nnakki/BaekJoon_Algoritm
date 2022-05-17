package Algoritm;

import java.util.Scanner;

//더하기 사이클
public class no1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetNum = sc.nextInt();
        int tempNum = 0;

        //십의자리
        int tens = (targetNum) / 10;
        //일의자리
        int units = (targetNum) % 10;
        tempNum = units * 10 + (units + tens) % 10;
        int count = 1;

        while (tempNum != targetNum) {
            tens = tempNum / 10;
            units = tempNum % 10;
            tempNum = units * 10 + (units + tens) % 10;
            count++;
        }
        System.out.println(count);
    }
}

