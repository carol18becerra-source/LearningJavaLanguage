

package com.example;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
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
	private Double salario;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
