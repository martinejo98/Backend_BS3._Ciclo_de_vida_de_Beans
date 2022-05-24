package com.example.Ejercicio7_Ciclo_de_vida_de_Beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Ejercicio7CicloDeVidaDeBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio7CicloDeVidaDeBeansApplication.class, args);
	}

	@Bean
	CommandLineRunner ejecutate(){
		return p -> System.out.println("Línea a ejecutar cuando se haya instanciado esta clase");
	}
}


/*
* El orden que se muesrtra por defecto es en el que hemos creado las claes pero nosotros con la etiqueta @ORDER podemos asignarle un valor para ordenar la ejecución.
* @PostConstruct hace que se ejecute la 1º antes de iniciar el programa.
* Ej: @ORDER(value=1) y @ORDER(value=2) hará que se ejecute primero la de valor 1 y depue´s ña de valor 2, con estas etiquetas poddemos establecer el orden de ejecución.
* */