import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int A, B, numA, numB;
    static HashSet<Integer> hsetA = new HashSet<>();
    static HashSet<Integer> hsetB = new HashSet<>();
    static HashSet<Integer> hsetA_temp = new HashSet<>();
    static HashSet<Integer> hsetB_temp = new HashSet<>();

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<A; i++) {
            numA = Integer.parseInt(st.nextToken());
            hsetA.add(numA);
            hsetA_temp.add(numA);
        }
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<B; i++) {
            numB = Integer.parseInt(st.nextToken());
            hsetB.add(numB);
            hsetB_temp.add(numB);
        }
    }

    static void logic() {
        hsetA.removeAll(hsetB_temp);
//        for (int i : hsetA) { // 1
//            sb.append(i).append(" ");
//        }
        //sb.append("A size : ").append(hsetA.size()); // A 개수 확인
        hsetB.removeAll(hsetA_temp);
//        for (int i : hsetB) { // 3 5 6
//            sb.append(i).append(" ");
//        }
        //sb.append("B size : ").append(hsetB.size()); // // B 개수 확인
        sb.append(hsetA.size()+hsetB.size());
        System.out.println(sb);
    }
}