package com.example;

public class App {
	public static void main(String[] args) {

		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		
		persona1.setNombre("Dani");
		
		
		
		System.out.println("el valor de la variable" + "nombre para la referencia es: "
		+ persona1.getNombre());
		
		var persona3 = new Persona("Duglas","Glez","Villamizar");
		
		var persona4 = new Persona("Carolina");
		
		// Queremos imprimir en la consola persona3
		
		System.out.println(persona3.toString());
		
		var persona5 = new Persona("3500.50");
	}
}
