package Algoritm.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//직사각형에서 탈출
public class no1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] escapeLength = new int[4];

        for (int i = 0; i < 4; i++) {
            escapeLength[i] = Integer.parseInt(st.nextToken());
        }
        escapeLength[2] = escapeLength[2] - escapeLength[0];
        escapeLength[3] = escapeLength[3] - escapeLength[1];

        Arrays.sort(escapeLength);

        System.out.println(escapeLength[0]);
    }
}
