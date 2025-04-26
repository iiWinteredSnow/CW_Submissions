package nonvoid;

import java.util.Scanner;

public class InvisibleMazeGame {

    // The maze (1 = wall, 0 = open path)
    private static final int[][] maze = {
        {0, 1, 0, 0},
        {0, 1, 1, 0},
        {0, 0, 0, 1},
        {1, 1, 0, 0}
    };

    private static int playerRow = 0; // Player's starting row
    private static int playerCol = 0; // Player's starting column
    private static final int goalRow = 3; // Goal row
    private static final int goalCol = 3; // Goal column

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Invisible Maze Game!");
        System.out.println("Use 'w', 'a', 's', 'd' to move (up, left, down, right).");

        while (true) {
            System.out.println("Enter your move:");
            char move = scanner.next().charAt(0);

            if (makeMove(move)) {
                System.out.println("You moved successfully.");
                if (playerRow == goalRow && playerCol == goalCol) {
                    System.out.println("Congratulations! You've reached the goal!");
                    break;
                }
            } else {
                System.out.println("You hit a wall or entered an invalid move. Try a different direction.");
            }
        }

        scanner.close();
    }

    // Method to handle player movement
    private static boolean makeMove(char move) {
        int newRow = playerRow;
        int newCol = playerCol;

        if (move == 'w') {
            newRow--; // Move up
        } else if (move == 'a') {
            newCol--; // Move left
        } else if (move == 's') {
            newRow++; // Move down
        } else if (move == 'd') {
            newCol++; // Move right
        } else {
            System.out.println("Invalid move. Use 'w', 'a', 's', 'd'.");
            return false;
        }

        // Check if the move is valid
        if (newRow >= 0 && newRow < maze.length && newCol >= 0 && newCol < maze[0].length && maze[newRow][newCol] == 0) {
            playerRow = newRow;
            playerCol = newCol;
            return true;
        }

        return false; // Move is invalid (hit a wall or out of bounds)
    }
}
