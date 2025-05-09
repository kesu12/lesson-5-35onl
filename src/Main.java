//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        int count = 1;


        for (int i = 0; i < array.length ; i++) {
            for (int g = 0; g < array[i].length ; g++) {
                array[i][g] = count++;
            }
        }

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }
}