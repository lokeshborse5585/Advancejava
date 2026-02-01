package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//compair with xml file
//having work is providing the configurutaion

import Class.MahindraCar;

//step1 (cop____ in xml  [providing the confiration])
@Configuration
public class ConfigMahindra {
	//method which help to creat the bean  og the class MahindraCar
//step2 (copaire____ in xml  [providing the bean tag +>@bean(naming)])
	//@bean it is methos leval anotation which is used the  in compir of xml file having bean tag that same work is do by the @bean anotation
	    // but  remebar that we are prioviding the   class="qlaified class name  so in this bean anotation
	    // we can creat the method isted of thr bean tag of the xml file and remebar that @bean(name bhi de sjkte ge bnne ke bad namewkyy rahe ga matlab bhahi he hame getBean method me lgtta he for thAT PURPOSE)
	    //smjo @bean ===> is case us bean ka nam method ka name hi rehta he  
	//iske adhar object bnakar kar return karna he  method ka rewtrun type class ka name rehega
	
//step 3  (copaire____ in xml [providing the properaty  clsong tag name="variable" valvue=" valvue=>> is used the set method of to set the value of the ojo class])
	
	@Bean("mahindra123")
	public MahindraCar mahindraCar()
	{   
		MahindraCar mahindra=new MahindraCar();
		  mahindra.setCarName("MAhindra XUV 700");
		  mahindra.setCarColor("Black");
		  mahindra.setCarId(12);
		  mahindra.setPrice(" 23 lack to 40 lack");
		return mahindra;
		
	}

}
