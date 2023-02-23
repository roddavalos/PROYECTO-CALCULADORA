/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.ArrayList;
/**
 *•	Jorge Rodrigo Dávalos González Plata
•	André Herrera Cataño 
•	Aranza Ibarra Camarena 
•	Emiliano Monroy Cruz
•	Andrés Guillermo Schafler Tenorio 

 * @author andres
 */
public class main {
    
    public static void main(String[] args) throws Exception {
        Calculadora cal1 = new Calculadora();
        System.out.println(Calculadora.revisaParentesis("(8*8.9)-35")); //Probamos que funcione el metodo que revisa parentesis con reales
        System.out.println(Calculadora.revisaParentesis("")); //Prueba con la cadena vacia
        try{
            System.out.println(Calculadora.revisaParentesis(")546+2(")); //Prueba con parentesis al revés
        }catch(Exception e){
            System.out.println("Error: checa la sintaxis");
        }
        System.out.println(cal1.revisaParentesis("(8*8.9)-35")); //Probamos que funcione el metodo que revisa parentesis con reales
        System.out.println(cal1.revisaParentesis("")); //Prueba con la cadena vacia
        System.out.println(cal1.revisaParentesis(")546+2(")); //Prueba con parentesis al revés
        System.out.println(cal1.revisa("8.4+3-(4*2)")); //Revisa que no hayan dos operadores seguidos con reales
        System.out.println(cal1.revisa("°8.4+39-6+(4*432)")); //Revisa que no hayan dos operadores seguidos con reales y negativos
        System.out.println(cal1.revisa("534+23+5+23+-324")); //Revisa que no hayan dos operadores diferentes seguidos(regresa false porque si los hay)
        System.out.println(cal1.revisa("5653+23-5.54++9")); //Revisa que no hayan dos operadores seguidos con reales (regresa false porque si los hay)
        System.out.println(cal1.infiApost("2.5423+6-1")); //Prueba el cambio de infija a postfija con reales en arreglo
        System.out.println(cal1.infiApost("(8*23)+3-2")); //Prueba el cambio de infija a postfija con parentesis en arreglo
        System.out.println(cal1.infiApost("3.1416+5*3-4")); //Se espera [3.1416,5,3,*,+,4,-] porque *>+ en jerarquía
        System.out.println(cal1.infiApost("3.1416+5*(3-4)")); //Se espera [3.1416,5,3,4,-,*,+] porque primero se calcula lo que está entre parentesis y despues la multiplicacion
        System.out.println(cal1.infiApost("°3.1416+5*(3-°4)")); //Se prueba el cambio de infija a postfija con numeros negativos(señalados por el °)
        ArrayList<String> postfijo = new ArrayList<>();
        postfijo.add("3.1416");
        postfijo.add("5");
        postfijo.add("3");
        postfijo.add("*");                      //aquí hacemos una prueba del metodo estatico evaluarPostfijo para comprobar si funciona
        postfijo.add("4");
        postfijo.add("-");
        postfijo.add("+");
        System.out.println(postfijo);
        String resultado = Calculadora.evaluarPostfijo(postfijo);
        System.out.println("El resultado es: " + resultado);
        //Probamos el metodo final que recopila revisa,revisaParentesis,infiApost y evaluarPostfijo
        System.out.println(cal1.calculaFinal("3.1416+5*(°3-4)")); //Prueba con parentesis balanceados, reales y negativos
        System.out.println(cal1.calculaFinal("°3.1416+5*(3-4)")); //Prueba con reales negativos
        
        try{
            System.out.println(cal1.calculaFinal("3.1416+5*°3-4)")); //Prueba con parentesis mal balanceados
        }catch(Exception e){
            System.out.println("Error: checa la sintaxis");
        }
        try{
            System.out.println(cal1.calculaFinal("")); //Prueba con una cadena vacia (está comentada porque manda un arror de Coleccion Vacia y corta las demás pruebas)
        }catch(Exception e){
            System.out.println("Error: checa la sintaxis");
        }
        try{
            System.out.println(cal1.calculaFinal("3.1416-+5*(°3-4)")); //Prueba con una cadena con problemas sintácticos(dos operadores juntos)
        }catch(Exception e){
            System.out.println("Error: checa la sintaxis");
        }

    } 
    
}
