import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int A[], result;
    static HashSet<Integer> set = new HashSet<Integer>();
    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        A = new int[10];
        for (int i=0; i<10; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
    }

    static void logic() {
        for (int i=0; i<10; i++) {
            result = A[i] % 42;
            set.add(result);
        }
        System.out.println(set.size());
    }
}
