package lessons.algorithms;

public class SudokuSolver {

    private static final char CHARZERO = '0';
    private static final int NINE = 9;


    public static void main(String[] args) {
        SudokuSolver s = new SudokuSolver();
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        char[][] anotherBoard = {
                {'9', '0', '0', '1', '0', '0', '0', '0', '5'},
                {'0', '0', '5', '0', '9', '0', '2', '0', '1'},
                {'8', '0', '0', '0', '4', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '8', '0', '0', '0', '0'},
                {'0', '0', '0', '7', '0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '2', '6', '0', '0', '9'},
                {'2', '0', '0', '3', '0', '0', '0', '0', '6'},
                {'0', '0', '0', '2', '0', '0', '9', '0', '0'},
                {'0', '0', '1', '9', '0', '4', '5', '7', '0'}
        };
        board = s.sudokuSolution(board);
        for (int i = 0; i < NINE; i++) {
            for (int j = 0; j < NINE; j++) {
                System.out.print(" " + board[i][j]);
            }

            System.out.println();
        }
    }

    public char[][] sudokuSolution(char[][] board) {
        if (solver(board)) {
            return board;
        }
        return null;
    }

    private boolean solver(char[][] board) {
        for (int row = 0; row < NINE; row++) {
            for (int column = 0; column < NINE; column++) {
                if (board[row][column] == '.') {
                    for (int number = 1; number <= NINE; number++) {
                        if (isLegal(row, column, board, (char) (number + '0'))) {
                            board[row][column] = (char) (number + '0');
                            if (solver(board)) {
                                return true;
                            } else {
                                board[row][column] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isLegal(int indexRow, int indexColumn, char[][] matrix, char number) {
        for (int i = 0; i < NINE; i++) {
            if (matrix[indexRow][i] == number || matrix[i][indexColumn] == number) return false;
        }
        int r = indexRow - indexRow % 3;
        int c = indexColumn - indexColumn % 3;
        for (int row = r; row < r + 3; row++) {
            for (int column = c; column < c + 3; column++) {
                if (matrix[row][column] == number) return false;
            }
        }
        return true;
    }


}

