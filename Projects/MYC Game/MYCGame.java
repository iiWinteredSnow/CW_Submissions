package mycGame;
import java.util.Random;
import java.util.Scanner;

public class MYCGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Welcome to the MYC RPG Game!");
        System.out.println("You can move left or right and sometimes attack enemies.");
        System.out.println("There will possibly be enemies, and your sword deals random damage.(don't you love gambling?)");
        
        
        
        System.out.println("pick a path to start your journey!(tundra, desert, park, beach)");
        String location;
        while (true) {
        String command = scanner.next();
        location = command;
        if (command.equals("tundra")){
        	System.out.println("you have selected tundra.");
        	System.out.println(location);
        }
        if (command.equals("desert")){
        	System.out.println("you have selected desert.");
        }
        if (command.equals("park")){
        	System.out.println("you have selected park.");
        	park();
        }
        if (command.equals("beach")){
        	System.out.println("you have selected beach.");
        }
        break; // couldn't find anything or do anything(that i could) to not use this
        
       }
         
        scanner.close();
        
        
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
                    System.out.println("Invalid command. Please enter left, right, attack, or quit."); 
            }
        }*/
    }
    public static void tundra(){
    	
    }
    public static void desert(){
    	
    }
    public static void park(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are walking in a park. You stop to admire the beautiful snowfall. It reminds you of"
    			+ " something but you can't put a finger on it. You only have the ability to walk forward so you walk forward.");
    	System.out.println("(you notice someone who brings you great pain, do you approach?)(yes, no)");
    	
    	Random random = new Random();
        String command = scanner.next();
    	if (command.equals("yes")) {
        	System.out.println("(its your ex's boyfriend. will be a boss with a lot of health and a lot of damage)(parentheses for later edit)");
        	Enemy exb = new Enemy(1000, 140);
        	double eHP = exb.getHealth();
        	double eSP = exb.getSpeed();
        	
        	while (eHP>=0) {
                String battleact = scanner.next();
            	int damage = random.nextInt(20) + 1;
                if (battleact.equals("attack")){
                	System.out.println("you have selected attack.");
                	eHP -= damage;
                	System.out.println("dealt " + damage + " damage! enemy HP: "+ eHP);
             
                }
        	}
        	System.out.println("you have defeated ex's boyfriend!");
    	}
        	
       
    	if (command.equals("no")) {
    	System.out.println("(you continue to exist and ignore the pain.)");
    	}
    
    }
    public static void beach(){
    	
    }
    
    
    
    
}
