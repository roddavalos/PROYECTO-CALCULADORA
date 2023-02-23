/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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
public interface PilaADT <T>{
    public void push(T dato);
    public T pop();
    public T peek();
    public boolean isEmpty();
}
