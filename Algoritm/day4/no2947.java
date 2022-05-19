package Algoritm.day4;

import java.io.*;
import java.util.StringTokenizer;

//나무조각(버블정렬)
public class no2947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String numbers = br.readLine();
        StringTokenizer st = new StringTokenizer(numbers);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            int str = Integer.parseInt(st.nextToken());
            arr[i] = str;
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[j] > arr[j + 1]) {
                   int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    for (int a : arr) {
                        System.out.print(a + "\t");
                    }
                    System.out.println();
                }
            }
        }
    }
}