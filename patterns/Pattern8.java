package patterns;
import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		char c='A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(c+" ");
			}
			System.out.println();
			c++;
		}
		sc.close();
	}

}
/*Print the following pattern for the given N number of rows.
Pattern for N = 3
A
BB
CCC
*/