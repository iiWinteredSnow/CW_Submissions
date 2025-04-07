package tester;

import java.util.Scanner;

public class TicTacToe {
    private static final char EMPTY = '-';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initializeBoard();
        playGame();
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void playGame() {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = PLAYER_X;
        boolean gameWon = false;

        while (!gameWon && !isBoardFull()) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter row (0-2): ");
            int row = scanner.nextInt();
            System.out.println("Player " + currentPlayer + ", enter column (0-2): ");
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                gameWon = checkWin(currentPlayer);

                if (currentPlayer == PLAYER_X) {
                    currentPlayer = PLAYER_O;
                } else {
                    currentPlayer = PLAYER_X;
                }
            } else {
                System.out.println("Invalid move, try again.");
            }
        }

        printBoard();
        if (gameWon) {
            if (currentPlayer == PLAYER_X) {
                System.out.println("Player O wins!");
            } else {
                System.out.println("Player X wins!");
            }
        } else {
            System.out.println("It's a draw!");
        }

        scanner.close();
    }

    private static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            if (board[row][col] == EMPTY) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
