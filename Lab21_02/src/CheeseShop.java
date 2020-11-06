import java.util.Scanner;

public class CheeseShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner (System.in);
		
		double HF = 0, RH = 0, TM = 0, list, DisHF = 0, DisRH = 0, SubTM, SubTotal, SubHF, SubRH, FinalTotal, test;
		
		System.out.println ("We sell 3 kinds of Cheese (in 0.5 lb packages): ");
		System.out.println ("Humboldt Fog: $25.0 per pound \nRed Hawk: $40.5 per pound \nTeleme: $17.25 per pound ");
		
		
		System.out.print ("\nEnter the amount of Humboldt Fog in lbs: ");
		HF = kb.nextDouble ();
		
		while (HF < 0 || HF % 0.5 != 0) {
				System.out.print ("Invalid input. Enter a value that's multiple of 0.5: ");
				HF = kb.nextDouble ();
				if (HF < 0) {
					System.out.print ("Invalid Input. Enter a value >= 0: ");
				HF = kb.nextDouble ();
				}
				else 
					break;
		}
			
		System.out.print ("Enter the amount of Red Hawk in lbs: ");
		RH = kb.nextDouble ();
		
		while (RH < 0 || RH % 0.5 != 0) {
			System.out.print ("Invalid input. Enter a value that's multiple of 0.5: ");
			RH = kb.nextDouble ();
			if (RH < 0) {
				System.out.print ("Invalid Input. Enter a value >= 0: ");
			RH = kb.nextDouble ();
			}
			else
				break;
		}
		
		System.out.print ("Enter the amount of Teleme in lbs: ");
		TM = kb.nextDouble ();
		
		while (TM < 0 || TM % 0.5 != 0) {
			System.out.print ("Invalid input. Enter a value that's multiple of 0.5: ");
			TM = kb.nextDouble ();
			if (TM < 0) {
				System.out.print ("Invalid Input. Enter a value >= 0: ");
			TM = kb.nextDouble ();
			}
			else 
				break;
		}
		
		System.out.print ("\nDisplay the itemized list? (1 for yes): ");
		list = kb.nextDouble ();
		
			SubHF = HF * 25.0;
			SubRH = RH * 40.5;
			SubTM = TM * 17.25;
			
			if (list == 1) {
				if (HF > 0)
				System.out.println (HF + " lb of Humboldt Fog @ $25.0 = $" + SubHF);
				if (RH > 0)
				System.out.println (RH + " lb of Red Hawk @ $40.5 = $" + SubRH);
				if (TM > 0)
				System.out.println (TM + " lb of Teleme @ $17.25 = $" + SubTM);
			}
		
		SubTotal = SubHF + SubRH + SubTM;
		System.out.println ("\nSub Total: \t\t\t\t$" + SubTotal);
		
		
		System.out.println ("Discounts... ");
		if (HF >= 1) {
			DisHF = (SubHF / 1) * 0.5 + SubHF % 0.5;
			System.out.println ("Humboldt Fog (Buy 1 Get 1 Free): \t-$" + DisHF);
		}
		if (RH >= 1.5) {
			DisRH = (SubRH / 2) * 0.5 + SubRH % 0.5;
			System.out.println ("Red Hawk (Buy 2 Get 1 Free): \t\t-$" + DisRH);
		}
		if (HF < 1 && RH < 1.5) {
			System.out.println ("None \t\t\t\t\t-$0.0");
		}
		
		FinalTotal = SubTotal - (DisHF + DisRH);
		System.out.println ("Final Total: \t\t\t\t$" + FinalTotal);
		
		
	}

}
