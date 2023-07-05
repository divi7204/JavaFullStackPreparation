package patterns;
import java.util.Scanner;
public class PatternAdv3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int k=0;
	for(int i=1;i<=n;i++)
	{
		for(int j=0;j<n-i;j++) {
			System.out.print(" ");
		}
		for(int j=n-i;j<n+k;j++) {
			System.out.print("*");
		}
		System.out.println();
		k++;
	}
	sc.close();
	}

}
/*Print the following pattern
Pattern for N = 4
...*
..***
.*****
*******
*/