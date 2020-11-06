public class Lab21_5 {
	
	public static void init (long[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
	}

	
	public static long sumAll (int max) {
		
		long subTotal = 0;
		
		for (int i = 1; i <= max; i++) {
			subTotal += i;
			System.out.println ("sumAll " + i + " value " + subTotal);
		}
		return subTotal;
	}

	
	public static long sumAll (long[] arr, int max) {
		for (int i = 1; i <= max ; i++) {
			if (arr[i] == 0) {
				arr[i] = arr[i-1] + i;	
				System.out.println ("sumAll[" + i + "] value " + arr[i]);
			}
		}
		return arr[max];
	}

	
	public static long squareSum (int max) {
		
		long subTotal = 0;
		
		for (int i = 1; i <= max; i++) {
			subTotal += i*i;
			System.out.println ("squareSum " + i + " value " + subTotal);
		}
		return subTotal;
	}

	
	public static long squareSum (long[] arr, int max) {
		for (int i = 1; i <= max; i++) {
			if (arr[i] ==0 ) { 
				arr[i] = arr[i-1] + i*i;
				System.out.println ("sumAll[" + i + "] value " + arr[i]);
			}
		}
		return arr[max];
	}

	
	public static long fibonacci (int max) {
		
		long subTotal = 0;
		long fib1 = 0;
		long fib2 = 1;
		
		for (int i = 2; i <= max; i++) {
			subTotal = fib1 + fib2;
			fib1 = fib2;
			fib2 = subTotal;
			System.out.println ("Fibonacci " + i + " value " + subTotal);
		}
		return subTotal;	
	}

	
	public static long fibonacci (long[] arr, int max) {
		arr[0]= 0; arr[1]=1;
		for (int i = 2; i <= max; i++) {
			if (arr[i] == 0 ) {
				arr[i] = arr[i-1]+arr[i-2];
				System.out.println ("Fibonacci[" + i + "] value " + arr[i]);
			}
		}
		return arr[max];	
	}

	
	public static long factorial (int max) {
		
		long subTotal = 1;
		
		for (int i = 2; i <= max; i++) {
			subTotal = subTotal * i;
			System.out.println ("factorial " + i + " value " + subTotal);
		}
		return subTotal;	
	}

	
	public static long factorial (long[] arr, int max) {
		arr[1]=1;
		for (int i = 2; i <= max; i++) {
			if (arr[i] == 0) {
				arr[i] = i * arr[i-1];
				System.out.println ("factorial[" + i + "] value " + arr[i]);
			}
		} 
		return arr[max];		
	}

	
	public static void main (String[] args) {

		final int MAXSIZE = 100; 
		long[] arr = new long[MAXSIZE];

		System.out.println ("sumAll output for 5 is " + sumAll(5));
		System.out.println ("sumAll output for 10 is " + sumAll(10));
		System.out.println ("sumAll output for 20 is " + sumAll(20));
		System.out.println ("sumAll output for 15 is " + sumAll(15));
		System.out.println ();
		
		init (arr);
		System.out.println ("sumAll output for 5 is " + sumAll(arr, 5));
		System.out.println ("sumAll output for 10 is " + sumAll(arr, 10));
		System.out.println ("sumAll output for 20 is " + sumAll(arr, 20));
		System.out.println ("sumAll output for 15 is " + sumAll(arr, 15));
		System.out.println ();

		System.out.println ("squareSum output for 5 is " + squareSum(5));
		System.out.println ("squareSum output for 10 is " + squareSum(10));
		System.out.println ("squareSum output for 20 is " + squareSum(20));
		System.out.println ("squareSum output for 15 is " + squareSum(15));
		System.out.println ();

		init (arr);
		System.out.println ("squareSum output for 5 is " + squareSum(arr, 5));
		System.out.println ("squareSum output for 10 is " + squareSum(arr, 10));
		System.out.println ("squareSum output for 20 is " + squareSum(arr, 20));
		System.out.println ("squareSum output for 15 is " + squareSum(arr, 15));
		System.out.println ();

		System.out.println ("Fibonacci Number 5 is " + fibonacci(5));
		System.out.println ("Fibonacci Number 10 is " + fibonacci(10));
		System.out.println ("Fibonacci Number 20 is " + fibonacci(20));
		System.out.println ("Fibonacci Number 15 is " + fibonacci(15));
		System.out.println ();

		init (arr);
		System.out.println ("Fibonacci Number 5 is " + fibonacci(arr, 5));
		System.out.println ("Fibonacci Number 10 is " + fibonacci(arr, 10));
		System.out.println ("Fibonacci Number 20 is " + fibonacci(arr, 20));
		System.out.println ("Fibonacci Number 15 is " + fibonacci(arr, 15));
		System.out.println ();

		System.out.println ("Factorial of 5 is " + factorial(5));
		System.out.println ("Factorial of 10 is " + factorial(10));
		System.out.println ("Factorial of 20 is " + factorial(20));
		System.out.println ("Factorial of 15 is " + factorial(15));
		System.out.println ();

		init (arr);
		System.out.println ("Factorial of 5 is " + factorial(arr, 5));
		System.out.println ("Factorial of 10 is " + factorial(arr, 10));
		System.out.println ("Factorial of 20 is " + factorial(arr, 20));
		System.out.println ("Factorial of 15 is " + factorial(arr, 15));
		System.out.println ();

	} 
}

