import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int money, change, type = 0;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        money = Integer.parseInt(br.readLine());
    }

    static void logic() {
        change = 1000 - money;

        if (change / 500 >= 0) {
            type += change / 500;
            change = change % 500;
        }
        if (change / 100 > 0) {
            type += change / 100;
            change = change % 100;
        }
        if (change / 50 > 0) {
            type += change / 50;
            change = change % 50;
        }
        if (change / 10 > 0) {
            type += change / 10;
            change = change % 10;
        }
        if (change / 5 > 0) {
            type += change / 5;
            change = change % 5;
        }
        if (change / 1 > 0) {
            type += change / 1;
            change = change % 1;
        }
        
        sb.append(type).append("\n");
        System.out.println(sb);
    }
}
