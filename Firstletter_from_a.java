package com.streemApi;

import java.util.ArrayList;
import java.util.Optional;

public class Firstletter_from_a {
  
	public static void main(String[] args) {
		ArrayList<String> ch1=new ArrayList();
		ch1.add("aokesh");
		ch1.add("bhavesh");
		ch1.add("yogesh");
		
		//finffirst                                                   //find first is also terminal obkect as like
    Optional<String> res   =ch1.stream().filter(s->s.startsWith("a")).findFirst();
     
    System.out.println(res);//Optional[aokesh]
        //limit
       // ch1.stream().filter(s->s.startsWith("a")).limit(1).forEach(System.out::println);//aokesh
	}
	
}
