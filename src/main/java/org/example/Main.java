package org.example;

import org.example.clases.Empleado;

public class Main {
    public static void main(String[] args) {

        //PARA USAR UNA CLASE DEBO
        //CREAR UN OBJETO DE LA CLASE QUE YO
        //PROGRAME

        //UN OBJETO ES UNA VARIABLE QUE NO ES PRIMITIVA, UNA POSICION EN MEMORIA
        Empleado objeto = new Empleado();

        //USAR UNA CLASE ES ACCEDER A SUS ATRIBUTOS Y METODOS
        //ACCEDO A UN ATRIBUTO PARA ALMACENAR UN VALOR EN MEMORIA
        System.out.println(objeto.nombres);

        //AACCEDO A UN METODO PARA DISFRUTAR LA FUNCIONALIDAD DEL SUBPROGRAMA
        objeto.saludar();
    }
}