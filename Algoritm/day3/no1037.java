package Algoritm.day3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//약수
public class no1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] yaksu = new int[count];

        for (int i = 0; i < count; i++) {
            int str = Integer.parseInt(st.nextToken());
            yaksu[i] = str;
        }

        Arrays.sort(yaksu);
        System.out.println(yaksu[0]*yaksu[count-1]);
    }
}
