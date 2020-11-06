/** Eck Chapter 2 Exercise 2.7
 * Program asks for file & reads file 
 * First line is student's name
 * Next 3 lines are students scores in integers
 * Program prints out results
 * @author Joel
 *
 */

import textio.TextIO;

public class ReadStudentScoresFile {
	public static void main(String[] args) {		
		String fileName; // file name selected by user
		String studentName; // student's name from first line
		int score1; // exam 1 score (2nd line)
		int score2;
		int score3;
		double average;
		
		TextIO.readUserSelectedFile();
		fileName = TextIO.getInputFileName();
		
		studentName = TextIO.getln();
		score1 = TextIO.getlnInt();
		score2 = TextIO.getlnInt();
		score3 = TextIO.getlnInt();
		average = (score1 + score2 + score3)/3.0;
		
		System.out.println("File name: " + fileName);
		System.out.println("Student name: " + studentName);
		System.out.println("Exam score 1:  " + score1);
		System.out.println("Exam score 2:  " + score2);
		System.out.println("Exam score 3:  " + score3);
		System.out.println("Average score = " + average);
	}
}
