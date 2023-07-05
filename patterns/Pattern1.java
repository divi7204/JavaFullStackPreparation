package patterns;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		sc.close();
	}

}
/*Print the following pattern for the given N number of rows.
Pattern for N = 3
###
###
###
Input Format:
Integer N (Total no. of rows)
Output Format:
Pattern in N lines*/