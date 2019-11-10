
import java.util.Scanner;
import java.util.Random;

public class PizzaMaker {

	//	public void randomTops() {
			//for(int i = 1; i <= numOfTops; i++) {
			//	String topping = veganTops [r.nextInt(veganTops.length)];
			//	System.out.println(i + "." + topping); }
			
		
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		//vars
		boolean needInput = true;
		boolean validNumOfTops = true;
		
		String tops[] = {"Cheese", "Pepperoni", "Black Olives", "Peppers", "Onions", "Bacon", "Sausage", 
				"Mushrooms", "Pineapples", "Spinach", "Tuna", "Potatoes", "Asparagus", "Garlic", "Chicken", "Oregano", 
				"Ham", "Zucchini"};
		String veganTops[] = {"Cheese", "Black Olives", "Peppers", "Onions", "Mushrooms", "Pineapple", "Spinach", 
				"Potatoe", "Asparagus", "Garlic", "Oregano", "Zucchini"};
		String breadType[] = {"Hand Tossed", "Handmade Pan", "Crunchy Thin Crust", "Gluten Free Crust", "Brookyln Style"};
		
		
		String choice = "";
		
		int numOfTops = 0; 
		double budget = 0.00;
		String size = "";
		
		int random = (int) (Math.random() * 10 + 1);
		
		
		
	
		
		
		
		
		
		
		
		
		//do {
		System.out.println("Welcome to Pizza Maker!\nAre you vegan/vegetarian? Type \"Y\" for yes or \"N\" for no");
		choice = scan.nextLine();
		
		if (choice.equals("y") || choice.equals("Y")) {
			
			System.out.println("What is your budget? ($)");
			budget = scan.nextDouble();
		
			
		
			while(budget < 6) {
				System.out.println("Sorry, that is not enough for a pizza.");
				System.out.println("What is your budget? ($)");
				budget = scan.nextDouble();
				
			}
		
			if (budget >= 6)  {
			System.out.println("Great! How many toppings would you like today? (max of 10)");
			numOfTops = scan.nextInt();
			
			}
		

				
			 if (numOfTops > 10) {
				System.out.println("Sorry, Max of 10 toppings");
			}
			
			

			if (numOfTops <= 10) {
				//System.out.println("What Size Pizza do you want?\nType \"S\" for Small\tType \"M\" for Medium\tType \"L\" for Large\tType \"XL\" "
					//	+ "for Extra-Large ");
					//	size = scan.nextLine();
						
							System.out.println("\n\n\nHere is your pizza:");
							for(int i = 1; i <= numOfTops; i++) {
							
								String topping = tops [r.nextInt(veganTops.length)];
							System.out.println(i + "." + topping);
						//	tops[] = veganTops[] - topping;
							
							
							}
			
							
			}
		}
							
//						if (size.equals("s") || size.equals("S")){
//							System.out.println("\n\n\nHere is your small-sized pizza:");
//							System.out.println("Type: Vegan/Vegetarian");
//							
//							for(int i = 1; i <= numOfTops; i++) {
//								String topping = veganTops [r.nextInt(veganTops.length)];
//								System.out.println(i + "." + topping); }
//							needInput = false;
//								
//						}
//						
//						
//						if (size.equals("m") || size.equals("M")){
//							System.out.println("\n\n\nHere is your medium-sized pizza:");
//							System.out.println("Type: Vegan/Vegetarian");
//							
//							for(int i = 1; i <= numOfTops; i++) {
//								String topping = veganTops [r.nextInt(veganTops.length)];
//								System.out.println(i + "." + topping); }
//							needInput = false;
//								
//						}
//						
//						if (size.equals("l") || size.equals("L")){
//							System.out.println("\n\n\nHere is your pizza:");
//							System.out.println("\n\n\nHere is your large-sized pizza:");
//							System.out.println("Type: Vegan/Vegetarian");
//							
//							for(int i = 1; i <= numOfTops; i++) {
//								String topping = veganTops [r.nextInt(veganTops.length)];
//								System.out.println(i + "." + topping); }
//							needInput = false;
//								
//						}
//						
//						if (size.equals("xl") || size.equals("XL")){
//							System.out.println("\n\n\nHere is your extra-large-sized pizza:");
//							System.out.println("Type: Vegan/Vegetarian");
//							
//							for(int i = 1; i <= numOfTops; i++) {
//								String topping = veganTops [r.nextInt(veganTops.length)];
//								System.out.println(i + "." + topping); }
//							needInput = false;
//								
//						}
//						else System.out.println("Invalid size");
//							

					
			//		}	while(needInput);
			
			
		
				
				
			//	veganTops[] = veganTops[] - topping;
				
				
				
			
		
//------------------------------------------------------------------------------
				
		if (choice.equals("n") || choice.equals("N")) {
					System.out.println("What is your budget? ($)");
					budget = scan.nextDouble();
				
					
				
					if (budget < 6) {
						System.out.println("Sorry, that is not enough for a pizza.");
						System.out.println("What is your budget? ($)");
						budget = scan.nextDouble();
						
					}
				
					if (budget >= 6)  {
					System.out.println("Great! How many toppings would you like today? (max of 10)");
					numOfTops = scan.nextInt();
					
					}
				

						
					 if (numOfTops > 10) {
						System.out.println("Sorry, Max of 10 toppings");
					}
					
					
					if (numOfTops <= 10) {
						System.out.println("\n\n\nHere is your pizza:");
						for(int i = 1; i <= numOfTops; i++) {
						String topping = tops [r.nextInt(tops.length)];
						System.out.println(i + "." + topping);
						}
					}
		}
					//	tops[] = veganTops[] - topping;
						
					//needInput = false;
						
						
				
					
		
		}
		
	
		
		

		
		//}while(needInput);
		
	
}
	

		