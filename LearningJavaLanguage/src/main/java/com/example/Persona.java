/*
 * ¿Que es la herencia?
 * Es un mecanismo de reutilizacicion del cadigo mediante el cual una clase puede heredar todos los 
 * los elementos publicos o protected de otra clase 
 * 
 *  Java, a diferencia de el lenguaje C++ solamente soporta la herencia simple de clase 
 *  es decir que no puede heredadar de mas de una clase, solamente puede herederar de una sola clase
 *  
 *  Todas las clases heredan de la clase Object 
 *  
 *  MUY IMPORTANTE!!!!!
 * Los constructores no se heredan  
 * */

package com.example;

import java.time.LocalDate;


public class Persona  {

	/*
	 * Los elementos miembros de una clase (propiedades, metodos, los constructores) 
	 * solamente pueden existir (vivir) en el plano de las clases o 
	 * en el plano de las instancias
	 * 
	 * El elemento que vive, que eciste en el plano de las clases tienen que tener el modificador static 
	 * y no necesita de una instancia de la clase para poder existir y se accede al mismo prefifandolo 
	 * por el nombre de la clase*/
	
	
	public static final String PAIS = "España";
	
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Genero genero;
	private LocalDate fechaNacimiento;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String primerApellido, String segundoApellido, Genero genero,
			LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", genero=" + genero + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
	

}
