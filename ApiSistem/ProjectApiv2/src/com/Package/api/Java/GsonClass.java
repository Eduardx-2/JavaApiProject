package com.Package.api.Java;

public class GsonClass {
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private int fechaNacimiento;
	private String direccion;
	private String nombreCompleto;
	private int estadoCivil;
	
	public GsonClass(String nombres, String apellidoPaterno, String apellidoMaterno, int fechaNacimiento,
			String direccion, String nombreCompleto, int estadoCivil) {
		super();
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.nombreCompleto = nombreCompleto;
		this.estadoCivil = estadoCivil;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public int getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(int estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "NOMBRES:" + nombres + "\nAPELLIDO PATERNO:" + apellidoPaterno + "\nAPELLIDO MATERNO:"
				+ apellidoMaterno + "\nFECHA DE NACIMIENTO:" + fechaNacimiento + "\nDIRECCIÓN:" + direccion
				+ "\nNOMBRE: " + nombreCompleto + "\nESTADO CIVIL:" + estadoCivil;
	}
	

}
