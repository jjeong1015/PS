import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        sb.append("강한친구 대한육군").append("\n");
        sb.append("강한친구 대한육군").append("\n");
        System.out.println(sb);
    }
}