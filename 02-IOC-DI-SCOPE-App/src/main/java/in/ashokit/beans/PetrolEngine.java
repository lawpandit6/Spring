package in.ashokit.beans;

public class PetrolEngine implements IEngine {
	@Override
	public int start() {
		System.out.println("Petrol Engine started..");
		return 1;
	}
}
