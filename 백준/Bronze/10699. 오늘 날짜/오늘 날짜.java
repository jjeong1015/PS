import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

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
        SimpleDateFormat dateformatter = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date();
        sb.append(dateformatter.format(today));
        System.out.println(sb);
    }
}