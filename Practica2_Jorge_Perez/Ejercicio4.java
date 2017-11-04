/**Ejercicio 4
*Clase que calcula cualquiera de las tres funciones de -10 a 10
*@version 1.0
*@author Jorge Ivan Perez Perez 
**/

import java.util.Scanner;

public class Ejercicio4{

public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	int opcion,res1,res2;
	double res3;
	
	System.out.println("Cual funcion quieres evaluar?");
	System.out.println("1. x+1");
	System.out.println("2. 2*x");
	System.out.println("3. sin(x)");
	
	opcion = sc.nextInt();
	
	switch(opcion){
		
		case 1:
		for(int x=-10;x<=10;x++){
			res1 = x+1;
			System.out.println("("+x+")+1= "+res1);
		}
	     break;
	
	    case 2:
		for(int x=-10;x<=10;x++){
			res2 = 2*x;
			System.out.println("2*("+x+")= "+res2);
		}
	     break;
		 
		 case 3:
		 for(int x=-10;x<=10;x++){
			res3 = Math.sin(x);
			System.out.println("sin("+x+")= "+res3);
		}
	     break;
	}
}
}