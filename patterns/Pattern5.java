package patterns;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int k=n;
			for(int j=0;j<i;j++) {
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
		sc.close();
	}

}
/*Print the following pattern for the given N number of rows.
Pattern for N = 5
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1
*/
