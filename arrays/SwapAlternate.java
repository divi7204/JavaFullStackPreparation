package arrays;
import java.util.Scanner;
public class SwapAlternate {
	static int[] swap(int[] arr) {
		for(int i=0;i<arr.length;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		arr=swap(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
