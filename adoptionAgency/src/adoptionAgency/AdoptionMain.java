package adoptionAgency;

public class AdoptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog nigga = new Dog (11, "nigga", true);
		PuppyDog nigga2 = new PuppyDog(11, "nigga2", true, true);
		System.out.println(nigga.getAdoptionStatus());
		System.out.println(nigga2.getAdoptionStatus());
		nigga.stateAge();
		nigga2.stateAge();
		nigga.increaseAge();
		nigga2.increaseAge();
		nigga.stateAge();
		nigga2.stateAge();
		System.out.println(nigga);
		System.out.println(nigga2);
		Dog auraychigga = new Dog (10, "hello", true);
		Dog syrigga = new Dog(10, "hello", true);
		System.out.println(auraychigga.equals(syrigga));
		
	}

}
