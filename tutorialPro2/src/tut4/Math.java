package tut4;

public class Math {
	public static int remainder(int n, int d) {
		// n / d
		while(n >= d) {
			n = n - d;
		}
		return n;
	}
	
	public static int div(int n, int d) {
		// n/d
		int res = 0;
		while( n >= d) {
			res++;
			n = n-d;
		}
		return res;
	}
	
	public static void middle(int n) {
		if(n >= 100 && n <= 999) {
			// n = 123
			
			n = n / 10; // n = 12
			
//			return n % 10; // return 2
			System.out.println("The middle digit of number " + n + " is " + (n %10) );
		}else {
			System.out.println("The input number is not a 3-digits number");
//			return -1;
		}
	}
	
	public static boolean isPalindrome(String str) {
		
		int i = 0;
	    int j = str.length() - 1;
	    while (i < j) {
	        if (str.charAt(i) != str.charAt(j)) {
	            return false;
	        }
	        i++;
	        j--;
	    }
	    return true;
	}
	
	public static boolean isPrime(int num) {
		if (num <= 1) {
	        return false;
	    }
		
	    for (int i = 2; i <= num-1; i++) {
	        if (num % i == 0) {
	            return false;
	        }
	    }
		return true;
	}
	
	//-----------------------------------------------------------------------------------
//	public static void main(String[] args) {
//		Math M = new Math();
//		System.out.println(M.remainder(10, 3));
//		System.out.println(M.div(10, 3));
////		System.out.println(M.middle(41));
//		M.middle(471);
//		System.out.println(M.isPalindrome("abcdecba"));
//		System.out.println(M.isPrime(14));
//	}
}
