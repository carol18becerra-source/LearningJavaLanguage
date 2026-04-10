package com.example;

import java.time.LocalDate;
import java.time.Month;

public class App {


	public static void main(String[] args) {
		// ya es posible crear instancias de Empleado
		Empleado empleado1 = new Empleado();
		
		empleado1.setNombre("Jeronimo");
		
		Empleado empleado2 = new Empleado(3500.45, Dpto.RRHH, LocalDate.of(2000, Month.SEPTEMBER, 1));
		
		System.out.println(empleado2.toString());
		
/*Crear un empleado que tenga todo lo de una Persona y ademas lo propio del empleado
 * teniendo en cuenta que los constructores no se heredan */
		
	Empleado empleado3 = new Empleado("Juan", "Mtnez", "Lopez", Genero.HOMBRE,
			LocalDate.of(1980, Month.JANUARY, 20), 5000, Dpto.FINANZAS, LocalDate.of(2000, Month.SEPTEMBER, 12));
	
	System.out.println(empleado3);
	
	
	
	}
	
	
	
}
