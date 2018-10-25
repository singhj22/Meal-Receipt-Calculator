import java.util.Scanner;

public class Meal_Reciept_Calculator 
{

	public static void main(String[] args) 
	
	{
		Scanner user= new Scanner(System.in);
		
		System.out.println("Tax and Tip Calculator");
		
		//input from user
		
		System.out.println("Please enter the name of your appetizer: ");
		String appetizer = user.nextLine();
		
		System.out.println("Please enter the price for the appetizer: ");
		String appetizer_p= user.nextLine();
		
		System.out.println("Please enter the name of your entree: ");
		String entree = user.nextLine();
		
		System.out.println("Please enter the price for the entree: ");
		String entree_p = user.nextLine();
		
		System.out.println("Please enter the name of your dessert: ");
		String dessert= user.nextLine();
		
		System.out.println("Please enter the price for the dessert: ");
		String dessert_p = user.nextLine();
		
		System.out.println("What percentage would you like to tip (as decimal): ");
		String tip = user.nextLine();
		
		//convert to float
		
		double appetizer_p2 = Double.parseDouble(appetizer_p);
		double entree_p2 = Double.parseDouble(entree_p);
		double dessert_p2 = Double.parseDouble(dessert_p);
		double tip2 = Double.parseDouble(tip);

		//Calculations
		double Subtotal = appetizer_p2 + entree_p2+ dessert_p2;
		double tax= Subtotal*0.06;
		double tip_total= (Subtotal)*tip2;
		double total = Subtotal+ tax+ tip_total;
		//display receipt
		
		System.out.println("Item                        Price");
		System.out.println(appetizer+ "                           $"+ Math.round(appetizer_p2*100)*0.01);
		System.out.println(entree+ "                           $"+ Math.round(entree_p2*100)*0.01);
		System.out.println(dessert+ "                           $"+ Math.round(dessert_p2*100)*0.01);
		System.out.println("Subtotal                    $"+ Math.round(Subtotal*100)*0.01);
		System.out.println("Tax                         $"+ Math.round(tax*100)*0.01);
		System.out.println("Tip                         $"+ Math.round(tip_total*100)*0.01);
		System.out.println("Total Bill                  $"+ Math.round(total*100)*0.01);
	
	}

}
