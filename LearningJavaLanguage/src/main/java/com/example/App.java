package com.example;

import java.time.LocalDate;
import java.time.Month;

public class App {

	public String texto = "Vivo en el plano de las instancias";

	public static void main(String[] args) {

		/*
		 * creacion o instanciacion de objetos utilizando el patron builder de lombok
		 * que no fue creado por lombok pero si lo han mejorado para su utilizacion.
		 * 
		 * el patron builder es llamado un patron de diseño Factory, es decir, es un
		 * patron de diseño creacional (para la creacion de objetos).
		 * 
		 * ¿Que ventajas nos aporta?
		 * 
		 * Nos permite crear objetos aunque no tengamos el constructor explicitamente
		 * implementado y ademas cuando vamos a crear un objeto el orden en que
		 * utilicemos las propiedades o campos de la clase indiferente
		 */

		Persona p1 = Persona.builder().salario(3500.25).nombre("Carolina").build();

		Persona persona2 = Persona.builder().nombre("Sebastian").primerApellido("Sanjaunelo").segundoApellido("Arrieta")
				.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(2000, Month.JANUARY, 20)).salario(4500.25).build();

		System.out.println(persona2);

		System.out.println("El pais de todas la personas es:" + Persona.PAIS);

		// Mostar el valor de la varible

		System.out.println(new App().texto);

	}
}
