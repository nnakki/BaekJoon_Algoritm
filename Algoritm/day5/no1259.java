package Algoritm.day5;

import java.io.*;
import java.util.ArrayList;

//펠린드롬수
public class no1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "";

        while (!(str.equals("0"))) {
            str = br.readLine();
            boolean check = true;

            if(str.equals("0")){
                break;
            }

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != (str.charAt(str.length() - 1 - i))) {
                    check = false;
                    break;
                }
            }
            if (check) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }
        bw.flush();
    }
}
