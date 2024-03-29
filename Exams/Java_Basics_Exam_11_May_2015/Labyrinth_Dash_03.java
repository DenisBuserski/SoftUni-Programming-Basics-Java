import java.util.Scanner;

public class Labyrinth_Dash_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[rows][];

        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }
        char[] moves = scanner.nextLine().toCharArray();

        int currentRow = 0;
        int currentCol = 0;
        int movesMade = 0;
        int livesLeft = 3;

        for (char move : moves) {
            int initialRow = currentRow;
            int initialCol = currentCol;

            switch (move) {
                case '>':
                    currentCol++;
                    break;
                case '<':
                    currentCol--;
                    break;
                case 'v':
                    currentRow++;
                    break;
                case '^':
                    currentRow--;
                    break;
            }

            if (cellIsOutsideLabyrinth(currentRow, currentCol, matrix)) {
                movesMade++;
                System.out.println("Fell off a cliff! Game Over!");
                break;
            } else if (cellIsWall(currentRow, currentCol, matrix)) {
                currentRow = initialRow;
                currentCol = initialCol;
                System.out.println("Bumped a wall.");
            } else if (cellIsObstacle(currentRow, currentCol, matrix)) {
                movesMade++;
                livesLeft--;
                System.out.printf("Ouch! That hurt! Lives left: %d%n", livesLeft);

                if (livesLeft == 0) {
                    System.out.println("No lives left! Game Over!");
                    break;
                }
            } else if (cellIsLife(currentRow, currentCol, matrix)) {
                movesMade++;
                livesLeft++;
                matrix[currentRow][currentCol] = '.';
                System.out.printf("Awesome! Lives left: %d%n", livesLeft);
            } else {
                movesMade++;
                System.out.println("Made a move!");
            }
        }

        System.out.printf("Total moves made: %d", movesMade);
    }

    private static boolean cellIsOutsideLabyrinth(int row, int col, char[][] labyrinth) {
        if (row < 0 || row >= labyrinth.length) {
            return true;
        }

        if (col < 0 || col >= labyrinth[row].length) {
            return true;
        }

        return labyrinth[row][col] == ' ';
    }

    private static boolean cellIsWall(int row, int col, char[][] labyrinth) {
        return labyrinth[row][col] == '|' || labyrinth[row][col] == '_';
    }

    private static boolean cellIsObstacle(int row, int col, char[][] labyrinth) {
        return labyrinth[row][col] == '@' || labyrinth[row][col] == '#' || labyrinth[row][col] == '*';
    }

    private static boolean cellIsLife(int row, int col, char[][] labyrinth) {
        return labyrinth[row][col] == '$';
    }
}
