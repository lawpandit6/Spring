package in.ashokit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.configuration.ConfigeClass;

public class MainAppAnnotation {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(ConfigeClass.class);
	}
}
