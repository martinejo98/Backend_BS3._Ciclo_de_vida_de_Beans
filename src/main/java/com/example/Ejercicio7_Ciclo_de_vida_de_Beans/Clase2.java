package com.example.Ejercicio7_Ciclo_de_vida_de_Beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=2) //Esta etiqueta establece el orden de ejecución de los BEANS que implementan la interfaz CommandLineRunner
public class Clase2 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception { //el metodo RUN se ejecuta cuando arranca la aplicación
        System.out.println("---------------------------------------HOLA DESDE CLASE SECUNDARIA----------------------------------------");
    }

}
