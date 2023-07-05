package patterns;
import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			char c='A';
			for(int j=0;j<i;j++) {
				System.out.print(c+" ");
				c+=1;
			}
			System.out.println();
		}
		sc.close();
	}

}
/*Print the following pattern for the given N number of rows.
Pattern for N = 3
A
A B
A B C
*/