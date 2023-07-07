/* Given an array/list(ARR) of length N, you need to find and return the sum of all the 
 * elements in the array/list.*/
package arrays;
import java.util.Scanner;
public class ArraySum {
	static int sum(int[] arr) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans+=arr[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sum is "+sum(arr));
		sc.close();
	}

}
