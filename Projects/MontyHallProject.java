package montyHall;

import java.util.Scanner;

public class MontyHallTest {
	static Scanner myReader = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int win = ;
		
		int player = pickPlayerDoor();
		int win = win();
		
		int revealedDoor = showWrongDoor(win, player);
		player = toSwap(player, revealedDoor);
		if (player==win)
		{
			System.out.println("You won! the correct door was Door "+win+".");
		}
		else
		{
			System.out.println("You lost! the correct door was Door "+win+".");
		}
		myReader.close();
	}

	private static int pickPlayerDoor()
	{
		//make scanner object
		System.out.println("There are three doors. Pick one. ");
		Scanner myReader = new Scanner(System.in);
		String myInput= myReader.next();
		 
		if (myInput.equals("one")||myInput.equals("1"))
		{
			
			return 1;
		}
		else if (myInput.equals("two")||myInput.equals("2"))
		{
			return 2;
		}
		else if (myInput.equals("three")||myInput.equals("3"))
		{
			return 3;
		}
		else
		{
			System.out.println("try again :/");
			
			
			return 0;
		}
	}
	private static int win()
	{
		return ((int)(Math.random()*3)+1);
	}
	private static int showWrongDoor(int win, int player) 
	{
		int winDoor = win;
		int pla = player;
		int rev = winDoor;
		while ((rev==winDoor)||(rev==pla))
		{
			rev = (int)(Math.random()*3)+1;
		}
		System.out.println("Door "+rev+" is revealed to be wrong.");
		return rev;
		/*if ((pla==1)&&(winDoor==2))
		{
			System.out.println("Door "+rev+" is revealed to be wrong.");
		}
		else if ((pla==2)&&(winDoor==3))
		{
			System.out.println("Door 1 is revealed to be wrong.");
		}
		else if ((pla==1)&&(winDoor==3))
		{
			System.out.println("Door 2 is revealed to be wrong.");
		}
		else if (pla==winDoor)
		{
			System.out.println("Door "+rev+" is revealed to be wrong.");
		}*/
	}
	private static int toSwap(int player,int rev) 
	{
		  int pla = player;
		  int reveal = rev;
		  
		  Scanner myReader2 = new Scanner(System.in);
		 	System.out.println("Would you like to switch to Door "+swapNumber(pla, reveal)+"? y or n");
			String myInput2 = myReader2.next();
			 System.out.print(myInput2);
			if (myInput2.equals("y"))
			{
				System.out.println("Switching...");
				myReader2.close();
				return swapNumber(pla, reveal);
			}
			else if (myInput2.equals("n"))
			{
				System.out.println("Ok..."); 
				myReader2.close();
				return pla;
			}
			System.out.println(".");
			myReader2.close();
			return 0;
		 
		  
	}
	private static int swapNumber(int player, int rev)
	{
		int switchPla = player;
		int reveal = rev;
		switchPla = reveal;
		while (switchPla==reveal)
		{
			
			switchPla = (int)(Math.random()*3)+1;
		}
		System.out.println();
		return switchPla;
	}
}

