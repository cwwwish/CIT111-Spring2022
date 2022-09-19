import java.util.Scanner;

/**
 * Chapter 8 Exercise 24:
 *
 *      (Check Sudoku solution)
 *      Listing 8.4 checks whether a solution is valid by checking whether
 *      every number is valid in the board. Rewrite the program by checking
 *      whether every row, every column, and every small box has the numbers 1 to 9.
 *
 * Created by Luiz Arantes Sa on 8/31/14.
 */
public class  {

    public static void main(String[] args) {

        // Read a Sudoku solution
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();

        System.out.println(isValid(grid));

    }

    public static boolean isValid(int[][] m) {

        return checkColumns(m) && checkRows(m) && checkEverySmallBox(m);
    }

    public static boolean checkColumns(int[][] m) {

        for (int j = 0; j < m.length; j++) {

            boolean[] columnCheck = new boolean[9];

            for (int i = 0; i < m.length; i++) {

                int index = m[i][j] - 1;
                if (index > 8) return false;
                if (!columnCheck[index]) {
                    columnCheck[index] = true;
                } else {
                    return false;
                }
            }

        }
        return true;
    }

    public static boolean checkRows(int[][] m) {

        for (int i = 0; i < m.length; i++) {

            boolean[] checkRow = new boolean[9];

            for (int j = 0; j < m[i].length; j++) {

                int index = m[i][j] - 1;
                if (index > 8) return false;
                if (!checkRow[index]) {
                    checkRow[index] = true;
                } else {
                    return false;
                }

            }
        }

        return true;

    }

    public static boolean checkEverySmallBox(int[][] m) {

        int boxRow = 0;
        while (boxRow < 81) {

            for (int i = boxRow / 3; i < (boxRow / 3) + 3; i++) {

                boolean[] checkBox = new boolean[9];

                for (int j = boxRow / 3; j < (boxRow / 3); j++) {

                    int index = m[i][j] - 1;
                    if (index > 8) return false;
                    if (!checkBox[index]) {
                        checkBox[index] = true;
                    } else {
                        return false;
                    }
                }
            }

            boxRow += 3;

        }


        return true;
    }
}