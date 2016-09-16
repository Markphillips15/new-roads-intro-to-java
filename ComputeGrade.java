import java.util.Scanner;

public class ComputeGrade{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter student's name: ");
		
		String name = input.next();
		
		System.out.println("Enter the first grade: ");	
		double grade1 = input.nextDouble();
		
		System.out.println("Enter the second grade: ");	
		double grade2 = input.nextDouble();
		
		System.out.println("Enter the third grade: ");	
		double grade3 = input.nextDouble();
	
		double average = (grade1 + grade2 + grade3)/3;
		
		String finalGrade = name + "'s final grade is " + gettLetterGrade(average);
		
		System.out.println(finalGrade);
	}
	
	public static char gettLetterGrade(double average){
		
		if(average >= 90){
			 return 'A';
		}
		else if(average <90 && average >= 80){
			 return 'B';
		}
		else if(average <80 && average >= 70){
			 return 'c';
		}
		else if(average <70 && average >= 65){
			 return 'D';
		}
		 return 'F';
	}
}