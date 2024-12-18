package mycGame;
import java.util.Random;
import java.util.Scanner;

public class MYCGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        MainCharacter jay = new MainCharacter(100, 135);
        System.out.println("Welcome to the MYC RPG Game!");
        System.out.println("You can move left or right and sometimes attack enemies.");
        System.out.println("Enemies have 100 health, and your sword deals random damage.");
        
        
        /*
        Random random = new Random();

        int playerPosition = 0; // Player starts at position 0
        int enemyHealth = 100;

        System.out.println("Welcome to the MYC RPG Game!");
        System.out.println("You can move left or right and attack enemies.");
        System.out.println("Enemies have 100 health, and your sword deals random damage.");

        while (true) {
            System.out.println("\nCurrent Position: " + playerPosition);
            System.out.println("Enemy Health: " + enemyHealth);
            System.out.print("Enter command (left, right, attack, quit): ");

            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "left":
                    playerPosition--;
                    System.out.println("You moved left to position " + playerPosition);
                    break;

                case "right":
                    playerPosition++;
                    System.out.println("You moved right to position " + playerPosition);
                    break;

                case "attack":
                    int damage = random.nextInt(20) + 1; // Random damage between 1 and 20
                    enemyHealth -= damage;
                    System.out.println("You attacked the enemy and dealt " + damage + " damage!");

                    if (enemyHealth <= 0) {
                        System.out.println("You defeated the enemy!");
                        enemyHealth = 100; // Reset enemy health for a new enemy
                        System.out.println("A new enemy appears with 100 health!");
                    }
                    break;

                case "quit":
                    System.out.println("Thanks for playing! Goodbye.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid command. Please enter left, right, attack, or quit."); */
            }
        }
    }
}
