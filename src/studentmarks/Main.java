package studentmarks;

import java.util.Random;


public class Main {
    public static void main(String[] args) {

        int[][] studentMarks = new int[5][5];
        initializeRandomMarks(studentMarks);

        for (int student = 0; student<studentMarks.length;student++) {
            calculateAverage(studentMarks[student], student + 1);
        }
    }




    // random method to initialize array
    public static void initializeRandomMarks(int[][] studentMarks) {
        Random random = new Random();

        for (int row = 0; row < studentMarks.length; row++) {
            for (int column = 0; column < studentMarks[row].length; column++) {
                studentMarks[row][column] = random.nextInt(10) + 1;
            }
        }
    }



    public static double calculateAverage(int[] marks, int studentNumber) {
        if (marks.length == 0) {
            return 0;
        }
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }

        double average = (double) total / marks.length;
        System.out.println("Average for student " + studentNumber + ": " + average);
        return average;
    }
}
