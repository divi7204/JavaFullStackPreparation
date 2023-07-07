package arrays;
import java.util.Scanner;
public class PairSum {
	static int findPairSum(int[] arr,int sum) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=sc.nextInt();
	System.out.println("Enter the elements");
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the sum to find from pair");
	int sum=sc.nextInt();
	System.out.println("The pair count is "+findPairSum(arr,sum));
	sc.close();
	}

}
