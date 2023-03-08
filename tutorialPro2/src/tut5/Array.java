package tut5;

import java.util.Scanner;

public class Array {
	private int[] arr;
	
	public Array(int size) { //constructor
		arr = new int[size];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
	}
	
	
//	(a). count the number of elements that are negative
	public int countNegatives() {
		int res = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0)
				res ++;
		}
		return res;
	}
	
	
//	(b). find the minimum element
	public int finMin() {
		int res = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(res > arr[i]) {
				res = arr[i];
			}
		}
		return res;
	}
//	(c). determine whether the array is in ascending order
	public boolean isAscending() {
		for(int i = 0; i <= arr.length-2; i++) { //i <= n-2
			if(arr[i] > arr[i+1])
				return false;
		}
		
		return true;
	}
	
//	(d). return the length of the array
	public int arrLength() {
		return arr.length;
	}
	
//	(e). compute the frequencies of each element of the array
	public void freq() {
		int len = arr.length;
		
		boolean[] vst = new boolean[len]; //visited: vst[i] == true ---> arr[i] đã được xét qua
		for(int i = 0; i < len; i++) {
			vst[i] = false;
		}
		
		for(int i = 0; i < len; i++) {
			if(vst[i] == false) { //arr[i] chua duoc xet qua
				//di dem tan so xuat hien cua cac phan tu = arr[i]
				vst[i] = true; //dem arr[i]
				int count = 1;
				//1 2 3 4 2 2 2 
				for(int j = i+1; j < len; j++) {
					if(arr[j] == arr[i]) {
						count++;
						vst[j] = true; //dem arr[j]
					}
				}
				
				System.out.println("The frequence of elements with value " + arr[i] + " are " + count);
			}
		}
	}
}
