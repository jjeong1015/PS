// -로 생각했어야 하는데 +로 생각해서 오래 걸림
import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int king1, queen1, rook1, bishop1, knight1, pawn1;
    static int king2, queen2, rook2, bishop2, knight2, pawn2;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        king1 = Integer.parseInt(st.nextToken());
        queen1 = Integer.parseInt(st.nextToken());
        rook1 = Integer.parseInt(st.nextToken());
        bishop1 = Integer.parseInt(st.nextToken());
        knight1 = Integer.parseInt(st.nextToken());
        pawn1 = Integer.parseInt(st.nextToken());

    }
    static void logic() {
        king2 = 1 - king1;
        queen2 = 1 - queen1;
        rook2 = 2 - rook1;
        bishop2 = 2 - bishop1;
        knight2 = 2 - knight1;
        pawn2 = 8 - pawn1;

        sb.append(king2).append(" ").append(queen2).append(" ").append(rook2).append(" ").append(bishop2).append(" ").append(knight2).append(" ").append(pawn2).append(" ");
        System.out.println(sb);
    }
}