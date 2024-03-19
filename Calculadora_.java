import java.util.Scanner;

public class Calculadora_
{
public static void main (String[] args){
System.out.println("introduzca la operacion");
Scanner entradaEscaner = new Scanner(System.in); ;
String numero = entradaEscaner.nextLine();
switch (opcion) {
    case 'numero.equalsIgnoreCase ("suma")':
    double num1=entradaEscaner.nextDouble ();
    double num2=entradaEscaner.nextDouble ();
    System.out.println("la suma es" + (num1+num2));
    break;
    case 'numero.equalsIgnoreCase ("resta")':
    double num1=entradaEscaner.nextDouble ();
    double num2=entradaEscaner.nextDouble ();
    System.out.println("la resta es" + (num1-num2));
    break;
    case 'numero.equalsIgnoreCase ("multiplicar")':
    double num1=entradaEscaner.nextDouble ();
    double num2=entradaEscaner.nextDouble ();
    System.out.println("el producto es" + (num1*num2));
    case 'numero.equalsIgnoreCase ("dividir")':
    double num1=entradaEscaner.nextDouble ();
    double num2=entradaEscaner.nextDouble ();
    if (num2!=0) {
        System.out.println("el cociente es" + (num1/num2));
        } else {
            System.out.println("no se puede dividir entre cero");
            }
            default:
            System.out.println("operacion no valida");
            }
            }
}