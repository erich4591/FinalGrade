import java.util.Scanner;

public class FinalGrade {
	public static void main(String[ ] args) {
		Scanner scan = new Scanner(System.in);
		//These will only add up to 90%. I'm assuming this is just an error.
		double FINAL_EXAM = .25;
		double MIDTERM = .15;
		double QUIZZES = .20;
		double HOMEWORKS = .10;
		double CONTINUOUS_ASSESSMENT = .20;
		
		System.out.println("Please print the averages of the following:");
		
		System.out.print("Final Exam: ");
		int FinalExam = scan.nextInt();
		System.out.print("Midterm: ");
		int Midterm = scan.nextInt();
		System.out.print("Quizzes: ");
		int Quizzes = scan.nextInt();
		System.out.print("Homework: ");
		int Homeworks = scan.nextInt();
		System.out.print("Continuous Assessment: ");
		int ContinuousAssessment = scan.nextInt();
		
		double Average = (FinalExam * FINAL_EXAM) + (Midterm * MIDTERM) + 
				(Quizzes * QUIZZES) + (Homeworks * HOMEWORKS) + 
				(ContinuousAssessment * CONTINUOUS_ASSESSMENT);
		System.out.println("The final grade is: ");
		System.out.print(Average + "%");
		
	}
}
