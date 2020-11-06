import java.util.Scanner;

public class Shop {

	//Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int func = 1, items = 0, rerun = 1;	
		while (rerun == 1 ) {
		while (func == 1) {

			while(func <= 4 && func >= 1 ) {

				System.out.println("This program supports 4 functions: ");
				System.out.println("\t1. Setup Shop ");
				System.out.println("\t2. Buy ");
				System.out.println("\t3. List Items ");
				System.out.println("\t4. Checkout ");
				System.out.print("Please choose the function you want: ");
				func = kb.nextInt();

				//user options 1 - 4
				if (func == 1) {
					for(int i = 0; i < MAX ; i++) {
						discx[i]  = 0;
						prices[i]= 0;
						names[i] = null;
						amount[i] = 0;
						discrate[i] = 0;
						disc[i] = 0;
					}
					Setup();

					for(int i = 0;i < names.length; ++i) {
						if ( names[i] != null) {
							items = items + 1;
						}
					}
				}

				if (func == 2) {
					items = 0;
					for(int i = 0;i < names.length; ++i) {
						if ( names[i] != null) {
							items = items + 1;
						}
					}

					for(int i = 0; i < MAX ; i++) {
						amount[i]  = 0;
					}

					if (prices[0] == 0) {
						System.out.println("Shop is not set up yet!");
					} 
					
					else {
						Buy(items-1);
					}
				}

				if (func == 3) {	
					if ( names[0] != null && nothing == 0) {
						System.out.println("\nNo items were purchased. ");
						System.out.println();
					}

					else if (prices[0] == 0) {
						System.out.println("\nShop is not set up yet!");
						System.out.println();
					} 
					else {
						List(items);
					}
				}

				if (func == 4) {
					if ( names[0] != null && nothing == 0) {	
						System.out.println("\nNo items were purchased. ");
						System.out.println();
					}

					if (prices[0] == 0) {
						System.out.println("\nShop is not set up yet!");
						System.out.println();
					} 
					//option to rerun
					else {
						checkout(items);
						System.out.println("-------------------------------------------------");
						System.out.println("Would you like to re-run (1 for yes, 0 for no)?");
						System.out.println("-------------------------------------------------");
						func = kb.nextInt();

						if(func == 1) {
							for(int i = 0; i < MAX ; i++) {
								discx[i]  = 0;
								prices[i]= 0;
								names[i] = null;
								amount[i]  = 0;
								discrate[i]     = 0;
								disc[i] = 0;
							}
						}
					}
				}
			}
		}
	}
}

	//Methods
	
	static final int MAX = 100;
	static int nothing = 0; //if user doesnt buy anything

	static	Scanner kb = new Scanner (System.in);

	static String [] names = new String[MAX]; //names of products		
	static double [] prices = new double[MAX]; //prices of products
	static double [] discx = new double[MAX]; //special disc for each product
	static int [] amount = new int[MAX]; //amount bought in Buy

	static double [] discrate = new double[MAX];
	static double [] disc= new double[MAX];
	
	static int rerun = 0;

	//1. Setup Shop
	public static int Setup() {
		int items ;
		System.out.print("Please enter the number of items to setup shop: "); 
		items = kb.nextInt();

		System.out.println();

		for(int i = 0; i < items; i++ ) {

			System.out.print("What is the name of the " + numSuffix(i + 1) + " item?: ");
			names[i] = kb.next();

			System.out.print("Enter the per package price of " + names[i] + ": ");
			prices[i] = kb.nextDouble();

			System.out.print("Enter the number of packages ('x') to qualify for Special Discount (buy 'x' get 1 free) \nfor " + names[i] + ", or 0 if no Special Discount offered: ");
			discx[i] = kb.nextDouble();

			while (discx[i] < 0 || (discx[i] != (int) discx[i])) {
				System.out.print("Enter a whole number that is >= 0: ");
				discx[i] = kb.nextDouble();
			}
		}

		System.out.println();
		System.out.print("Enter the dollar amount to qualify for Additional Discount (or 0 if none offered): ");
		disc[0]= kb.nextDouble();

		if(disc[0] > 0 ) {
			System.out.print("Enter the Additional Discount rate (e.g., 0.1 for 10%): ");
			discrate[0] = kb. nextDouble();

			while(discrate[0] < 0 || discrate[0] > 0.5 ) {
				System.out.print("Invalid input. Enter a value > 0 and <= 0.5: ");
				discrate[0] = kb.nextDouble();
			}
		}

		System.out.println();

		return items;
	}

	//2. Buy
	public static void Buy(int items) {
		nothing = 1;
		System.out.println();
		for( int i = 0; i <= items ;i++) { 
			System.out.print("Enter the number of " + names[i] + " packages to buy: ");
			amount[i] = kb.nextInt();
			while (amount[i] < 0) {
				System.out.print("Invalid input. Enter a value >= 0: ");
				amount[i] = kb.nextInt();
			}
		}
		System.out.println();
	}

	//3. List Items
	public static void List(int items) {
		double bought = 0;
		System.out.println();
		for(int i = 0; i < items ;i++) {
			bought = bought + amount[i];
			if (amount[i] > 0) {
				System.out.print(amount[i]+" packages of " + names[i] + " @ $" + prices[i] + "per pkg = $" );
				System.out.printf("%.2f", prices[i] * amount[i] );
				System.out.println();
			}
			if (bought == 0) {
				System.out.println();
				System.out.println("No items were purchased. ");
				break;
			}
		}
		System.out.println();
	}

	//4. Checkout
	public static void checkout(int items) {
		double a = 0, k  = 0, amt = 0, free = 0, total = 0, rate = 0, finalsub, sub, nodisc, disc2;
		
		System.out.println();
		
		//print original price
		System.out.print("Original Sub Total:\t\t $");
		for(int i = 0; i < names.length ;i++) {
			a = a + (prices[i] * amount[i]);
		}
		
		System.out.printf("%.2f", a);
		System.out.println();

		//discx calc
		nodisc = 0 ;
		for(int i = 0; i < items ;i++) {
			if(discx[i] != 0) {
				amt = amount[i];
				free = (int)(amt / (discx[i]+1));
				total = free * prices[i];
				k = k + total;
				nodisc = nodisc + discx[i];
			}
		}
		
		
		if (nodisc == 0 || k == 0) {
			System.out.println("No Special Discounts applied ");
			k = 0;
		}
		else {
			System.out.print("Special discounts:\t\t-$");
			System.out.printf("%.2f", k);
			System.out.println();
		}
		
		//New sub total calc
		System.out.print("New Sub Total:\t\t\t $");
		sub = a - k;
		disc2 = 0; 
		System.out.printf("%.2f", sub );
		System.out.println();
		
		//Additional disc calc
		if(disc[0] == 0) {
			System.out.println("You did not qualify for an Additional Discount");
		}
		
		else {
			rate = discrate[0] * 100;
			disc2 = discrate[0] * sub;
			System.out.print("Additional " + (int) rate + "% Discount:\t-$");
			System.out.printf("%.2f", disc2 );
			System.out.println();
		}
		//final sub calc
		finalsub = sub - disc2;
		System.out.print("Final Sub Total:\t\t $" );
		System.out.printf("%.2f", finalsub );
		System.out.println("\n");
		System.out.println("Thanks for coming!");

		System.out.println();
	}

	//Ordinal Numbers
	public static String numSuffix(int i) {
		int rem = i % 10;
		switch (rem) {
		case 0:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			return (i + "th");
		case 1:
			if (i % 100 != 11)
				return (i + "st");
			else
				return (i + "th");
		case 2:
			if (i % 100 != 12)
				return (i + "nd");
			else
				return (i + "th");
		case 3:
			if (i % 100 != 13)
				return (i + "rd");
			else
				return (i + "th");
		default:
			break;
		}
		return "";
	}
}