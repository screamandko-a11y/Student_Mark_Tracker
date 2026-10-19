

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int total=0;
        int MAX_MARK=0;
        int MIN_MARK=0;
        int student_Count;


        int[][] studentMarks = new int[5][5];
        initializeMarks(studentMarks);
        System.out.println(Arrays.deepToString(studentMarks));


    }

    public static void initializeMarks(int[][] studentMarks) {
        Random random = new Random();

        for (int row = 0; row < studentMarks.length; row++) {
            for (int column = 0; column < studentMarks[row].length; column++) {
                studentMarks[row][column] = random.nextInt(10) + 1;
            }
        }
    }
    }