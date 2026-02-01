package Driverse_Class;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Class.MahindraCar;
import config.ConfigMahindra;

public class MAhindraCarDependancay {
public static void main(String[] args) {
	   ApplicationContext context=new AnnotationConfigApplicationContext(ConfigMahindra.class);
	             MahindraCar car=(MahindraCar) context.getBean("mahindra123");
	              System.out.println(car.getCarColor());
	              System.out.println(car.getCarId());
	              System.out.println(car.getCarName());
	              System.out.println(car.getPrice());
	          
}
}
