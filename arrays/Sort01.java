package arrays;
import java.util.Scanner;
public class Sort01 {
	static int[] sortArray(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
			arr[i]=1;
		}
		for(int i=0;i<count;i++) {
			arr[i]=0;
		}
		return arr;
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
	arr=sortArray(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	sc.close();
	}

}
