package entidadse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("recursos/context.xml");
		
		Casa casa1 = (Casa) context.getBean("casa1");
		
		System.out.println(casa1);
		
		System.out.println("\nCalculo: " + casa1.calcularM2());
	}

}
