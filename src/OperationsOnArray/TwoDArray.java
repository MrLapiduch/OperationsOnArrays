package OperationsOnArray;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] MKlaus2DArray = new int[10][10];
        System.out.println("Matrix");
        for(int i = 0; i < MKlaus2DArray.length; i++){
            MKlaus2DArray[i][i] = i;
        }
        for(int i = 0; i < MKlaus2DArray.length; i++){
            for (int j = 0; j < MKlaus2DArray.length; j++){

                System.out.print(MKlaus2DArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
