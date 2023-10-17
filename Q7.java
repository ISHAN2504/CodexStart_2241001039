/*
 * Name: Ishan Agrawal
 * Reg No: 2241001039
 * PS LINK: https://cses.fi/problemset/task/1618
 */
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long current = 5;
		long answer = 0;
		while(current <= n)
		{
			answer = answer + n/current;
			current=current*5;
		}
		System.out.println(answer);
	}

}
