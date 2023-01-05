package es.softord.IoC;

public class SecretarioEmpleado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario: "+informeNuevo.getInforme();
	}
	
	//Setter creado para la inyección de dependencias
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}	
			
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	//Creación de campo tipo creacionInforme (interfaz)
	private CreacionInformes informeNuevo;
	
	private String email;
	
	private String nombreEmpresa;

	
}
