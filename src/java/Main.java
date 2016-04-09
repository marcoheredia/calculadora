package calculadora;
////hay que ponerle la operacion en el siguiente formato:
////  num1 op1 num2 op2 = ||||| ej: 123+432-213
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {


	public static void analisis(String linea){
	
		
	}
	
	
	public static void main(String[] args) {

	        
	        int salida = 0;
	        while(salida != 1){
				System.out.println("Ingrese la suma:");

				Scanner scan = new Scanner(System.in);
				String linea = scan.nextLine();
				analisis(linea);
				System.out.println("ingrese '1' para salir o '0' para hacer otra operacion");
				salida = scan.nextInt();
				break;
			}
		}
	




}
