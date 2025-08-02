import java.util.Scanner;


public class Exercise1{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter your first name: ");	
	String firstName = scanner.nextLine();

	System.out.print("Enter your Last name: ");
	String lastName = scanner.nextLine();

	System.out.println("\nWelcome to Second Year " + firstName + " " + lastName);		

    scanner.close();

    }
}