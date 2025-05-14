import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int[][] array = new int[10][10];
//        int count = 1;
//
//
//        for (int i = 0; i < array.length ; i++) {
//            for (int g = 0; g < array[i].length ; g++) {
//                array[i][g] = count++;
//            }
//        }
//
//        for (int[] ints : array) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//        }

        //---------------------------------------------------------------------------

//        int[][] triangle = new int[4][5];
//
//        for (int i = 0; i < triangle.length; i++) {
//
//            int ones = (i == triangle.length - 1) ? triangle[i].length : i + 1;
//            for (int j = 0; j < triangle[i].length; j++) {
//                triangle[i][j] = (j < ones) ? 1 : 0;
//            }
//        }
//
//
//        for (int[] row : triangle) {
//            System.out.println(java.util.Arrays.toString(row));
//        }

        int rows = 6;


        int[][] triangle = new int[rows][];
        for (int i = 0; i < rows; i++) {
            triangle[i] = new int[i + 1]; // Длина строки = номер_строки + 1
            Arrays.fill(triangle[i], 7);
        }


        for (int[] row : triangle) {
            for (int num : row) {
                System.out.print(num);
            }
            System.out.println();
        }



    }
}