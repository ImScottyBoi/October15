import java.util.Scanner;
//main 
public class Driver {
	
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("What is the animal?");
		String type = Scan.nextLine();
		System.out.println("How many legs does " + type + " have?");
		String legs = Scan.nextLine();
		System.out.println("How much does " + type + " weigh?");
		String weight = Scan.nextLine();
		System.out.println("How tall is " + type);
		String height = Scan.nextLine();
		
		Animals animal = new Animals(type, height, legs, weight);
		
		System.out.println(animal.toString());
		System.out.println("Works?");
	}

}
