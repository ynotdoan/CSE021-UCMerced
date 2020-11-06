import java.util.*;

public class Lab21_Vars {

	public static void main(String[] args) {

		int i = 0,j = 0;
		int var0, var1;

		// Fix 1: Correctly typecast 5.0 to an int so it can assigned to var3.
		/*
		int var2 = 0, var3 = 5.0;
		 */
		// SOLUTION: added "(int)" in front of 5.0
		int var2 = 0, var3 = (int) 5.0;

		// Fix 2: Correctly declare a variable as an array.
		/*
		int arri0 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

		double[] arrd0 = {0.0, 1.0, 2.0, 3.0, 4.0};
		 */
		// SOLUTION: added array brackets [] after int
		int[] arri0 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

		double[] arrd0 = {0.0, 1.0, 2.0, 3.0, 4.0};

		// Fix 3: What's wrong with temp? Fix it.
		/*
		if (i < j) {
			int temp = 0;
			System.out.println("Temp is " + temp);
		} else {
			temp = 1;
			System.out.println("Temp is " + temp);
		}
		 */
		// SOLUTION: moved "int temp = 0" before the if statement because the temp in the else statement was not declared
		int temp = 0;
		if (i < j) {
			System.out.println("Temp is " + temp); }
		else  {
			temp = 1;
			System.out.println("Temp is " + temp);
		}

		// Fix 4: Correctly calculate square of sums and print it as total.
		/*
		for (int i = 0; i < 10; i++) {
			int total = 0;
			total += i*i;
		}
		System.out.println("i value is " + i);
		System.out.println("Total is " + total);
		 */
		// SOLUTION: moved "int total = 0" before the for statement because the variable total in the print statements were not declared 
		int total = 0;
		for ( i = 0; i < 10; i++) {
			total += i*i;
		}
		System.out.println("i value is " + i);
		System.out.println("Total is " + total);



		// Fix 5: Figure out the logical error in lines 36-42, and correct it.
		/* 
		Cheese jack;
		Cheese monterey = new Cheese("Monterey");
		jack = monterey;
		System.out.println("Monterey name is " + monterey.getName());
		jack.setName("Jack");
		System.out.println("Jack name is " + jack.getName());
		System.out.println("Monterey name is still " + monterey.getName());
		 */
		// SOLUTION: error is that there's no class named cheese, created cheese class

		Cheese jack;
		Cheese monterey = new Cheese("Monterey");
		jack = monterey;
		System.out.println("Monterey name is " + monterey.getName());
		jack.setName("Jack");
		System.out.println("Jack name is " + jack.getName());
		System.out.println("Monterey name is still " + monterey.getName());

		// Fix 6: Make the following code shorter by combining redundant 
		//        (unnecessary/duplicate) statements
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		
		if (input.nextInt() > var3) {
			System.out.print("Enter second number: ");
			int num2 = input.nextInt();
			System.out.println("First is greater");
			if (num2 < var3)
				System.out.println("Second is Less than");
			else
				System.out.println("Second is Greater or equal");
		} else {
			System.out.print("Enter second number: ");
			int num2 = input.nextInt();
			System.out.println("First is Less than or equal");
			if (num2 < var3)
				System.out.println("Second is Less than");
			else
				System.out.println("Second is Greater or equal");
			
		}
		 */
		// SOLUTION: put num1 and num2 inputs first then the if else statements after
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = input.nextInt();

		System.out.print("Enter second number: ");
		int num2 = input.nextInt();

		if (num1 > var3) {
			System.out.println("First is greater");
		}

		else {
			System.out.println("First is Less than or equal");
		}	

		if (num2 < var3) {
			System.out.println("Second is Less than");
		}

		else {
			System.out.println("Second is Greater or equal to ");
		}


		// Fix 7: Print out the first number entered by the user
		//        (Hint - You will need to modify the above code)

		System.out.println("First number: " + num1);

	}

}