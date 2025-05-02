package adoptionAgency;

public class PuppyDog extends Dog {
	boolean isFed = true;
	
	public PuppyDog(int a, String n, boolean ad, boolean f) {
		super(a,n,ad);
		isFed = f;
	}
	public void stateAge() {
		System.out.println(name + " is "+ age +" months old.");
		
	}
	public void feedPup() {
		isFed = true;
	}
	public void increaseAge() {
		super.increaseAge();
		isFed = false;
	}
	public String toString() {
		if(isFed) {
			return super.toString() + "I'm fed!";
		}
		return super.toString() + "I must be fed.";
		
	}
	public boolean equals(PuppyDog lilDoggy) {
		if (super.equals(lilDoggy)&& this.isFed == lilDoggy.isFed) {
			return true;
		}
		return false;
	}

}
