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
    private static final int STUDENT_MARKS_ARRAY_LENGTH = 5;


    public static void main(String[] args) {

        // create empty array
        int[][] studentMarks = new int[STUDENT_MARKS_ARRAY_LENGTH][STUDENT_MARKS_ARRAY_LENGTH];

        // initialize random marks for every student
        initializeRandomMarks(studentMarks);

        //calculate average marks
        double[] averageMarks = calculateAverageMarks(studentMarks);

        //print result
        for (int student = 0; student < averageMarks.length; student++) {
            double average = averageMarks[student];
            printStudentAverage(average, student + 1, calculateLetterGrade(average));
        }
    }

    // calculates average marks for all students, returns array of average marks
    private static double[] calculateAverageMarks(int[][] studentMarks) {
        double[] result = new double[studentMarks.length];
        for (int student = 0; student < studentMarks.length; student++) {
            result[student] = calculateAverage(studentMarks[student]);
        }
        return result;
    }

    // method to initialize array
    public static void initializeRandomMarks(int[][] studentMarks) {

        for (int row = 0; row < studentMarks.length; row++) {
            for (int column = 0; column < studentMarks[row].length; column++) {
                studentMarks[row][column] = random.nextInt(10)+1;
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

    // returns grade letter depending on average mark
    public static String calculateLetterGrade(double average) {

       if (average <=1) {
           return LETTER_GRADE_F;
       }
        else if (average <=3) {
            return LETTER_GRADE_E;
        }
        else if (average <=5) {
            return LETTER_GRADE_D;
        }
        else if (average <=7) {
            return LETTER_GRADE_C;
        }
        else if (average <=9) {
            return LETTER_GRADE_B;
        }
        else if (average >9) {
           return LETTER_GRADE_A;
        }
        return LETTER_GRADE_F;
    }
}
