import java.util.Scanner;
import java.util.*;


public class Marks{
	
	static Scanner scanner = new Scanner(System.in);
	static int n;
    public static void main(String[] args) {
	
		// Ask for "n"
		System.out.print("Enter n: ");
		n = scanner.nextInt();
		System.out.println();
		double[][] marks = new double[n][3];
		

		boolean run = true;
		int input;
		while (run) {
			displayInfo();
			System.out.print("Enter Choice: ");
			input = scanner.nextInt();

			switch(input){
				case 1 -> setStudentMark(marks);
				case 2 -> updateStudentMark(marks);
				case 3 -> getSubjectAverage(marks);
				case 4 -> getStudentAverage(marks);
				case 5 -> getStudentTotal(marks);
				case 6 -> displayStudentInfo(marks);
				default -> {
					run = false;
					break;
				}
			}
		}
		scanner.close();	
    }

	public static void displayStudentInfo(double[][] marks){
		String MATH, CHEM, PHY;
		System.out.println("StudentID     MATH    CHEM    PHY");

		int countID = 1;
		for (double[] studentMarks : marks) {
			MATH = (studentMarks[0] >= 90) ? "A" :
				(studentMarks[0] >= 80) ? "B" :
				(studentMarks[0] >= 70) ? "C" :
				(studentMarks[0] >= 60) ? "D" : "Fail";

			CHEM = (studentMarks[1] >= 90) ? "A" :
				(studentMarks[1] >= 80) ? "B" :
				(studentMarks[1] >= 70) ? "C" :
				(studentMarks[1] >= 60) ? "D" : "Fail";

			PHY = (studentMarks[2] >= 90) ? "A" :
				(studentMarks[2] >= 80) ? "B" :
				(studentMarks[2] >= 70) ? "C" :
				(studentMarks[2] >= 60) ? "D" : "Fail";

			System.out.println("StudentID " + countID + "     " + MATH + "       " + CHEM + "       " + PHY);
			countID++;
		}

	}

    public static void displayInfo(){
		System.out.println("\nOptions: ");
		System.out.println("1. Add Student Mark.");
		System.out.println("2. Update Student Mark.");
		System.out.println("3. Get the average for a subject.");
		System.out.println("4. Get the average for a student average.");
		System.out.println("5. Get the total mark of a Student.");
		System.out.println("6. Display Info.\n");
		System.out.println("(Leave blank to exit)");
	}

	public static void setStudentMark(double[][] marks){
		// studentID

		System.out.print("Enter the studentID: ");
		int studentId = scanner.nextInt();
		
		while(studentId < 1 && studentId > n){
			System.out.println("Invalid StudentID!");
			System.out.println("Enter the studentID again: ");
			studentId = scanner.nextInt();
		}

		// Subjeect

		System.out.println("""
MATHEMATICS - 1				
CHEMISTRY - 2				
PHYSICS - 3				
				\n""");

		System.out.print("Enter the subject: ");
		int subjectNo = scanner.nextInt();

		while(subjectNo < 1 && subjectNo > 3){
			System.out.println("Invalid subject number!");
			System.out.println("Enter the subject number: ");
			subjectNo = scanner.nextInt();
		}


		System.out.print("Enter the Marks: ");
		double currentMark = scanner.nextDouble();

		while(currentMark < 0 && currentMark > n){
			System.out.println("Invalid Marks!");
			System.out.println("Enter the mark again: ");
			currentMark = scanner.nextDouble();
		}

		// Put the mark into the array

		marks[studentId-1][subjectNo-1] = currentMark;

		System.out.println("New student mark is added..");
	
	}
	public static void updateStudentMark(double[][] marks){
	}
	public static void getSubjectAverage(double[][] marks){
	//	mathematics - 1     Chemistry - 2     Physics - 3
		System.out.println("""
\nMATHEMATICS - 1				
CHEMISTRY - 2				
PHYSICS - 3				
				\n""");

		System.out.print("Enter the subject: ");
		int subjectNo = scanner.nextInt();

		while(subjectNo < 1 && subjectNo > 3){
			System.out.println("Invalid subject number!");
			System.out.println("Enter the subject number: ");
			subjectNo = scanner.nextInt();
		}

		int total = 0;

		for(double[] row : marks){
			total += row[subjectNo];
		}

		System.out.printf("The average is %f\n", (total / n));

	}
	public static void getStudentAverage(double[][] marks){

		System.out.print("Enter the studentID: ");
		int studentId = scanner.nextInt();
		
		while(studentId < 1 && studentId > n){
			System.out.println("Invalid StudentID!");
			System.out.println("Enter the studentID again: ");
			studentId = scanner.nextInt();
		}

		double total = 0.0;

		for(double mark : marks[studentId-1]){
			total += mark;
		}

		System.out.printf("The student average is: %.2f\n", (total / 3.0));
	}
	public static void getStudentTotal(double[][] marks){
		System.out.print("Enter the studentID: ");
		int studentId = scanner.nextInt();
		
		while(studentId < 1 && studentId > n){
			System.out.println("Invalid StudentID!");
			System.out.println("Enter the studentID again: ");
			studentId = scanner.nextInt();
		}

		double total = 0;

		for(double mark : marks[studentId-1]){
			total += mark;
		}

		System.out.println("The student total is: " + total);
	}
	

}