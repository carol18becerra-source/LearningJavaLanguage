package com.example;

import java.time.LocalDate;
import java.time.Month;

public class App {

	static String printObject(Object obj) {
		/*
		 * Recibo como parametro un object y en dependencia del tipo imprimira el
		 * salario si se trata de un empleado o el total de asignaturas si se tratase de
		 * un estudiante
		 */

		/* utilizando los venificion de Pattern Matching */

		if (obj instanceof Empleado empleado) {

			// Empleado empleado = (Empleado) object;

			return "Salario del empleado: " + empleado.getSalario();
		} else if (obj instanceof Estudiante estudiante) {

			// Estudiante estudiante = (Estudiante) obj;
			return "Total de asignaturas del estudiante: " + estudiante.getTotalAsignaturas();
		} else {
			return "No es ni empleado ni estudiante";
		}
	};

	public static void main(String[] args) {

		Persona[] personas = {

				Empleado.builder().nombre("Jorge").primerApellido("Pascual").segundoApellido("Ramirez")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1995, Month.JANUARY, 10)).salario(4500.34)
						.build(),

				Empleado.builder().nombre("Sebastian").primerApellido("Sanjuanelo").segundoApellido("Arrieta")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(2000, Month.DECEMBER, 1)).salario(2645.54)
						.build(),

				Empleado.builder().nombre("Alex Eduardo").primerApellido("Pilicita").segundoApellido("Changoluisa")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1997, Month.SEPTEMBER, 11)).salario(3567.40)
						.build(),

				Estudiante.builder().nombre("Javier").primerApellido("Jurado").segundoApellido("Moran")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(2005, Month.OCTOBER, 25))
						.totalAsignaturas(10).build(),

				Estudiante.builder().nombre("Rodrigo").primerApellido("Rivero").segundoApellido("Fernandez")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1992, Month.NOVEMBER, 4))
						.totalAsignaturas(5).build(),

				Estudiante.builder().nombre("Carolina").primerApellido("Garzon").segundoApellido("Becerra")
						.genero(Genero.MUJER).fechaNacimiento(LocalDate.of(2001, Month.JUNE, 7)).totalAsignaturas(10)
						.build()

		};

		/*
		 * El Operador instanceof se utiliza para saber si una variable de referencia o
		 * el objeto es una instancia de un tipo, es decir, de una clase concreta
		 */

		Persona p1 = new Persona();
		Estudiante e1 = new Estudiante();

		e1.setTotalAsignaturas(10);

		Empleado emp1 = new Empleado();

		emp1.setSalario(3450.25);

		/* Invocar o llamar el metodo printObject */

		String resultado = null;

		// System.out.println("El resultado es: " + printObject(p1));
		// System.out.println(printObject(e1));
		// System.out.println(printObject(emp1));

		/*
		 * Ejercicio de la actividad del miercoles 15 de abril
		 * 
		 * 1- crear un array de objetos y agregarle elmentos de tipo empleado y
		 * estudiante . tres empleados dos de genero hombre y uno de genero mujer o otro
		 * y tres estudiantes con todas la propiedades de persona en ambos casos
		 * 
		 * 2- recorer el array o iterar el array utilizando una sentencia for mejorado y
		 * para los estudiantes obtener la media de las asignaturas matriculadas, y para
		 * los empleados obtener el salario medio de los empleados del genero HOMBRE
		 * 
		 * Se sugiere utilizar Pattern Matching con instanceof en el momento de
		 * recorrer/iterar el array
		 */

		// Variables para acumular los datos
		double sumaSalarios = 0;
		int contador = 0;
		double sumaAsignaturasEstudiantes = 0;
		int contadorEstudiantes = 0;

		System.out.println("--------- PROCESANDO DATOS ---------");

		for (Persona p : personas) {

			// para Estudiantes
			if (p instanceof Estudiante es) {
				sumaAsignaturasEstudiantes += es.getTotalAsignaturas();
				contadorEstudiantes++;
				// System.out.println("Estudiante: " + es.getNombre() + " | Asignaturas: " +
				// es.getTotalAsignaturas());
			}

			// para Empleados
			else if (p instanceof Empleado emp) {
				if (emp.getGenero().equals(Genero.HOMBRE)) {
					sumaSalarios += emp.getSalario();
					contador++;
				}
				// System.out.println("Empleado: " + emp.getNombre() + " | Género: " +
				// emp.getGenero());
			}
		}

		System.out.println("--- RESULTADOS DE LAS MEDIAS ---");

		// Media de asignaturas
		if (contadorEstudiantes > 0) {
			double mediaAsignaturas = (double) sumaAsignaturasEstudiantes / contadorEstudiantes;
			System.out.println("Media de asignaturas de los estudiantes: " + mediaAsignaturas);
		} else {
			System.out.println("los alumnos no estan matriculados en ninguna asignatura");
		}

		// Salario medio
		if (contador > 0) {
			double salarioMedioHombres = sumaSalarios / contador;
			System.out.println("Salario medio de los empleados: " + salarioMedioHombres);
		} else {
			System.out.println("No se encontraron empleados para calcular la media.");
		}

	}
}