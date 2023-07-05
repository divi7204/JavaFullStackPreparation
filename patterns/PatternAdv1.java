package patterns;
import java.util.Scanner;
public class PatternAdv1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	for(int i=n;i>=1;i--) {
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
4444
333
22
1
*/
