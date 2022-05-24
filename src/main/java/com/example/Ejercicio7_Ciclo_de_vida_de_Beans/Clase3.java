package com.example.Ejercicio7_Ciclo_de_vida_de_Beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=1)
public class Clase3 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("---------------------------------------HOLA DESDE CLASE TERCERA-------------------------------------------");
        for(String g: args){    //Este bucle me retorna los valores pasados como parámetros al ejecutarse (estos valores están dentro del "args" y se lo paso por la config del programa
            System.out.println(g);
        }
    }
}
