package mycGame;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class MYCGame {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Welcome to the MYC RPG Game!");
        System.out.println("You can move left or right and sometimes attack enemies.");
        System.out.println("There will possibly be enemies, and your sword deals random damage.(don't you love gambling?)");
        
        
        
        //System.out.println("pick a path to start your journey!(tundra, park, quit)");
        String location;
        boolean tf = true;
        while (tf==true) {
        System.out.println("pick a path to start your journey!(tundra, park, quit)");
        String command = scanner.next();
        location = command;
        if (command.equals("tundra")){
        	System.out.println("you have selected tundra.");
        	System.out.println(location);
        	tundra();
        }
        else if (command.equals("park")){
        	System.out.println("you have selected park.");
        	System.out.println(location);
        	park();
        }  
        else if (command.equals("quit")){
        	System.out.println("Quitting...");
        	tf=false;
        	scanner.close();
        }
        else {
        	System.out.println("Invalid choice! try again.");
        }
        
        
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
    	//                                        the snowy scenery aka the easy mode
    	Scanner scanner = new Scanner(System.in);
        System.out.println("You decide it would be a good idea to wander around a tundra in a gangster attire. You encounter some "
        		+ "\n polar bears staring at you. There's even a cute cub, but you have to be careful of your next move."
        		+ "");
        wait(1);
    	System.out.println("You get this gut feeling about doing something AWESOME. What are you going to do?(jump, sneak)");
    	
    	Random random = new Random();
        String command = scanner.next();
        
        if (command.equals("jump")) {
        	MainCharacter me = new MainCharacter(93, 135);
           	System.out.println("WOAH! SICK JUMP over 5 POLAR BEARS! however 4 of them noticed you.");
        	wait(1);
        	System.out.println("a unusual brawl is about to occur!");
        	Enemy polar1 = new Enemy(150, 140);
        	Enemy polar2 = new Enemy(250, 120);
        	Enemy polar3 = new Enemy(250, 120);
        	Enemy polar4 = new Enemy(250, 120);
        	double eHP1 = polar1.getHealth();
        	double eHP2 = polar2.getHealth();
        	double eHP3 = polar3.getHealth();
        	double eHP4 = polar4.getHealth();
        	double HP = me.getHealth();
        	
        	int enemydamage = 3;
        	System.out.println("due to special conditions, speed is being thrown out the window. You equipped a KRISS Vector!");
        	System.out.println("The KRISS Vector allows you to triple your turn, attacking 3 times!");
        	while ((eHP1+eHP2+eHP3+eHP4>=1)&&(HP>=1)) {
        		System.out.println("What is your action?(attack1, attack2, attack3, attack4)");
        		String battleact = scanner.next();
        		wait(1);
        		int damage = 15 + random.nextInt(26);
        		
        		for(int i=0;i<3;i++) {
        			//     turns the gun into a burst fire.
        			damage = 15 + random.nextInt(26);
        			if(battleact.equals("attack1")) { // all the if statements just choose which enemy to attack
        				if (eHP1>=1) {
            				System.out.println("you have selected attack.");
            				eHP1 -= damage;
            				System.out.println("dealt " + damage + " damage! enemy #1 HP: "+ eHP1);
            				wait(1);
            				System.out.println();
            				System.out.println();
               				HP -= enemydamage;
            				System.out.println("polar bears dealt " + enemydamage + " damage! your HP: "+ HP);
            				wait(1);
            				System.out.println();
            				if ((HP<1)) {
            	        		break;
            	        	}
            			} 
            			else {
            				System.out.println("This enemy is already dead!");
            			}
        			} 	
        			
        			
        			
        			
        			
        			/*if (eHP4>=1) {
        				System.out.println("you have selected attack.");
        				eHP4 -= damage;
        				System.out.println("dealt " + damage + " damage! enemy #4 HP: "+ eHP4);
        				wait(1);
        				System.out.println();
        				System.out.println();
        				HP -= enemydamage;
        				System.out.println("polar bears dealt " + enemydamage + " damage! your HP: "+ HP);
        				wait(1);
        				System.out.println();
                     

        			} 
        			else {
        				System.out.println("This enemy is already dead!");
        			}
*/
        			
        			if(battleact.equals("attack2")) {
        				if (eHP2>=1) {
            				System.out.println("you have selected attack.");
            				eHP2 -= damage;
            				System.out.println("dealt " + damage + " damage! enemy #2 HP: "+ eHP2);
            				wait(1);
            				System.out.println();
            				System.out.println();
               				HP -= enemydamage;
            				System.out.println("polar bears dealt " + enemydamage + " damage! your HP: "+ HP);
            				wait(1);
            				System.out.println();
            				if ((HP<1)) {
            	        		break;
            	        	}

            			} 
            			else {
            				System.out.println("This enemy is already dead!");
            			}
        			} 	
        			if(battleact.equals("attack3")) {
        				if (eHP3>=1) {
            				System.out.println("you have selected attack.");
            				eHP3 -= damage;
            				System.out.println("dealt " + damage + " damage! enemy #3 HP: "+ eHP3);
            				wait(1);
            				System.out.println();
            				System.out.println();
               				HP -= enemydamage;
            				System.out.println("polar bears dealt " + enemydamage + " damage! your HP: "+ HP);
            				wait(1);
            				System.out.println();
            				if ((HP<1)) {
            	        		break;
            	        	}

            			} 
            			else {
            				System.out.println("This enemy is already dead!");
            			}
        			} 	
        			if(battleact.equals("attack4")) {
        				if (eHP4>=1) {
            				System.out.println("you have selected attack.");
            				eHP4 -= damage;
            				System.out.println("dealt " + damage + " damage! enemy #4 HP: "+ eHP4);
            				wait(1);
            				System.out.println();
            				System.out.println();
            				HP -= enemydamage;
            				System.out.println("polar bears dealt " + enemydamage + " damage! your HP: "+ HP);
            				wait(1);
            				System.out.println();
            				if ((HP<1)) {
            	        		break;
            	        	}

            			} 
            			else {
            				System.out.println("This enemy is already dead!");
            			}
        			} 	
        			else if (!battleact.equals("attack1")&&!battleact.equals("attack2")&&!battleact.equals("attack3")&&!battleact.equals("attack4")) {
        				System.out.println("You didn't act correctly and tripped. That's it for you.");
        				 HP -= enemydamage;
        				 wait(1);
                         System.out.println("polar bears dealt " + enemydamage + " damage! your HP: "+ HP);
                         System.out.println();
                         
        			}	
        		}	
        	
        	}
        	// after either you die or all enemies die:
        	if ((eHP1+eHP2+eHP3+eHP4<1)) {
        		wait(1);
        		System.out.println("Congratulations! you defeated the polar bears and moved on.");
        	}
        	if ((HP<1)) {
        		wait(1);
        		System.out.println("Congratulations! you suck at this game. You get eaten alive.");
        	}
        	
        	
        	
        	/*double eSP = exb.getSpeed();
        	double HP = chillguy.getHealth();
        	double SP = chillguy.getSpeed();
        	double u = 1;
        	while () {
        		System.out.println("What is your action?(attack, meditate, quit)");
                String battleact = scanner.next();
            	int damage = random.nextInt(20) + 1; //your damage
                if (battleact.equals("attack")){
                	System.out.println("you have selected attack.");
                	eHP -= damage;
                	System.out.println("dealt " + damage + " damage! enemy HP: "+ eHP);
                	System.out.println();
                	
                	System.out.println(u);
                	u++;
                	
                	
                	
             
                }*/
        
        }
        
        
        
        if (command.equals("sneak")) {
        	// the dark? route
        	
        	 System.out.println();
        	
        	int num = 3;
        	while (num==3) {
        		System.out.println("You try to sneak past but the baby cub notices you. It is about to alert the other 5,"
        			+ " threatening your safety. Are you going to kill it?(yes, &*^%^@&&)");
        		String darkact = scanner.next();
        		wait(1);
        	
        	if (darkact.equals("yes")) {
        		
        		System.out.println("You've become a monster. You ripped the cub's limbs off one by one and"
        				+ " made sure it was dead. You then took its meat home to eat. You survived!");
        		num=4;
        		
        	}
        	else {
        		System.out.println("You ^&*#% mu$#s$#t k!#$ the ba#@by.");
        		 System.out.println();
        		System.out.println("You ^&*#% mu$#s$#t k!#$ the ba#@by.");
        		 System.out.println();
        		 wait(1);
        		System.out.println("You ^&*#% mu$#s$#t k!#$ the ba#@by.");
        		 System.out.println();
        		 wait(1);
        		System.out.println("You ^&*#% mu$#s$#t k!#$ the ba#@by.");
        		 System.out.println();
        		wait(1);
        	}
        	}
        }
        else {
        	System.out.println("invalid. Restarting");
        }
    }
    
    
    
    
    
    
    
    public static void park(){ 
    	//                                        the park scenery aka the passive-agressive hard mode
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are walking in a park. You stop to admire the beautiful snowfall. It reminds you of"
    			+ " something but you can't put a finger on it. You only have the ability to walk forward so you walk forward.");
        wait(1);
    	System.out.println("you notice someone who brings you great pain, do you approach?(yes, no)");
    	
    	Random random = new Random();
        String command = scanner.next();
    	if (command.equals("yes")) {
        	System.out.println("(its your ex's boyfriend. will be a boss with a lot of health and a lot of damage)(parentheses for later edit)");
        	wait(1);
        	System.out.println("He hits you and ensues a fight.");
        	Enemy exb = new Enemy(1000, 140);
        	MainCharacter chillguy = new MainCharacter(93, 135);
        	double eHP = exb.getHealth();
        	double eSP = exb.getSpeed();
        	double HP = chillguy.getHealth();
        	double SP = chillguy.getSpeed();
        	double u = 1;
        	
        	
        	
        	
        	
        	
        	
        	if (SP>eSP) { // if your speed is faster than enemy
        		
            	int enemydamage = 1;
            	while ((eHP>=1)&&(HP>=1)) {
            		System.out.println("You are Faster!");
            		System.out.println("What is your action?(attack, quit)");
                    String battleact = scanner.next();
                	int damage = random.nextInt(20) + 1; //your damage
                    if (battleact.equals("attack")){
                    	System.out.println("you have selected attack."); // 
                    	eHP -= damage;
                    	System.out.println("dealt " + damage + " damage! enemy HP: "+ eHP);
                    	System.out.println();
                    	
                    	System.out.println("Turn "+u);
                    	u++;
                    	
                 
                    }
                    else if (battleact.equals("quit")){
                    	System.out.println("you have selected quit.");
                    	HP -= HP;
                    	System.out.println("You fazed out and died!");
                    	
                    	System.out.println("Turn "+u);
                    	u++;
                    	
                 
                    } 
                    else {
                    System.out.println("You suck at inputting, so you hesitated.");	
                    HP -= enemydamage;
                    System.out.println("Ex's Boyfriend dealt " + enemydamage + " damage! your HP: "+ HP);
                    }
                    
            	}
            	if (HP<1) {
            		
            		System.out.println("Ex's Boyfriend dealt " + enemydamage + " damage! your HP: "+ HP);
            		System.out.println("you died and your body was beaten to a bloody pulp.");
            		
            	}
            	if (eHP<1) {
            		System.out.println("As you throw the last punch, his beaten body falls, face first and seemingly blood spills from his pockets.");
            		wait(1);
            		System.out.println("you run away but happily as you satiated your pain.");
            		wait(1);
            		System.out.println("you have defeated ex's boyfriend!");
            		System.out.println();
            		wait(1);
            		System.out.println("The end.");

                }
        	}
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	if (SP<eSP) { // if your speed is slower than enemy
        		int enemydamage = 1;
            	while ((eHP>=1)&&(HP>=1)) {
            		int damage = random.nextInt(20) + 1; //your damage
                    HP -= enemydamage;
                    System.out.println("You are SLOWER!");
                    System.out.println("Ex's Boyfriend dealt " + enemydamage + " damage! your HP: "+ HP);
            		System.out.println("What is your action?(attack, meditate, quit)");
                    String battleact = scanner.next();
                    
                    
                    if (battleact.equals("attack")){
                    	System.out.println("you have selected attack.");
                    	System.out.println();
                    	eHP -= damage;
                    	System.out.println("dealt " + damage + " damage! enemy HP: "+ eHP);
                    	System.out.println("your HP: "+ HP);
                    	System.out.println();
                    	
                    	System.out.println("Turn "+u);
                    	u++;
                    	
                 
                    }
                    else if (battleact.equals("quit")){
                    	System.out.println("you have selected quit.");
                    	HP -= HP;
                    	System.out.println("You fazed out and died!");
                    	
                    	System.out.println("Turn "+u);
                    	u++;
                    	
                 
                    }
                    else {
                        System.out.println("You suck at inputting, so you hesitated.");	
                        }

                    
                    
            	}
            	if (HP<1) {
            		
            		System.out.println("Ex's Boyfriend dealt " + enemydamage + " damage! your HP: "+ HP);
            		System.out.println("you died and your body was beaten to a bloody pulp.");
            		
            		
            	}
            	if (eHP<1) {
            		System.out.println("As you throw the last punch, his beaten body falls, face first and seemingly blood spills from his pockets.");
            		wait(1);
            		System.out.println("you run away but happily as you satiated your pain.");
            		wait(1);
            		System.out.println("you have defeated ex's boyfriend!");
            		System.out.println();
            		wait(1);
            		System.out.println("The end.");

                }
        	}
        	
    	}
        	
       
    	if (command.equals("no")) {
    	System.out.println("you continue to exist and ignore the pain.");
    	System.out.println("The end.");
    	}
    	else {
    		System.out.println("Do you not know how to type?");
    	}
    
    }
    public static void wait(int sec){
    	int seconds = 1000*sec;
		try {
		    Thread.sleep(seconds); // Delay for a specified number of milliseconds
		} catch (InterruptedException e) {
		    // Handle the exception if the thread is interrupted
		    System.err.println("Interrupted: " + e.getMessage());
		}
    }
    
    
    
    
}
