package Algoritm.day8;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class no1181 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());    // 단어의 개수

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            words[i] = str;
        }

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        bw.write(words[0] + "\n");

        for (int i = 1; i < n; i++) {
            if (!(words[i - 1].equals(words[i])))
                bw.write(words[i] + "\n");
        }

        bw.flush();

    }
}
