/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;
/*
•	Jorge Rodrigo Dávalos González Plata
•	André Herrera Cataño 
•	Aranza Ibarra Camarena 
•	Emiliano Monroy Cruz
•	Andrés Guillermo Schafler Tenorio 

*/

public class PilaA<T> implements PilaADT<T>{
    
    private T[] elementos;
    private int tope;
    private final int MAX = 20;

    public PilaA() {
        elementos = (T[]) new Object[MAX];
        tope = -1;

    }

    public PilaA(int max) {
        elementos = (T[]) new Object[max];
        tope = -1;

    }

    public void push(T dato) {
        if(tope == elementos.length-1){
            
        }
        tope++;
        elementos[tope]=dato;

    }
    
    private void expande(){
        T[] nuevo = (T[]) new Object [elementos.length*2];
        for (int i=0; i<=tope; i++){
            nuevo[i] = elementos[i];
        }
        elementos=nuevo;
    }
    
    

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            T datoBotado = elementos[tope];
            elementos[tope] = null;
            tope--;
            return datoBotado;
        }
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return elementos[tope];
        }

    }

    public boolean isEmpty() {
        return tope == -1;
    }
  
    public String  toString(){
        String cadena = "";
        
        for (int i=tope; i>=0; i--)
            cadena +=  i + ": " +elementos[i] + "\n";
        
        return cadena;
        
    }
    
}