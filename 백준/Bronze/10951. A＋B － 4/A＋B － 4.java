import java.util.*;
// https://www.acmicpc.net/board/view/39199

public class Main {
    //static BufferedReader br;
    //static StringBuilder sb;
    static StringTokenizer st;
    static int T;
    static int A, B, count;

    public static void main(String[] args) {
        input();
        logic();
    }

    static void input() {
        //sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        /*
        while (true) {
            A = scanner.nextInt();
            B = scanner.nextInt();

            if ((A == 0) && (B == 0)) {
                break;
            }

            System.out.println(A+B);
        }
        */
        while(scanner.hasNextInt()) {
            A = scanner.nextInt();
            B = scanner.nextInt();
            System.out.println(A+B);
        }
    }

    static void logic() {
        //System.out.println(A+B);
    }
}
