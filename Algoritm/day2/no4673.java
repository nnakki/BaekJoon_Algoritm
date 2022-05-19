package Algoritm.day2;

import java.util.ArrayList;
import java.util.Scanner;

//셀프넘버
public class no4673 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> allNumber = new ArrayList<>();
        ArrayList<Integer> hasConstructorNumber = new ArrayList<>();

        //입력한 숫자까지의 숫자를 전부 담는 리스트 생성
        for (int i = 0; i < n; i++) {
            allNumber.add(i);
        }

        //입력한 숫자까지의 생성자로 만들어지는 숫자를 담는 리스트 생성
        for (int i = 0; i < n; i++) {
            int constructorNum = i;
            int man = i / 10000;
            int cheon = (i % 10000) / 1000;
            int baek = (i % 1000) / 100;
            int sib = (i % 100) / 10;
            int il = i % 10;
            int selfNum = constructorNum + man + cheon + baek + sib + il;
            hasConstructorNumber.add(selfNum);
        }

        //두 리스트를 비교 후, 중복 삭제 (셀프넘버만 남는 리스트 생성)
        allNumber.removeAll(hasConstructorNumber);

        for (int i = 0; i < allNumber.size(); i++) {
            int selfNumber = allNumber.get(i);
            System.out.println(selfNumber);
        }
    }
}
