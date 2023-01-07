package es.softord.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cargar el XML de configuración
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		//Obtención del Bean
		Empleados ozz=contexto.getBean("miEmpleado",Empleados.class);
		
		System.out.println(ozz.getInforme());
		
		//Cerrar el contexto
		contexto.close();

	}

}
