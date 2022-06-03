package Algoritm.day9;

import java.io.*;
import java.util.StringTokenizer;

public class no10211 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            int[] array = new int[n];
            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                array[i] = Integer.parseInt(st.nextToken());
            }

            int answer = findMaxSum(array);
            bw.write(answer);
        }
        bw.flush();
        bw.close();
    }

    private static int findMaxSum(int[] array) {
        return 0;
    }
}
