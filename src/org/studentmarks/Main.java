package org.studentmarks;

import java.util.Random;


public class Main {
    private static final Random random = new Random();

    private static final String LETTER_GRADE_A = "A";
    private static final String LETTER_GRADE_B = "B";
    private static final String LETTER_GRADE_C = "C";
    private static final String LETTER_GRADE_D = "D";
    private static final String LETTER_GRADE_E = "E";
    private static final String LETTER_GRADE_F = "F";

    public static void main(String[] args) {

        // create empty array
        int[][] studentMarks = new int[5][5];

        // initialize random marks for every student
        initializeRandomMarks(studentMarks);

        for (int student = 0; student < studentMarks.length; student++) {
            double average = calculateAverage(studentMarks[student]);
            printStudentAverage(average, student + 1, calculateLetterGrade(average));
        }
    }


    // method to initialize array
    public static void initializeRandomMarks(int[][] studentMarks) {

        for (int row = 0; row < studentMarks.length; row++) {
            for (int column = 0; column < studentMarks[row].length; column++) {
                studentMarks[row][column] = random.nextInt(10) + 1;
            }
        }
    }

    // calculate the average for one student
    public static double calculateAverage(int[] marks) {
        int total = 0;

        if (marks.length == 0) {
            return 0;
        }
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }

    // print the average for one student
    public static void printStudentAverage(double average, int studentNumber, String letter) {
        System.out.println("Average for student " + studentNumber + ": " + average + " | " + "Letter grade : " + letter);
    }

    public static String calculateLetterGrade(double average) {
        if (average == 10 ) {
            return LETTER_GRADE_A;
        } else if (average >= 8) {
            return LETTER_GRADE_B;
        } else if (average >= 6) {
            return LETTER_GRADE_C;
        } else if (average >= 4) {
            return LETTER_GRADE_D;
        } else if (average >= 2) {
            return LETTER_GRADE_E;
        } else return LETTER_GRADE_F;
    }
}
