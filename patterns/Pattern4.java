package patterns;
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=0;j<i;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
	sc.close();
	}

}
/*Print the following pattern for the given N number of rows.
Pattern for N = 4
1
22
333
4444
*/
