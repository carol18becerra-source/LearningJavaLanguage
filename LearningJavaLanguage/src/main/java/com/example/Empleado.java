package com.example;

import java.time.LocalDate;

/*Empleado hereda de Persona, que es lo mismo que decir que Empleado es una subclase de Persona
 * que tambien es lo mismo que decir que Persona es la Super clase o la clase base de Empleados 
 * 
 * y tambien se puede decir que Empleado es un subtipo de Persona*/
public class Empleado extends Persona{
	private double salario;
	private Dpto dpto;
	private LocalDate feechaAlta;

	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(double salario, Dpto dpto, LocalDate feechaAlta) {
		super();
		this.salario = salario;
		this.dpto = dpto;
		this.feechaAlta = feechaAlta;
	}

	public Empleado(String nombre, String primerApellido, String segundoApellido, Genero genero,
			LocalDate fechaNacimiento, double salario, Dpto dpto, LocalDate feechaAlta) {
		super(nombre, primerApellido, segundoApellido, genero, fechaNacimiento);
		this.salario = salario;
		this.dpto = dpto;
		this.feechaAlta = feechaAlta;
	}

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", dpto=" + dpto + ", feechaAlta=" + feechaAlta + ", toString()="
				+ super.toString() + "]";
	}

	

	
	
	
}
