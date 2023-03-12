package ex12_3;

import java.util.Scanner;

public class Ex4 {
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
		
		System.out.println("Enter the N names: ");
		sc.nextLine();
		String[] names = new String[N];
		String name_to_search;
		for(int i = 0; i < N; i++) {
			names[i] = sc.nextLine();
		}
		
		System.out.print("Enter a name to search: ");
		name_to_search = sc.nextLine();
		sc.close();
		for(int i = 0; i < N; i++) {
			if(names[i].equals(name_to_search)) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("-1");
		
	}
}
