package es.softord.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1er paso "Crear CONTEXTO" CARGA XML DE CONFIGURACION
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//2do Petición de Bean al Contenedor
		SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado Pablo=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado Jose=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado Pedro=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		System.out.println(Maria);
		System.out.println(Pablo);
		System.out.println(Jose);
		System.out.println(Pedro);
		
		if(Maria==Pablo) { 
			System.out.println("Apuntan al mismo objeto");
		}else {
			System.out.println("No se trata del mismo objeto");
		}

	}

}
