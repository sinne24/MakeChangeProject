/*User Story #1
The user is prompted asking for the price of the item.

User Story #2
The user is then prompted asking how much money was tendered by the customer.

User Story #3
Display an appropriate message if the customer provided too little money or 
the exact amount.

User Story #4
If the amount tendered is more than the cost of the item, display the number of 
bills and coins that should be given to the customer.
 * */
import java.util.Scanner;
public class MakeChange {
	public static void main(String[] args) {
		double price = 0.0;
		double amountTendered = 0.0;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the price of the item:");
		price = kb.nextDouble();
		System.out.println("Please enter the amount tendered:");
		amountTendered= kb.nextDouble();
		
		// Determine if amount tendered is enough. too much, or exactly the price
		if (amountTendered < price) {
			System.out.println("The amount given is too little");
		}
		else if(amountTendered == price) {
			System.out.println("Thank you for your purchase! Have a nice day!");
		}
		else {
			makeChange(price, amountTendered);
			System.out.println(". Thank you for your purchase.");
		}
		
	}
		public static void makeChange(double price, double amountTendered) {
			double change = 0.0;
			int twenties, tens, fives, dollars, quarters, dimes, nickels, pennies = 0;
			
			change = amountTendered - price;
			
			System.out.print("Your change is $" + change + ". ");
		    if (change % 20 == 0){
				System.out.print(" One twenty dollar bill, ");
				
			} 
			else if (change % 20 > 0) {
				twenties = (int)(change/20);
				System.out.print(twenties + " twenty dollar bills, ");
				
			}
		    // in cents mult by 100
			
		}
}


