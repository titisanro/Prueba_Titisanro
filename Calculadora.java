import java.util.Scanner;

public class Calculadora
{
public static void main (String[] args){
System.out.println("introduzca la operacion");
Scanner entradaEscaner = new Scanner(System.in); ;
String numero = entradaEscaner.nextLine();
if (numero.equalsIgnoreCase ("suma")) {
    double num1=entradaEscaner.nextDouble ();
    double num2=entradaEscaner.nextDouble ();
    System.out.println("la suma es" + (num1+num2));
    } else if (numero.equalsIgnoreCase ("resta")) {
        double num1=entradaEscaner.nextDouble ();
        double num2=entradaEscaner.nextDouble ();
        System.out.println("la resta es" + (num1-num2));
     } else if (numero.equalsIgnoreCase ("multiplicar")) {
        double num1=entradaEscaner.nextDouble ();
        double num2=entradaEscaner.nextDouble ();
        System.out.println("el producto es" + (num1*num2));
    } else if (numero.equalsIgnoreCase ("dividir")) {
        double num1=entradaEscaner.nextDouble ();
        double num2=entradaEscaner.nextDouble ();
        System.out.println("la division es" + (num1/num2));
    } else {
        System.out.println("no se reconoce");
                }
        }
}