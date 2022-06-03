package Algoritm.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt2 = 0;
        int cnt5 = 0;

        for (int i = 1; i <= n; i++) {
            int target = i;

            while (target % 2 == 0) {
                cnt2++;
                target = target / 2;
            }

            while (target % 5 == 0) {
                cnt5++;
                target = target / 5;
            }
        }
        System.out.println(Math.min(cnt2, cnt5));
    }
}
