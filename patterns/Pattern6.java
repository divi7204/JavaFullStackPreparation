package patterns;
import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int k=i;
			for(int j=0;j<i;j++) {
				System.out.print(k);
				k--;
			}
			System.out.println();
		}
		sc.close();
	}

}
/*Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321
*/
