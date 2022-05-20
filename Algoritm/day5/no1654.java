package Algoritm.day5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class no1654 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            arr.add(i, num);
        }

        Collections.sort(arr);

        int targetLength = arr.get(0);
        int countSum = 0;

        while (countSum < N) {
            for (int i = 0; i < K; i++) {
                int countByLine = arr.get(i) / targetLength;
                countSum += countByLine;
            }
            if (countSum < N) {
                targetLength -= 1;
                countSum = 0;
            }
        }
        System.out.println(targetLength);
    }
}

