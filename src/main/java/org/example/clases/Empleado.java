package org.example.clases;

public class Empleado {
    //ATRIBUTOS
    //(VARIABLES DE JAVA)
    //(FUERTES TIPADAS)
    public String id;
    public String nombres;
    public String apellidos;
    public String email;
    public String direccion;
    public String documento;
    public char tipoAfiliacionCajaCompensacion;

    byte edad;
    byte numeroHijos;
    float salario;
    short numeroBeneficiarios;
    double cuotaFondoEmpleado;
    double deduccionPrestamoVivienda;
    double deduccionGimnasio;
    double deduccionAlimentos;
    double deduccionSalud;
    double deduccionPensiones;
    double deduccionCajaCompesacion;
    double subsidioCajaCompensacion;
    double auxilioDeTransporte;
    double dotacion;
    double auxilioEscolar;



    //CONSTRUCTOR
    //(METODO ESPECIAL)
    //CREAR OBJETOS DE LA CLASE)

    public Empleado() {
    }

    //METODOS DE LA CLASE
    //(FUNCIONES DE JAVA)
    //(TODA FUNCION RETORNA ALGO EN JAVA)
    //CUANDO RETORNO NADA (VOID)

    public void saludar(){
        System.out.println("Hola, buenos dias");
    }
}
