package conteo.de.parentesis;
import java.util.Scanner; 
import java.util.Stack; // libreria para utilizar pila stack





public class ConteoDeParentesis {

    
    public static void main(String[] args) {
        
        System.out.println("(a[0]+b[2c[6]]){24+53} passed:" + parensMatch ("(a[0]+b[2c[6]]){24+53} :"));
        System.out.println("f(e(d)) passed:" + parensMatch ("f(e(d)) :"));
        System.out.println("((b) passed:" + parensMatch ("((b):"));
        
    }
    
      public static boolean parensMatch(String sentence) {
          
     Stack<Character> stackSimbolos = new Stack<Character>();
    char arraySimbolos[] = sentence.toCharArray();
    int i;
    for (i = 0; i < arraySimbolos.length; i++) {
      if (arraySimbolos[i] == '(' || arraySimbolos[i]=='{' || arraySimbolos [i]== '[' ) {
        stackSimbolos.push(arraySimbolos[i]);
      }else if (arraySimbolos[i] == ')' || arraySimbolos [i]=='}' || arraySimbolos [i]==']') {
        if (!stackSimbolos.empty() && stackSimbolos.peek() != ')') {
          stackSimbolos.pop();
        }else{
          stackSimbolos.push(arraySimbolos[i]);
        }
      }
    }
  return stackSimbolos.empty();
 
}
}


