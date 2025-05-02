package adoptionAgency;

public class Dog {
	protected int age = 18;
	protected String name = "";
	protected boolean adopted = true;
	
	public Dog(int a, String n, boolean ad) {
		age = a;
		this.name = n;
		adopted = ad;
	}
	public boolean getAdoptionStatus() {
		return adopted;
	}
	public void stateAge() {
		System.out.println(name + " is "+ age +" years old.");
		
	}
	public void increaseAge() {
		age++;
	}
	
	public String toString() {
		stateAge();
		if(adopted) {
			return "I have been chosen!";
		}
		return "I haven't found a home yet :(";
		
	}
	public boolean equals(Dog doggy) {
		if(this.age == doggy.age&&
			this.name == doggy.name &&
			this.adopted == doggy.adopted) {
			return true;
			
		}
		return false;
	}
}
