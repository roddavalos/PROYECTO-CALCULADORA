/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;
import java.util.ArrayList;

//**
 * <pre>
 * @author 
 *•	Jorge Rodrigo Dávalos González Plata
•	André Herrera Cataño 
•	Aranza Ibarra Camarena 
•	Emiliano Monroy Cruz
•	Andrés Guillermo Schafler Tenorio 
* 
* Proyecto para la clase de Estrcuturas de Datos 
* Crear una calculadora que:
* Revise la Sintaxis
* Cambie de notación infija a postfija 
* Evalue 

 * </pre>
 *//
 
public class Calculadora {
    
    private PilaA<Character> pila; //Pila para trabajar
    private ArrayList<String> postfija; // Para guardar la expresion PostFija
    private String auxiliar;
    
    
    public Calculadora() {
        pila = new PilaA();
        postfija = new ArrayList<String>();
        auxiliar = "";
    }
    /**
    
    
    </li>Método que cambia la notación de infija a Postfija </li>
    </li>Utiliza un ArrayList y una Pila </li>
    
    
    */
    
    
    public static ArrayList<String> infiApost(String operacion) {
        ArrayList<String> postfijo = new ArrayList<>();
        PilaADT<String> pila = new PilaA<>();
        
        // Cambia los espacios en blanco de la operación para que no hayan confusiones cuando se chequen los operadores
        operacion = operacion.replaceAll("\\s+","");
        
        // Dividir la operación en tokens, es decir, en subcadenas de la cadena operacion(de tal forma podemos usar reales)
        String[] tokens = operacion.split("(?<=[-+*/^()])|(?=[-+*/^()])"); //Agregamos en esta linea ° porque será el 
        //elemento que usaremos para identificar un numero como negativo
        
        // Recorrer los tokens y convertir de infijo a postfijo con un for each
        for (String token : tokens) {
            // Si es un número, agregarlo al arreglo postfijo
            if (token.matches("-?(\\d+\\.\\d+|\\d+)|°(\\d+\\.\\d+|\\d+)")) { //expresiones regulares
                postfijo.add(token);
            }
            // Si es un operador, 
            else if (token.matches("[+\\-*/^]")) { //es decir, si es +,-,*,/ o ^
                while (!pila.isEmpty() && previo(pila.peek()) >= previo(token)) {
                    postfijo.add(pila.pop());
                }
                pila.push(token);
            }
            // Si es un paréntesis de apertura, agregarlo a la pila
            else if (token.equals("(")) {
                pila.push(token);
            }
            // Si es un paréntesis de cierre
            else if (token.equals(")")) {
                while (!pila.isEmpty() && !pila.peek().equals("(")) {
                    postfijo.add(pila.pop());
                }
                if (!pila.isEmpty() && pila.peek().equals("(")) {
                    pila.pop();
                }//con los dos ultimos if eliminamos los parentesis de la ecuacion infija, pues con la notación postfija no son necesarios
            }
        }
        
        // Agregar los operadores que quedaron en la pila al arreglo postfijo
        while (!pila.isEmpty()) {
            postfijo.add(pila.pop());
        }
        
        return postfijo;
    }
 /**
 
 */
 
    private static int previo(String c) {
        int res;
        switch (c) {
            case "+", "-" -> {
                res= 1;
                break;
            }
            case "*", "/" -> {
                res= 2;
                break;
            }
            case "^" -> {
                res= 3;
                break;
            }
            default ->
                res=0;
        }
        return res;
    }

    public static boolean revisaParentesis(String operacion){
        boolean resp = true;
        PilaADT<Character> pila = new PilaA();
        for(int i=0; i<operacion.length(); i++){
            char c = operacion.charAt(i);
            if(c == '(' ){
                pila.push(c);
            } else if (c == ')'){
                if (pila.isEmpty())
                    resp= false;
                char tope = pila.pop();
                if(c == ')' && tope != '('){
                    resp= false;
                }
            }            
        }
        if(pila.isEmpty())
            resp = true;
        else
            resp= false;
        return resp;
    } //(7*8)-3
    
    public static boolean revisa(String operacion){
        
        Character[] oper = {'+','-','*','/','^'};
        boolean aux = false;
        int i=0;
        while(i<operacion.length() && !aux){
            int j=0;
            while(j<oper.length && !aux){
                if(operacion.charAt(i) == oper[j] && (operacion.charAt(i+1) == oper[0] || operacion.charAt(i+1) == oper[1] || operacion.charAt(i+1) == oper[2] || operacion.charAt(i+1) == oper[3] || operacion.charAt(i+1) == oper[4]))
                    aux = true;
                j++;
            }
            if(j==operacion.length()){
                aux = false;
            }
            i++;
        }
        
        return !aux && pruebaParentesisSinOperador(operacion);
    }
    
    public static boolean pruebaParentesisSinOperador(String operacion){ 
        boolean resp;
//este metodo comprueba que el usuario no sustituya los parentesis por operadores
        int i= 0;
        boolean noOperador = true, sinError = true;
        
        while(i < operacion.length() && noOperador) {
            if(operacion.charAt(i) == '+' || operacion.charAt(i) == '-' || operacion.charAt(i) == '*' 
               || operacion.charAt(i) == '/'||  operacion.charAt(i) == '^')
                noOperador = false;
            else if(i > 0 && operacion.charAt(i) == '(' && operacion.charAt(i-1) != '(')
                sinError = false;
            else if(i < operacion.length() -1  && operacion.charAt(i) == ')' && operacion.charAt(i+1) != ')')
                sinError = false;
            i++;
        }
        if(!noOperador) //signfica que si hay operador
            resp =  true;
        else
            resp = false;
        return resp;
    }
    
    
    public static String evaluarPostfijo(ArrayList<String> postfijo) {
        PilaADT<Double> pila = new PilaA<>(); // Creamos una nueva pila de números flotantes(double)
        // Iteramos para cada uno de los tokens en notación postfija, estos tokens los extraemos del método infiApost
        for (String token : postfijo) {
            if (token.matches("°?-?\\d+(\\.\\d+)?")) { // Si el token es un número,
                double num = Double.parseDouble(token.replace("°", ""));
                if(token.startsWith("°")){
                    num *= -1;
                }
                pila.push(num); //convertimos el String en Double usando un método propio de todos los objetos de Double
            }
            else if (token.matches("[+\\-*/^]")) { //si son operadores,
                // como en notación postfija tenemos, al menos, dos numeros antes de cada operador,
                double b = pila.pop(); //tomamos los dos ultimos numeros dentro de la pila y la operamos segun el token
                double a = pila.pop(); 
                switch (token) { //Usamos la regla switch por sugerencia de NetBeans(se ve más ordenado)
                    case "+" -> pila.push(a + b);
                    case "-" -> pila.push(a - b);
                    case "*" -> pila.push(a * b);
                    case "/" -> pila.push(a / b);
                    case "^" -> pila.push(Math.pow(a, b));
                } 
//ya que se haya operado segun el operador, el resultado de la operacion entre a y b se agrega a la pila en la ultima posición
            }
        }
        return Double.toString(pila.pop()); 
// Al final de las operaciones necesarias, el resultado de la evaluación queda en el tope de la pila, así que lo desapilamos y lo retornamos.
    }

    public void limpiar() { //este metodo limpia la pila, reiniciando la pila de operadores, el arreglo de Strings y el String auxiliar.
        pila = new PilaA();
        postfija = new ArrayList<String>();
        auxiliar = "";
    }
    
    public String calculaFinal(String cadena) throws Exception{
        if(revisaParentesis(cadena) && revisa(cadena))
            return evaluarPostfijo(infiApost(cadena));
        else
            throw new Exception("Error: checa la sintaxis");
        
    }
    
    
    
}

    
    
