package com.example;

import java.time.LocalDate;
import java.time.Month;

public class App {

	static final int TOTAL_ELEMENTOS = 100;

	public static void main(String[] args) {

		/*
		 * ¿Que es un array?
		 * 
		 * Es un identificador que a diferencia de una variable hace referencia a una
		 * zona en la memoria RAM donde se almacenan un conjuno de valores del mismo
		 * tipo de dato
		 * 
		 * un array una vez creado es de tamaño fojo se puede modificar sus elementos
		 * pero no se puede modificar la cantidad de elementos del array
		 * 
		 * Para acceder a los elementos de un array se utiliza un indice entre corchetes
		 * que se inicia en el valor cero
		 * 
		 * Supongamos que tenemos una aplicacion que maneja nombres si por cada nombre
		 * creamos una varible seria bastante engorroso recorrer todos los nomres a
		 * traves de los nombres de las variables ademas de lo complicado que seria
		 * darle mantenimiento a una aplicacion de este tipo
		 */

		String nombre1 = "Carolina";
		String nombre2 = "Jorge";
		String nombre3 = "Dani";

		/* como declarar un array con los elementos anteriores */

		String[] nombres = { "Carolina", "Jorge", "Dani" };

		/* A continuacion declaramos un array de numeros enteros primitivos */

		int[] numeros = { 1, 2, 3, 4, 5 };

		/* Mostrar por consola la cantidad de elementos que tiene el array numeros */
		System.out.println("El array numeros tiene: " + numeros.length + " elementos");

		/* para mostar el primer elemento del array numeros */

		System.out.println("El primer elemento del array seria: " + numeros[0]);

		/*
		 * numeros es un array de tamaño fijo puedo modificar sus elementos pero no
		 * agregar ni eliminar ningundo
		 */

		// modificar el primer elemento del array
		numeros[0] = 100;

		System.out.println(numeros[0]);

		/*
		 * Crear arrays reservando en memoria espacio para los elementos que tendran el
		 * array posteriormente
		 */

		int[] numeros2 = new int[10];
		System.out.println("El array numeros2 tiene: " + numeros2.length + " elementos");
		System.out.println("El primer elemento del array numeros2 es: " + numeros2[0]);

		/*
		 * creando un array de persona es decir un array donde cada elemento del array
		 * es de un tipo persona
		 */

		Persona[] personas = {

				Persona.builder().nombre("Jorge").primerApellido("Pascual").segundoApellido("Ramirez")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1995, Month.JANUARY, 10)).salario(3500.50)
						.build(),

				Persona.builder().nombre("Sebastian").primerApellido("Sanjuanelo").segundoApellido("Arrieta")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(2000, Month.DECEMBER, 1)).salario(2450.70)
						.build(),

				Persona.builder().nombre("Alex Eduardo").primerApellido("Pilicita").segundoApellido("Changoluisa")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1997, Month.SEPTEMBER, 11)).salario(4800.46)
						.build(),

				Persona.builder().nombre("Javier").primerApellido("Jurado").segundoApellido("Moran")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(2005, Month.OCTOBER, 25)).salario(4500.50)
						.build(),

				Persona.builder().nombre("Rodrigo").primerApellido("Rivero").segundoApellido("Fernandez")
						.genero(Genero.HOMBRE).fechaNacimiento(LocalDate.of(1992, Month.NOVEMBER, 4)).salario(3760.40)
						.build()

		};

		/* OPERADORES */

		/*
		 * Opereradores aritmeticos que son: +, -, *, /, %
		 * 
		 * de los anteriores operadores vamos a ejemplificar a continuacion el operador
		 * % (utilizado entre otras cosas para saber si un numero es par o no)
		 * 
		 * vamos a implementar una sentencia de control de flujo que no existe en SQL
		 * que es la sentencia for que se utiliza para recorrer los elementos del erray
		 * 
		 * primero utilizaremos la sentecia for clasica y posteriormente la sentencia
		 * for mejorado (mal llamado for each)
		 */

		/*
		 * el ejemplo concretamente seria:
		 * 
		 * 1- declarar un array de 100 elementos 2- agregarle valores al array 3-
		 * recorrer el array y solamente mostar los elementos que sea pares.
		 */

		// declaracion del array de 100 elementos

		int[] numerosEnteros = new int[TOTAL_ELEMENTOS];

		/*
		 * recorrer el array numerosEnteros y asignar a cada elemento un calor entre 1 y
		 * 100.
		 * 
		 * for (int i = 0; i <= TOTAL_ELEMENTOS - 1; i = i + 1) {
		 * 
		 * //numerosEnteros[i] = i + 1;
		 * 
		 * } NOTA IMPORTANTE cuando el operador de auto incremento (++) o tambien auto
		 * decremento (--) esta solo en una sentencia da lo mismo que vaya delante de la
		 * variable o detras es decir ++i; es lo mismo que i++;
		 * 
		 * pero cuando el operador de auto incremento o auto decremento esta en un
		 * expresion aqui si importa el orden por ejemplo
		 * 
		 * ++i * 25; primero incrementa el valor de la i y luego lo multiplica por 25
		 * i-- * 25; primero decrementa el valor de la i y luego lo multiplica por 25
		 */

		/*
		 * la expresion i = i + 1 da lugar al operador de auto incremento que seria i++
		 */

		for (int i = 0; i <= TOTAL_ELEMENTOS - 1; i++) {

			numerosEnteros[i] = i + 1;

		}
		// mostrar los elementos del array original. y aqui vamos a utizar una SENTENCIA FOR MEJORADA
		
		System.out.println("------------ Array original ---------------");
		
		for ( int numeroEntero : numerosEnteros)
			System.out.println(numeroEntero);

		/*Utilizando una sentencia for clasica recorrer el arrray numerosEnteros y mostrar solamente los que sean pares*/
		
		System.out.println("--------- Elementos que son par del array original -----------");
		
		 for (int i = 0; i <= TOTAL_ELEMENTOS - 1; i++) {
			 if (numerosEnteros[i] % 2 == 0) {
				 // si entramos en este bloque (llave de apertura y llave de cierre )
				 // quiere decir que el elemento del array numerosEnteros es par
				 System.out.println(numerosEnteros[i]);
			 }
		 }
		 
		 /*Ejercicio # 3.

			1-Comitear los cambios actuales del proyecto Learning Java Language, poner como comentario, por ejemplo, 
			“antes de realizar el ejercicio 3” 
			2-Utilizar un bucle for mejorado para mostrar los elementos 
			que son impares del array numeros Enteros y contar la cantidad de números impares encontrados*/
		 
		  System.out.println("--------------- EJERCICIO # 3 ----------------");
			 
			 int contadorImpares = 0;
			 
			 
			  System.out.println("--------------- Numeros impares ----------------");
			 for (int numero : numerosEnteros) {
		            if (numero % 2 != 0) {
		                System.out.println(numero);
		                contadorImpares++;
		            }
		        }

			  	System.out.println("-------------------------------");

		        System.out.println("Cantidad total de impares: " + contadorImpares); 
		
		        /*SENTENCIA DE ASIGNACION COMPUESTA */
		        
		        byte a = 10;
		        short b = 10;
		        
		        /*La expresion siguiente al evaluarse se promueve al tipo de dato int primitivo 
		         * los valores de las variables a y b, dando como resultado un valor de tipo
		         * int que no se puede almacenar en un tipo short, por lo cual hay que realizar un 
		         * type casting (en castellano simplemente casteo) ¿Que es un casteo o 
		         * type casting? es simplemente forzar el tipo de un resultado al tipo de datos
		         * que queremos y se escribe entre parentesis*/
		        
		        //b = a + b;
		        
		        // la expresion anterior genera un error en tiempo de compilacion es decir que 
		        // no hay que ejecutar el programa para que ya te informe el error
		 
		        b = (short) (a + b);
		        
		        System.out.println("Resultado casteado explicitamente: " + b);
		        
		        /*El casteo type casting debe ser evitado en la medida de lo posible, asi que la 
		         * situacion anterior se soluciona mediante una sentencia de asignacion compuesta*/
		        
		        b += a;
		        System.out.println("El valor de b sera: " + b);
		        
		        /* OPERADOR TERNARIO   
		         * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html
		         * Buscar ternary operator en la pagina
		         * 
		         * Este operador trabaja con tres operandos y es una alternativa al uso de la sentencia
		         * if, y en ocasiones es la unica forma posible de solucinar algun problema concreto 
		         * por ejemplo cuando se necesita retornar un valor en la misma sentencia
		         * */
		        
		        String n1 = "Margarita";
		        
		        String resultado = n1.equals("Pepe") ? 
		        		"Si, es n1 tiene el valor Pepe":
		        			"No, n1 no tiene el valor de Pepe";
		        System.out.println(resultado);
		        
		        /*La condicion del operador ternario no tiene que ir entre parentesis y en la 
		         * condicion podemos utilizar muchos operadores condicionales como 
		         * AND (&&), OR (||), NOT (!), Operadores relacionales (<, >, !=, etc.) pero el resultado
		         * final tiene que ser un booleano, es decir, true o false*/
		        
		        int resultado2 = b > a && n1.equals("Pepe") || b < a * 25 && b != 15 ? 10 : 50;
		        System.out.println(resultado2);
	}
}