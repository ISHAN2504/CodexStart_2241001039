/*
 * Name: Ishan Agrawal
 * Reg No: 2241001039
 * PS LINK: https://cses.fi/problemset/task/1068
 */
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		System.out.print(n+" ");
		while(n!=1)
		{
			if(n%2==0)
			{
				n=n/2;
				System.out.print(n+" ");
			}
			else if(n%2!=0)
			{
				n=(n*3)+1;
				System.out.print(n+" ");
			}
		}
	}

}
