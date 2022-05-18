package Algoritm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//하얀 칸
public class no1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] chess = new char[8][8];
        int count = 0;

        for (int i = 0; i < 8; i++) {
            String pieces = br.readLine();
            for (int j = 0; j < 8; j++) {

                chess[i][j] = pieces.charAt(j);

                if (chess[i][j] == 'F') {
                    if (i % 2 == 0 && j % 2 == 0) {
                        count++;
                    } else if (i % 2 != 0 && j % 2 != 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}