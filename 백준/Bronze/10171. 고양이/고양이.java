import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
    }

    static void logic() {
        sb.append("\\    /\\").append("\n");
        sb.append(" )  ( ')").append("\n");
        sb.append("(  /  )").append("\n");
        sb.append(" \\(__)|").append("\n");
        System.out.println(sb);
    }
}