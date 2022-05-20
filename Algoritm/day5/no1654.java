package Algoritm.day5;


import java.io.*;
import java.util.StringTokenizer;

public class no1654 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //현재 가진 랜선의 갯수
        int K = Integer.parseInt(st.nextToken());
        //만들어야 할 랜선의 갯수
        int N = Integer.parseInt(st.nextToken());

        //들어오는 랜선 값들을 저장할 배열
        int[] array = new int[K];
        //랜선 중 가장 긴 길이의 랜선
        long maxLength = 0;

        for (int i = 0; i < array.length; i++) {
            int number = Integer.parseInt(br.readLine());
            array[i] = number;
            if (maxLength < array[i]) {
                maxLength = array[i];
            }
        }

        maxLength++;
        //이진탐색
        long minLength = 0;
        long middle = 0;

        while (minLength < maxLength) {
            middle = (maxLength + minLength) / 2;
            long cnt = 0;

            for (int i = 0; i < array.length; i++) {
                cnt += (array[i] / middle);
            }

            if (cnt < N) {
                maxLength = middle;
            } else {
                minLength = middle + 1;
            }
        }
        System.out.println(minLength - 1);
    }
}

