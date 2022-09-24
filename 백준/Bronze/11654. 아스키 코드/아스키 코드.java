import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static char N;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = br.readLine().charAt(0);
    }

    static void logic() {
        System.out.println((int)N);
    }
}
