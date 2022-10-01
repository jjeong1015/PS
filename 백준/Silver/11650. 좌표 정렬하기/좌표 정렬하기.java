import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N, X, Y;
    static XY coordinate[];
    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static class XY implements Comparable<XY> {
        int X, Y;
        public XY(int X, int Y) {
            this.X = X;
            this.Y = Y;
        }

        public int compareTo(XY other) {
            if ((other.X == this.X)) {
                return Integer.compare(this.Y, other.Y);
            }
            else {
                return Integer.compare(this.X, other.X);
            }
        }
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        coordinate = new XY[N];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());
            coordinate[i] = new XY(X, Y);
        }
    }

    static void logic() {
        sb = new StringBuilder();
        Arrays.sort(coordinate);
        for (int i=0; i<N; i++) {
            sb.append(coordinate[i].X).append(" ").append(coordinate[i].Y).append("\n");
        }
        System.out.println(sb);
    }
}