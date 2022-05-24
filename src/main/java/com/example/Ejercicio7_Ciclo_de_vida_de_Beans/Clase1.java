package com.example.Ejercicio7_Ciclo_de_vida_de_Beans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component  //al ponerle esta etiqueta (@componnet, @service o @repository, etc) se convierte en un bean
public class Clase1 {

    @PostConstruct  //al ejecutarse busca esta etiqueta e instancia esta clase y entra a los metods etc
    public void funcion1(){
        System.out.println("---------------------------------------HOLA DESDE CLASE INICIAL-------------------------------------------");
    }

    @PreDestroy //esta etiqueta me cierra este BEAN cuando paro la aplicación
    public void fin(){
        System.out.println("---------------------------------------HASTA LUEGO--------------------------------------------------------");
    }
}
