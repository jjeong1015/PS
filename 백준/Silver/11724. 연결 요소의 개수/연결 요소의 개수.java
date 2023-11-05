import java.io.*;
import java.util.*;

public class Main {
   static BufferedReader br;
   static StringBuilder sb;
   static StringTokenizer st;
   static int N, M;
   static int s, e;
   static int count = 0;
   static boolean visited[];
   static List<Integer> A[];

   public static void main(String[] args) throws IOException {
       input();
       logic();
   }

   static void input() throws IOException {
       br = new BufferedReader(new InputStreamReader(System.in));
       sb = new StringBuilder();
       st = new StringTokenizer(br.readLine());
       N = Integer.parseInt(st.nextToken());
       M = Integer.parseInt(st.nextToken());
       visited = new boolean[N+1];
       A = new ArrayList[N+1]; // ArrayList형 배열을 생성(아파트로 치면 동)
       
       for (int i=1; i<N+1; i++) {
           A[i] = new ArrayList(); // 배열 안에 ArrayList를 생성 (동 안에 호수(동적 배열)를 생성)
       }
       
       for (int i=0; i<M; i++) {
           st = new StringTokenizer(br.readLine());
           s = Integer.parseInt(st.nextToken());
           e = Integer.parseInt(st.nextToken());

           A[s].add(e);
           A[e].add(s);
       }
   }

   static void DFS(int v) {
       if (visited[v]) {
           return;
       }
       visited[v] = true;
       for (int i:A[v]) {
           if (visited[i] == false) {
               DFS(i);
           }
       }
   }

   static void logic() {
       for (int i=1; i<N+1; i++) {
           if (!visited[i]) {
               count++;
               DFS(i);
           }
       }
       sb.append(count);
       System.out.println(sb);
   }
}