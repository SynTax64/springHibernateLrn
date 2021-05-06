package springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"springAnnotations/applicationContext.xml");

		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach theAlphaCoach = context.getBean("tennisCoach", Coach.class);

		boolean result = theCoach == theAlphaCoach;
		System.out.println("Pointing to the same object: " + result);
		System.out.println("Address of theCoach Object: " + theCoach);
		System.out.println("Address of theAlphaCoach Object: " + theAlphaCoach);

		context.close();
	}
}
