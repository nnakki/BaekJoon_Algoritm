package Algoritm.day6;

import java.io.*;
import java.util.*;

//DFS와 BFS
public class no1260 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static int n, m, v;

    public static List<Integer> list[] = new LinkedList[1001];
    public static Queue<Integer> q = new LinkedList<>();
    static boolean[] visit = new boolean[1001];

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());   //정점의개수
        m = Integer.parseInt(st.nextToken());   //간선의개수
        v = Integer.parseInt(st.nextToken());   //탐색을 시작할 정점의 번호

        for (int i = 1; i <= n; i++) {
            list[i] = new LinkedList<>();      // 리스트 초기화
        }

        //인접리스트 생성
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list[s].add(e);
            list[e].add(s);
        }

        dfs(v);
        sb.append("\n");

        visit = new boolean[1001];
        bfs(v);

        System.out.println(sb);
    }

    public static void bfs(int now) throws IOException {
        q.add(now);
        visit[now] = true;

        while (!q.isEmpty()) {
            now = q.poll();
            sb.append(now).append(" ");
            for (int i = 0; i < list[now].size(); i++) {
                Collections.sort(list[now]);
                int next = list[now].get(i);
                if (visit[next]) {
                    continue;
                }
                q.add(next);
                visit[next] = true;
            }
        }
    }

    public static void dfs(int now) throws IOException {
        Collections.sort(list[now]);
        visit[now] = true;
        sb.append(now).append(" ");
        int size = list[now].size();
        for (int i = 0; i < size; i++) {
            int next = list[now].get(i);
            if (visit[next]) continue;
            dfs(next); // 다음 정점으로 이동
        }
    }
}

