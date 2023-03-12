package ex12_3;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		System.out.print("Enter the number of input integers: ");
		N = sc.nextInt();
		if(N <= 0) {
			System.out.println("Invalid input!");
			sc.close();
			return;
		}
		
		System.out.println("Enter the N integers: ");
		int[] arr = new int[N];
		for(int i = 0; i< N; i++) {
			arr[i] = sc.nextInt();
		}
		//bubble sort
		boolean check = true;
		while(check) {
			check = false;
			for(int i = 0; i <= N-2; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					check = true;
				}
			}
		}
		
		System.out.println("List after sorting: ");
		for(int x : arr) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
