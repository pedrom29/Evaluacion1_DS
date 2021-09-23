/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Reserva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                  
        
        
        CrearReserva reserva1 = new CrearReserva(123,22,"S",10,250);
        CrearReserva cliente1 = new CrearReserva(189244931,"Juanito perez",34,"M","Chileno");
        
        System.out.println("Reserva generada con exito!");
        System.out.println("Su numero de reserva es: " +reserva1.codigo +","  + " Número de habitación:" +reserva1.numeroHabitacion +"," +  " Cantidad de noches:" +reserva1.cantidadNoches );
        if (reserva1.tipoHabitacion == "S"){
            System.out.println("Habitación: Suite ");                       
        }else {
            if (reserva1.tipoHabitacion == "I"){
                System.out.println("Habitación: individual ");
            }else{
                System.out.println("Habitación: Doble ");
            }
        }
        
        System.out.println("Datos del cliente:" );
        System.out.println("Rut del cliente: "+ cliente1.rut + "," + "Nombre del cliente: " +cliente1.nombre + ","+ " Edad del cliente:" + cliente1.edad + "," + "Nacionaldiad del cliente:" + cliente1.nacionalidad);        
        if (cliente1.sexo == "F"){
            System.out.println("El cliente es mujer");
        }else{
            System.out.println("El cliente es hombre");
        }
        System.out.println("Detalle factura: ");
        
        if (reserva1.cantidadNoches >= 7 ){
            System.out.println("Monto total a pagar: US$" + (reserva1.monto*0.9)*10);
        }else{
            System.out.println("Monto total a pagar: US$" + reserva1.monto*10 );           
        }        
    }
    
}
