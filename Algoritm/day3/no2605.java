package Algoritm.day3;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

//줄세우기
public class no2605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int studentNum = Integer.parseInt(br.readLine());

        int[] student = new int[studentNum];

        for (int i = 0; i < studentNum; i++) {
            student[i] = i + 1;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> student_list = new LinkedList<>();

        for (int j = 0; j < studentNum; j++) {
            int raffle = Integer.parseInt(st.nextToken());
            student_list.add(j-raffle, student[j]);
        }

        for(int i=0; i<student_list.size(); i++){
            bw.write(student_list.get(i)+"\n");
        }
        bw.flush();
    }
}
