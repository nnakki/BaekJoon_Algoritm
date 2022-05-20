package Algoritm.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1748 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int countNumber = 1;
        int numLength = 10;

        for (int i = 1; i <= n; i++) {
            if (i == numLength) {
                numLength *= 10;
                countNumber++;
            }
            result += countNumber;
        }
        System.out.println(result);
    }
}
