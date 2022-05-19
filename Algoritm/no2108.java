package Algoritm;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class no2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        int sum = 0;
        double average = 0;
        int mostNumber = 0;
        int middle = 0;
        int range = 0;

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());
            numbers[i] = number;
        }

        //산술평균 구하기
        for (int number : numbers) {
            sum += number;
        }
        average = (double) Math.round((double) sum / (double) numbers.length);
        bw.write(String.valueOf((int) average) + "\n");

        //중앙값 출력하기
        Arrays.sort(numbers);
        middle = numbers[(int) numbers.length / 2];
        bw.write(String.valueOf(middle) + "\n");

        //최빈값 출력하기
        int[] count = new int[N];
        int maxCount = -1;
        ArrayList<Integer> mostNumbers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (numbers[i] == numbers[j]) {
                    count[i]++;
                } else {
                    count[i] = 0;
                }
            }
            if (count[i] >= maxCount) {
                maxCount = count[i];
                mostNumbers.add(numbers[i]);
            }
        }

        Collections.sort(mostNumbers);
        if (mostNumbers.size() > 1) {
            mostNumber = mostNumbers.get(1);
        }else{
            mostNumber = mostNumbers.get(0);
        }

        bw.write(String.valueOf(mostNumber) + "\n");

        //최대, 최솟값차이 (범위)
        range = Math.abs(numbers[N - 1] - numbers[0]);
        bw.write(String.valueOf(range) + "\n");

        bw.flush();
    }
}
