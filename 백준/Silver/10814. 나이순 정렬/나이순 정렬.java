import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N, age, index;
    static String name;
    static Judge join[];
    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static class Judge implements Comparable<Judge> {
        int age;
        String name;
        public Judge(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int compareTo(Judge other) {
            if ((other.age != this.age)) {
                return Integer.compare(this.age, other.age);
            }
            else {
                return 0;
            }
        }
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        join = new Judge[N];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            age = Integer.parseInt(st.nextToken());
            name = st.nextToken();
            join[i] = new Judge(age, name);
        }
    }

    static void logic() {
        sb = new StringBuilder();
        Arrays.sort(join);
        for (int i=0; i<N; i++) {
            sb.append(join[i].age).append(" ").append(join[i].name).append("\n");
        }
        System.out.println(sb);
    }
}
