package labs;

import java.util.Scanner;

public class LabSecond {
    public static final int MAX = 30;
    public static final int MIN = -25;
    public static final int MAX_DIMENTIONS = 20;
    public static final int MIN_DIMENTIONS = 1;
    public static final int MAX_POSSIBLE = 100000;
    public static final int MIN_POSSIBLE = -100000;


//HELPERS
    private static boolean makeIntToBoolean(int input) {
        if((input==0)||(input==1)) {
            return input!=0;
        }else {
            throw new IllegalArgumentException("Input number can be just 0 or 1 !");
        }
    }


    public static void main(String[] args)
    {
        int x, y;
        boolean isRandom;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! This is a simple MatrixMaker\nPlease enter x:");
        x = enterMatrixDimension(scanner);
        System.out.println("Cool!\nAnd please enter y:");
        y = enterMatrixDimension(scanner);
        System.out.println("Wow, amazing!\nYou want to write by yourself (0) or make matrix " +
                "with random digits (1)");
        System.out.println("(please enter 0 or 1)");
        isRandom = makeIntToBoolean(scanner.nextInt());
        int[][] myMatrix;

        myMatrix = makeMatrix(x, y, isRandom, scanner);

        int minNum = findMin(myMatrix);
        System.out.println("Minimum of matrix is " + minNum);
        int maxNum = findMax(myMatrix);
        System.out.println("Maximum of matrix is " + maxNum);
        double aver = findAverage(myMatrix);
        System.out.println("Average of matrix is " + aver);

    }

    private static int[][] makeMatrix(int sizeX,int sizeY, boolean isRandom, Scanner scanner)
    {
        int[][] matrix;
        if (isRandom){matrix = makeRandomMatrix(sizeX,sizeY);}
        else{
            matrix = makeInputMatrix(sizeX,sizeY, scanner);
        }
        printMatrix(sizeX, sizeY, matrix);
        return matrix;
    }

    private static int[][] makeRandomMatrix(int sizeX,int sizeY){

        int[][] matrix = new int[sizeX][sizeY];
        int amountOfNumbers = Math.abs(MIN)+Math.abs(MIN)+1;
        int minForRandomizer = Math.min(Math.abs(MAX), Math.abs(MIN));
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                matrix[i][j] = (int) Math.round((Math.random() * amountOfNumbers) - minForRandomizer);
            }
        }
            return matrix;
    }

    private static int[][] makeInputMatrix(int sizeX,int sizeY, Scanner scanner){

        int[][] matrix = new int[sizeX][sizeY];

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                System.out.print("Enter next number: ");
                matrix[i][j] = scanner.nextInt();
                System.out.println(" ");
            }
        }
        return matrix;
    }

    private static void printMatrix(int sizeX, int sizeY, int[][] matrix){
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    private static int enterMatrixDimension(Scanner scanner){
        int number;
        number = scanner.nextInt();
        while (number>MAX_DIMENTIONS||number<MIN_DIMENTIONS)
        {
            System.out.println("number must be between 1 fnd 20\nPlease enter other num:");
            number = scanner.nextInt();
        }
        return number;
    }

    private static int findMin(int[][] matrix){
        int minNumber = MAX_POSSIBLE;

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (minNumber >= ints[j])
                    minNumber = ints[j];
            }
        }
        return minNumber;
    }

    private static int findMax(int[][] matrix){
        int maxNumber = MIN_POSSIBLE;

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (maxNumber <= ints[j])
                    maxNumber = ints[j];
            }
        }
        return maxNumber;
    }

    private static double findAverage(int[][] matrix){
        double sum = 0;
        double amount = 0;

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum = sum + ints[j];
                amount++;

            }
        }
        return sum / amount;
    }

}

//
//(Double base, Double n) {
//        return Math.pow(Math.E, Math.log(base)/n);
//        }