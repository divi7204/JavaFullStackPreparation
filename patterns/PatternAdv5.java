package patterns;
import java.util.Scanner;
public class PatternAdv5 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number");
	        int n=sc.nextInt();
	        int s=(n/2);
	        int num=(n/2)+1;
	        int number=1;
	        for(int i=0;i<num;i++){
	            for(int j=0;j<s;j++)
	            {
	                System.out.print(" ");
	            }
	            for(int j=0;j<number;j++){
	                System.out.print("*");
	            }
	            s--;
	            number+=2;
	            System.out.println();
	        } 
	        s=1;
	        number=n-2;  
	        for(int i=num;i<n;i++){
	            for(int j=0;j<s;j++){
	                System.out.print(" ");
	            }
	            for(int j=0;j<number;j++){
	                System.out.print("*");
	            }
	            number-=2;
	            s++;
	            System.out.println();
	        } 
	        sc.close();
	}

}
/*Print the following pattern for the given number of rows.
Note: N is always odd.
Pattern for N = 5
..*
.***
*****
.***
..*


The dots represent spaces.
*/
