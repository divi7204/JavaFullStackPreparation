package patterns;
import java.util.Scanner;
public class Pattern92 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		char c='A';
		for(int i=1;i<=n;i++) {
			c+=n-i;
			for(int j=0;j<i;j++) {
				System.out.print(c);
				c++;
			}
			c='A';
			System.out.println();
			
		}
		sc.close();
	}

}
/*Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
*/
