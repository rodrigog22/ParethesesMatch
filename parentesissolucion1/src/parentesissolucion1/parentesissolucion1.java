/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentesissolucion1;
import java.util.Scanner;
import java.util.Stack; // libreria para utilizar pila stack





public class parentesissolucion1 {

static char [] abiertos = {'(','{','['}; //arreglos para guardar los simbolos
static char [] cerrados = {')','}',']'};

static boolean parAbierto(char c){
    for (int i =0; i< abiertos.length;i++)
        if (abiertos[i] == c)
            return true;
    return false;                //funcion que valida si existen sibolos abiertos
            
}



static char parCerrado(char c){
    for (int i = 0; i< abiertos.length; i++)
        if (abiertos[i] ==c){
            return cerrados [i];
        }
  for (int i =0; i< cerrados.length; i++)
      if (cerrados[i]==c){
          return abiertos[i];
      }
  return '0';                             //funcion que retorna el cierre que cada signo o la apertura
}

    public static void main(String[] args) {
     Scanner entradaDatos = new Scanner(System.in);
     String expresion = entradaDatos.next();
     char [] expr = expresion.toCharArray();
     Stack<Character>  pila = new Stack<>();
     boolean correct =true;
     for (int i=0; i < expr.length;i++){
         if (parAbierto(expr[i]))
             pila.push(expr[i]);
         else{
             if(pila.isEmpty()){
                 correct = false;
                 break;
             }else if (pila.peek() != parCerrado(expr[i])){ // si el elemento de la pila es diferente a su
              correct = false;                              //cierre es incorrecta la expresion
              break;
         }else
             pila.pop(); // ve el tope de la pila y borra el elemento
         }
     
     
     }
    if(!pila.empty())
        correct = false; //  si la pila no quedo vacia la expresion es incorrecta
    
    if (correct)
     
        System.out.println(expresion + "es una expresion correcta");
       else
          System.out.println (expresion + "No es una expresion correcta");
    
    
    }
    
}
