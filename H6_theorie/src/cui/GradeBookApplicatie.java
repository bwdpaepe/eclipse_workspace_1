package cui;

import domein.GradeBook;

public class GradeBookApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] gradesArray = {{87, 96, 70}};
		
		GradeBook myGradeBook = new GradeBook("CS101", gradesArray);
		
		System.out.printf(myGradeBook.buildOutput());
		System.out.printf(myGradeBook.buildOutputGrades());
		System.out.printf(myGradeBook.buildOutputBarChart());

	}

}
