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
        sb.append("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE").append("\n");
        sb.append("N2 Bomber      Heavy Fighter  Limited    21        ").append("\n");
        sb.append("J-Type 327     Light Combat   Unlimited  1         ").append("\n");
        sb.append("NX Cruiser     Medium Fighter Limited    18        ").append("\n");
        sb.append("N1 Starfighter Medium Fighter Unlimited  25        ").append("\n");
        sb.append("Royal Cruiser  Light Combat   Limited    4         ").append("\n");
        System.out.println(sb);
    }

}