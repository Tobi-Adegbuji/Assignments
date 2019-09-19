
import java.util.Scanner;

public class Chp_7_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter total number of Students: ");
		
		int[] grades = new int[input.nextInt()];
		
		
		
		System.out.println("Enter " + grades.length +  " scores: ");
		
		for(int i = 0; i < grades.length; i++) {
			
			grades[i] = input.nextInt();
			
		}
		
		int max = grades[0];
		
		for(int studentGrades: grades) {
			
			if(studentGrades > max) {     //You can use forEach loop here.
											//forEach loops don't keep track of indexes, thats why you can't use it in certain scenarios.
				max = studentGrades;
			}
		} 
		
		
		
			for(int i = 0; i < grades.length; i++) {
				
				if(grades[i] >= max - 10) {
					System.out.println("Student " + i + " score is " + grades[i] + " and grade is A." );
				}
				else if(grades[i] >= max - 20) {
					System.out.println("Student " + i + " score is " + grades[i] + " and grade is B." );
				}
				else if(grades[i] >= max - 30) {
					System.out.println("Student " + i + " score is " + grades[i] + " and grade is C." );
				}
				else if(grades[i] >= max - 40) {
					System.out.println("Student " + i + " score is " + grades[i] + " and grade is D." );
				}
				else {
					System.out.println("Student " + i + " score is " + grades[i] + " and grade is F." );
				}
				
				
			}
			
			
			
		}
		
		
	}


