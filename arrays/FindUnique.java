package arrays;
import java.util.Scanner;
public class FindUnique {
	static int findUnique(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					
				}
				else if(arr[i]==arr[j]) {
					arr[i]=-1;
					arr[j]=-1;
				}
			}	
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==-1) {
				
			}
			else {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size array");
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Unique element is "+findUnique(arr));
	sc.close();
	}

}
