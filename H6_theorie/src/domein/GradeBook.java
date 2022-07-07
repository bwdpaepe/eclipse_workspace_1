package domein;

public class GradeBook {
	private String courseName;
	private int[][] grades;
	
	public GradeBook(String courseName, int[][] grades) {
		this.setCourseName(courseName);
		this.setGrades(grades);
	}

	public String getCourseName() {
		return courseName;
	}

	private void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int[][] getGrades() {
		return grades;
	}

	private void setGrades(int[][] grades) {
		this.grades = grades;
	}
	
	public int searchMinimum() {
		int minGrade = Integer.MAX_VALUE;
		for(int[] student: this.getGrades()) {
			for(int testresultaat: student) {
				minGrade = Math.min(minGrade, testresultaat);
			}
		}
		return minGrade;
	}
	
	public int searchMaximum() {
		int maxGrade = Integer.MIN_VALUE;
		for(int[] student: this.getGrades()) {
			for(int testresultaat: student) {
				maxGrade = Math.max(maxGrade, testresultaat);
			}
		}
		return maxGrade;
	}
	
	public double calculateAverage(int[] setOfGrades) {
		int sum = 0;
		for(int grade: setOfGrades) {
			sum += grade;
		}
		return sum / setOfGrades.length;
	}
	
	public String buildOutput() {
		return String.format("%s%n%s%n%n", "Welcome", "CS101");
	}
	
	public String buildOutputGrades() {
		String output = "\nThe grades are:\n\n";
		output += String.format("%16s%2d%6s%2d%6s%2d %s", "Test", 1, "Test", 2, "Test", 3, "Average");
		int counter = 1;
		for(int[] student: this.getGrades()) {
			output += String.format("%8%3d", "Student", counter);
			for(int testresultaat: student) {
				output += String.format("%6dn", testresultaat);
			}
			output += String.format("%8.2f%n", this.calculateAverage(student));
			counter++;
		}
		output += String.format("%n Lowest grade in the book is %d%nHighest grade in the book is %d%n", this.searchMinimum(), this.searchMaximum());
		return output;
	}
	
	public String buildOutputBarChart() {
		int[] barChart = new int[11];
		for(int[] student: this.getGrades()) {
			for(int testresultaat: student) {
				barChart[testresultaat / 10]++;
			}
		}
		String output = "\nOverall grade distribution:";
		
		for(int count = 0; count < barChart.length; count++) {
			if(count == 10) {
				output += String.format("%5d: ", 100);
			}
			else {
				output += String.format("%02d-%02d: ", count * 10, count * 10 + 9);
			}
			for(int stars = 0; stars < barChart[count]; stars++) {
				output += "*";
			}
			output += "%n";
		}
		return output;
		
		
	}
	
	
	
	

}
