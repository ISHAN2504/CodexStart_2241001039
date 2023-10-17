/*
 * Name: Ishan Agrawal
 * Reg No: 2241001039
 * PS LINK: https://cses.fi/problemset/task/1617
 */
import java.util.Scanner;
public class Q2 {
	public static final int mod = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int a = 1;
		for(int i = 0;i<n;i++)
		{
			a=a*2;
			a = a% mod;
		}
		System.out.println(a);
	}

}
