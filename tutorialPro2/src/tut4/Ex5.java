package tut4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some numbers to the computation with Arrays:");
		String str;
		ArrayList<Double> ls = new ArrayList<Double>();
		while(sc.hasNext()) {
			str = sc.nextLine();
			if(str.charAt(0) == 'x' || str.charAt(0) == 'X')
				break;
			ls.add(Double.parseDouble(str));
		}
		double[] arr = new double[ls.size()];
		for(int i = 0; i < ls.size(); i++) {
			arr[i] = ls.get(i);
		}
		System.out.println("Testting median method: ");
		System.out.println("The median: " + Arrays.median(arr));
		System.out.print("Testing freq method: ");
//		Arrays.freq(arr);
		
		System.out.println("Ennter 2 numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Testing reaminder: ");
		System.out.println(x + " mod " + y + " = " + Math.remainder(x, y));
		System.out.println("Testing div: ");
		System.out.println(x + "/" + y + " = " + Math.div(x, y));
	}
}