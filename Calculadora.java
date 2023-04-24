import java.util.Scanner;

public class Calculadora {

	       static double sumar(double unNumero,double otroNumero)  {
	           return unNumero + otroNumero;
	  }
	       static double restar(double unNumero,double otroNumero)  {
	           return unNumero - otroNumero;
	  } 
	       static double dividir(double unNumero,double otroNumero)  {
	           return unNumero / otroNumero;
	  }
	       static double multiplicar(double unNumero,double otroNumero)  {
	           return unNumero * otroNumero;
	  }
	                       
	        public static void main(String[] args) {
	             	
                   Scanner z = new Scanner(System.in);

	             char operador = 0;
		     int opcion = 0;
                     double numero2 = 0, resultado = 0; 
	             boolean continuar = true;
		
		       while (continuar == true) {
		           System.out.println("Total: " + resultado);
			 if (operador != '6') {
			   System.out.println("5 para borrar \n6 para salir");
			   System.out.print("Elegí un operador: +, -, /, *");
		           System.out.println(" ");
		             operador = z.next().charAt(0);
		                  	     
		            if (operador != '5' && operador != '6') {
		               if (resultado == 0) {
				   System.out.print("Escribí un primer número: ");
	           	           resultado = z.nextDouble(); }
		                   System.out.print("Escribí un segundo número: ");
				   numero2 = z.nextDouble();
			}
		             switch (operador) {
                               case '+':
		                 System.out.print(resultado + " + " + numero2 + " = ");
		                 resultado = sumar(resultado,numero2);
				 System.out.println(resultado);
			       break;
		               case '-':
			         System.out.print(resultado + " - " + numero2 + " = ");
		                 resultado = restar(resultado,numero2);
				 System.out.println(resultado);
			       break;
		               case '*':
				  System.out.print(resultado + " * " + numero2 + " = ");
		                  resultado = multiplicar(resultado,numero2);
				  System.out.println(resultado);
			        break;
		                case '/':
		                   System.out.print(resultado + " / " + numero2 + " = ");
		               	   resultado = dividir(resultado,numero2);
				   System.out.println(resultado);
			        break;
		                case '5':
				   resultado = 0;
			           System.out.println("Se borro el restulado: " + resultado);
		                break;
	                        case '6':
		                z.close();
				    continuar = false;
			               	break;
		               	}
		                  	if (operador != '6') {
			              	System.out.print("¿Queres continuar? \n1 para continuar\n2 para finalizar");		
			                	opcion = z.nextInt();
			              	if (opcion == 2)  continuar = false;				 			
				}
			}
		}
	}
}