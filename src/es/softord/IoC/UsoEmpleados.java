package es.softord.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//Creacipon de objetos de tipo Empleado
		Empleados Empleado1=new DirectorEmpleado();
		
		//Uso de los objetos creados
		System.out.println(Empleado1.getTareas());
		*/
		
		//1er paso "Crear CONTEXTO"
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2do paso "PEDIR EL BEAN el OBJETO"
		DirectorEmpleado Ozziel=contexto.getBean("miEmpleado",DirectorEmpleado.class);
		
		System.out.println(Ozziel.getTareas());
		
		System.out.println(Ozziel.getInforme());
		
		System.out.println("Email: "+Ozziel.getEmail());
		
		System.out.println("Nombre de Empresa: "+Ozziel.getNombreEmpresa());
		
		/*SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);		
		SecretarioEmpleado Pablo=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		
		System.out.println("Email: "+Maria.getEmail());
		
		System.out.println("Nombre de Empresa: "+Maria.getNombreEmpresa());
		
		System.out.println("Email Pablo: "+Pablo.getEmail());
		
		*/
		//Liberar la memoria cerrando el contexto
		contexto.close();
		

	}

}
