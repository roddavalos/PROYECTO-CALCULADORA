/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *•	Jorge Rodrigo Dávalos González Plata
•	André Herrera Cataño 
•	Aranza Ibarra Camarena 
•	Emiliano Monroy Cruz
•	Andrés Guillermo Schafler Tenorio 

 * @author rod_c
 */
public class EmptyStackException extends RuntimeException{
    
    public EmptyStackException() {
        super("Coleccion vacia");
    }

    public EmptyStackException(String mensaje) {
        super(mensaje);
    }
    
}
