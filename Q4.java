/*
 * Name: Ishan Agrawal
 * Reg No: 2241001039
 * PS LINK: https://cses.fi/problemset/task/1069/
 */
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 1;
        int max = 1;
        char[] arr = str.toCharArray();
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i]==arr[i-1])
            {
                count++;
            }
            else
            {
                if (count>max)
                    max=count;
                	count=1;
            }
        }
        if (count>max)
            max=count;
        System.out.println(max);
    }
}