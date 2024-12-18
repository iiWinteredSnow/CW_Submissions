package mycGame;

public class Enemy {
	private double hp;
	private double spd;
	
	public Enemy(double health, double speed)
	{
		hp = health;
		spd = speed;
	}
	public double getSpeed()
	{
		return spd;
	}
	public double getHealth()
	{
		return hp;
	}
	public double takeDamage(double damage)
	{
		return hp-damage;
	}

}
