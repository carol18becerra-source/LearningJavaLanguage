package com.example;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/*Empleado hereda de Persona, que es lo mismo que decir que Empleado es una subclase de Persona
 * que tambien es lo mismo que decir que Persona es la Super clase o la clase base de Empleados 
 * 
 * y tambien se puede decir que Empleado es un subtipo de Persona*/

@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
public class Empleado extends Persona{
	
	private double salario;
	private Dpto dpto;
	private LocalDate fechaAlta;
	//numero de la seguridad solial 
	private String ssn;
	
	

	
	
	
}
