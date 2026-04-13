package com.example;


public class App {
	// declaracion de variable de instancia
	// a nombre se le asignara el valor null y a total el valor cero 
	
	private String nombre;
	private int total;

	public static void main(String[] args) {
		
		/*CERIABLE
		 * para nombrar una varible hay que tener en cuenta lo siguiente:
		 * 
		 * 1- el primer caracter no puede ser un numero 
		 * 2- y aunque se permiten los caracteres $ y underscore (_) tampoco deben de 
		 * utilzarse como el primer caracter de un identificador, es decir, del nombre de la variable
		 * 
		 * Las variables que se declaran a nivel de la clase no es necesario asignarle ningun valor
		 * por defecto porque se le asigna un valor por defecto automaticamente. todo lo contrario 
		 * ocurre con las varibles locales 
		 * Las variables locales son aquellas que se declaran dentro de un bloque, es decir entre 
		 * llaves de apertura y cierre {}
		 * Aunque podemos declarar variable dentro de cualquier bloque {}, cuando nos referimos a 
		 * variable locales significa dentro de un metodo*/
		
		int total2 = 0;
		
		/*TIPOS DE DATOS
		 * 1- Primitivos (el nombre es todo en minuscula)
		 * 2- Objetos o Referencia (La primero letra del tipo es en mayuscula)
		 * 
		 * El tipo de dato que realmente existe es el tipo de dato primitivo que esta integrado en el propio
		 * lenguaje porque lo tipos objetos o referencia son un envoltorio de los tipos primitivos en 
		 * resumen que la gran mayoria de las ocasiones debemos utilizar tipos de datos primitivos 
		 * en lugar de su correspodiente tipo Objeto o Referencia
		 * Los tipos de datos primitivos no tienen propiedades ni metodos es decir que si le 
		 * agregamos el operador punto (.) no se va a desplegar ningun menu contextual*/
		
		Integer total3 = 24;
	}
 } 
