package Algoritm.day4;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

//나는야포켓몬마스터이다솜
public class no1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> pokeDex = new HashMap<>();

        String[] nameArray = new String[N+1];

        for (int i = 1; i < N+1; i++) {
            String name = br.readLine();
            pokeDex.put(name, i);
            nameArray[i] = name;
        }

        for (int i = 0; i < M; i++) {
            String find = br.readLine();
            if (stringOrNumber(find)) {
                int index = Integer.parseInt(find);
                bw.write(nameArray[index] + "\n");
            } else {
                bw.write(String.valueOf(pokeDex.get(find)) + "\n");
            }
        }
        bw.flush();
    }

    public static boolean stringOrNumber(String find) {
        try {
            Integer.parseInt(find);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
