package patterns;
import java.util.Scanner;
public class PatternAdv4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int k=0,num=1;
	for(int i=1;i<=n;i++) {
		num=i;
		//To print the space
		for(int j=0;j<n-i;j++ ) {
			System.out.print(" ");
		}
		//To print number in increasing order
		for(int j=n-i;j<n;j++) {
			System.out.print(num);
			num++;		
		}
		//To print number decreasing order
		num--;
		for(int j=n;j<n+k;j++) {
			num--;
			System.out.print(num);
			
		}
		k++;
		System.out.println();
	}
	sc.close();
	}

}
/*Print the following pattern for the given number of rows.
Pattern for N = 4
...1
..212
.34543
4567654

The dots represent spaces.
*/
