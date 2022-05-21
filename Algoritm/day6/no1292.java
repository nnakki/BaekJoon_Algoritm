package Algoritm.day6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class no1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());       //시작숫자
        int B = Integer.parseInt(st.nextToken());       //끝숫자

        List<Integer> numbers = new ArrayList<>();
        int inputNum = 1;

        while (numbers.size() <= 1000) {
            for (int j = 0; j < inputNum; j++) {
                numbers.add(inputNum);
            }
            inputNum++;
        }

        int sum = 0;

        for (int i = A-1; i < B; i++) {
            sum += numbers.get(i);
        }

        System.out.println(sum);
    }
}

