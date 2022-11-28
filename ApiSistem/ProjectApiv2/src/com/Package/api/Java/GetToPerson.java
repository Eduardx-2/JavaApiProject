package com.Package.api.Java;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetToPerson {
	
	@SerializedName("cReniecApel_pate")
	@Expose
	private String cReniecApelPate;
	@SerializedName("cReniecApel_mate")
	@Expose
	private String cReniecApelMate;
	@SerializedName("cReniecNombres")
	@Expose
	private String cReniecNombres;
	@SerializedName("cReniecUbigeo")
	@Expose
	private String cReniecUbigeo;
	@SerializedName("cReniecDireccion")
	@Expose
	private String cReniecDireccion;
	@SerializedName("cReniecEsta_civi")
	@Expose
	private String cReniecEstaCivi;
	@SerializedName("cReniecRestricciones")
	@Expose
	private String cReniecRestricciones;
	public GetToPerson(String cReniecApelPate, String cReniecApelMate, String cReniecNombres, String cReniecUbigeo,
			String cReniecDireccion, String cReniecEstaCivi, String cReniecRestricciones) {
		super();
		this.cReniecApelPate = cReniecApelPate;
		this.cReniecApelMate = cReniecApelMate;
		this.cReniecNombres = cReniecNombres;
		this.cReniecUbigeo = cReniecUbigeo;
		this.cReniecDireccion = cReniecDireccion;
		this.cReniecEstaCivi = cReniecEstaCivi;
		this.cReniecRestricciones = cReniecRestricciones;
	}
	public String getcReniecApelPate() {
		return cReniecApelPate;
	}
	public void setcReniecApelPate(String cReniecApelPate) {
		this.cReniecApelPate = cReniecApelPate;
	}
	public String getcReniecApelMate() {
		return cReniecApelMate;
	}
	public void setcReniecApelMate(String cReniecApelMate) {
		this.cReniecApelMate = cReniecApelMate;
	}
	public String getcReniecNombres() {
		return cReniecNombres;
	}
	public void setcReniecNombres(String cReniecNombres) {
		this.cReniecNombres = cReniecNombres;
	}
	public String getcReniecUbigeo() {
		return cReniecUbigeo;
	}
	public void setcReniecUbigeo(String cReniecUbigeo) {
		this.cReniecUbigeo = cReniecUbigeo;
	}
	public String getcReniecDireccion() {
		return cReniecDireccion;
	}
	public void setcReniecDireccion(String cReniecDireccion) {
		this.cReniecDireccion = cReniecDireccion;
	}
	public String getcReniecEstaCivi() {
		return cReniecEstaCivi;
	}
	public void setcReniecEstaCivi(String cReniecEstaCivi) {
		this.cReniecEstaCivi = cReniecEstaCivi;
	}
	public String getcReniecRestricciones() {
		return cReniecRestricciones;
	}
	public void setcReniecRestricciones(String cReniecRestricciones) {
		this.cReniecRestricciones = cReniecRestricciones;
	}
	@Override
	public String toString() {
		return "GetToPerson [cReniecApelPate=" + cReniecApelPate + ", cReniecApelMate=" + cReniecApelMate
				+ ", cReniecNombres=" + cReniecNombres + ", cReniecUbigeo=" + cReniecUbigeo + ", cReniecDireccion="
				+ cReniecDireccion + ", cReniecEstaCivi=" + cReniecEstaCivi + ", cReniecRestricciones="
				+ cReniecRestricciones + "]";
	}

	
}
