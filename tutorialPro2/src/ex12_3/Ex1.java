package ex12_3;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("Enter a name: ");
		name = sc.nextLine();
		sc.close();
		int count = 0;
		for(int i = 0; i < name.length(); i++) {
			if(name.charAt(i) != ' ') {
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("-1");
		}else {
			System.out.println(count);
		}
	}
}
