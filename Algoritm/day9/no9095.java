package Algoritm.day9;

import java.io.*;

public class no9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int[] arr = new int[11];

        arr[0] = 0;
        arr[1] = 1;     // 더해서 1를 만드는 경우의 수
        arr[2] = 2;     // 더해서 2을 만드는 경우의 수
        arr[3] = 4;     // 더해서 3을 만드는 경우의 수

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 4; j <= n; j++) {
                arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3];
            }
            System.out.println(arr[n]);
        }
    }
}
