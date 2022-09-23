import java.util.*;

public class Main {
    static int A, B;

    public static void main(String[] args) {
        input();
        logic();
    }

    static void input() {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            A = scanner.nextInt();
            B = scanner.nextInt();

            System.out.println(A * B);
        }

    }

    static void logic() {
    }
}
