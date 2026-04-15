

/*Empleado hereda de Persona, que es lo mismo que decir que Empleado es una subclase de Persona
 * que tambien es lo mismo que decir que Persona es la Super clase o la clase base de Empleados 
 * 
 * y tambien se puede decir que Empleado es un subtipo de Persona*/

package com.example;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@SuperBuilder // Fundamental para que funcione junto con Persona
public class Empleado extends Persona {

    private double salario;
    private Dpto dpto;
    private LocalDate fechaAlta;
    // numero de la seguridad social
    private String ssn;
}
	

	
	
	

