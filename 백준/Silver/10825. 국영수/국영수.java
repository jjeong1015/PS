import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N;
    static Student Score[];

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static class Student implements Comparable<Student> {
        String name;
        int kor, eng, math;
        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public int compareTo(Student other) {
            // this가 앞에 있을 경우 오름차순(일반적), other가 앞에 있을 경우 -> 내림차순
            if ((other.kor == this.kor) && (other.eng == this.eng) && (other.math == this.math)) {
                return this.name.compareTo(other.name);
            }
            else if ((other.kor == this.kor) && (other.eng == this.eng)) {
                return Integer.compare(other.math, this.math);
            }
            else if(other.kor == this.kor) {
                return Integer.compare(this.eng, other.eng);
            }
            else {
                return Integer.compare(other.kor, this.kor);
            }
        }
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        Score = new Student[N];

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            Score[i] = new Student(name, kor, eng, math);
        }

        //System.out.println(Score[0].name);
    }

    static void logic() {
        Arrays.sort(Score);
        for (int i=0; i<N; i++) {
            sb.append(Score[i].name).append("\n");
        }
        System.out.println(sb);
    }
}