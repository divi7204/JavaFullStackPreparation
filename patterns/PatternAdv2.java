package patterns;
import java.util.Scanner;
public class PatternAdv2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		int k=1;
		for(int j=0;j<n-i;j++) {
			System.out.print(" ");
		}
		for(int j=n-i;j<n;j++) {
			System.out.print(k);
			k++;
		}

		System.out.println();
	}
	sc.close();
	}

}
/*Print the following pattern for the given N number of rows.
Pattern for N = 4
...1
..12
.123
1234
The dots represent spaces.
*/