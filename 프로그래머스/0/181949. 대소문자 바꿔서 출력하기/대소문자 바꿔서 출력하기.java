import java.util.Scanner;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b[] = new char[a.length()];
        for (int i=0; i<a.length(); i++) {
            if (a.charAt(i) >= 'a') {
                b[i] = (char)(a.charAt(i) - 32);
            } else {
                b[i] = (char)(a.charAt(i) + 32);
            }
            System.out.print(b[i]);
        }
    }
}