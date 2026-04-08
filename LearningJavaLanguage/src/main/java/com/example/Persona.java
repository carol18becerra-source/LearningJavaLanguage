package com.example;

public class Persona {

	/*
	 * A continucion las variables mienbros de la clase, que se le llama:
	 * propiadades, campos y atributos
	 */

	/*
	 * Modificadores de acceso:
	 * 
	 * 1- privado del paquete, es el por defecto 2- public => es accesible en todos
	 * los paquetes 3- private => es solo accesible por elementos de la misma clase,
	 * dentro de la propia clase y incluso un objeto o una instancia de la misma
	 * clase no puede accerder a las propiedades privadas 4- protected => herencia,
	 * que veremos posteriormente
	 * 
	 * IMPORTANTE !!!: una clase bien diseñada es aquella que tiene todas sus
	 * propiedades o campos privados y solamente se relaciona con el mundo exterior
	 * a traves de metodos publicos que acceden a dichas variables privadas
	 */

	

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	
	/*
	 * Metodos Getter and Setter, son metodos publicos a traves de los se pueden
	 * modificar las variables privadas de la clase
	 */
	
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

}
