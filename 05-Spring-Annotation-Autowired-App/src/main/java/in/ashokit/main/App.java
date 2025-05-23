package in.ashokit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.config.ConfigClass;
import in.ashokit.service.Generate;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

		Generate bean = context.getBean(Generate.class);
		bean.generate();
	}
}
