package in.ashokit.annotation;

public class Motor {

	public Motor() {
		System.out.println("Motor:: constructor");
	}
	
	@PostConstruct
	public void m1() {
		System.out.println("m1() method called...");
	}
	
	public void doWork() {
		System.out.println("Motor pullig water....");
	}
	
	@PreDestroy
	public void m2() {
		System.out.println("m2() method called...");
	}
}
