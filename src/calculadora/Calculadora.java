
package calculadora;

/**
 *
 * @author bff08
 */
import java.util.Scanner;
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char operador;
        Double numero1, numero2, resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione el tipo de operacion: +, -, * o /");
        operador = entrada.next().charAt(0);
        System.out.println("Ingrese el primer numero");
        numero1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero");
        numero2 = entrada.nextDouble();
        //CASOS
        switch(operador){
            case '+':
                resultado = numero1 + numero2;
                System.out.println("La suma de: "+numero1+" y "+numero2+"es igual a: "+resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("La resta de: "+numero1+ " y "+numero2+"es igual a: " +resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println(numero1 +"multiplicado por " +numero2 + "es iguala a: "+resultado);
                break;
            case '/':
                resultado = numero1 / numero2;
                System.out.println(numero1+"dividido en "+numero2+"es igual a: "+resultado);
                break;
                
            default:
                System.out.println("A elejido un operador invalido");
                break;
        }
        entrada.close();
    }
    
}
