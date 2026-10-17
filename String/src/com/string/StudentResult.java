package com.string;

public class StudentResult {
	int marks = 85;
	static int passingMarks = 37;

	public static void main(String args[]) {
		StudentResult s1 = new StudentResult();
		System.out.println("stundent marks :" + s1.marks);

		System.out.println("passingMarks :" + StudentResult.passingMarks);

		StudentResult.PassingMarks();
		s1.result();
	}

	public static void PassingMarks() {
		System.out.println("passingMarks for student is " + passingMarks );
	}

	public void result() {
		System.out.println("result of student is "+ marks);

	}
}
