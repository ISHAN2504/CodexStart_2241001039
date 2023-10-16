/*
 * Name: Ishan Agrawal
 * Reg No: 2241001039
 * PS LINK: https://cses.fi/problemset/task/1083
 */
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] arr = new boolean[n];
        for (int i = 0; i < n - 1; ++i) {
            int temp = sc.nextInt();
            arr[temp - 1] = true;
        }
        for (int i = 0; i < n; ++i) {
            if (!arr[i]) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}