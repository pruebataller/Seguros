package com.myspace.prjseguros;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Asegurado implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "ASEGURADO_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "ASEGURADO_ID_GENERATOR", sequenceName = "ASEGURADO_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label(value = "DPI del asegurado")
	private java.lang.String DPI;

	@org.kie.api.definition.type.Label(value = "Nombre del asegurado")
	private java.lang.String nombre;

	@org.kie.api.definition.type.Label(value = "Apellido del asegurado")
	private java.lang.String apellidos;

	@org.kie.api.definition.type.Label(value = "Edad del asegurado")
	private java.lang.Integer edad;

	public Asegurado() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getDPI() {
		return this.DPI;
	}

	public void setDPI(java.lang.String DPI) {
		this.DPI = DPI;
	}

	public java.lang.String getNombre() {
		return this.nombre;
	}

	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}

	public java.lang.String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(java.lang.String apellidos) {
		this.apellidos = apellidos;
	}

	public java.lang.Integer getEdad() {
		return this.edad;
	}

	public void setEdad(java.lang.Integer edad) {
		this.edad = edad;
	}

	public Asegurado(java.lang.Long id, java.lang.String DPI,
			java.lang.String nombre, java.lang.String apellidos,
			java.lang.Integer edad) {
		this.id = id;
		this.DPI = DPI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

}