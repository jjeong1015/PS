// sb를 어디에 둬야 하는지 몰라 헤맴
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;
    static int A[][], B[][];

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N][M];
        B = new int[N][M];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        /*
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                System.out.print(A[i][j] + " ") ;
            }
            System.out.println("");
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }
        */
    }
    static void logic() {
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                sb.append(A[i][j]+B[i][j]+" ");
                //System.out.println(sb); // 하나 추가될 때마다 뜸
                //AB[i][j] = A[i][j] + B[i][j];
                //System.out.print(AB[i][j] + " ") ;
            }
            //sb.append(A[i][j]+B[i][j]+" ");
            //System.out.println(sb);
            sb.append("\n"); // j 끝날 때마다 개행 문자
            //System.out.println(sb);
            //System.out.println("");
        }
        //sb.append("\n");
        System.out.println(sb); // for문 다 돌면 출력하기
    }
}
