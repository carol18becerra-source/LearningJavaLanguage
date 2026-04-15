package com.example;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder // Permite que las subclases hereden el builder
public class Persona {
	
    public static final String PAIS = "España";

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Genero genero;
    private LocalDate fechaNacimiento;

}
	
