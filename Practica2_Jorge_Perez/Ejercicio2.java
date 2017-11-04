/**Ejercicio 2
*Clase que nos imprime 3 diferentes operaciones hasta n
*@version 1.0
*@author Jorge Ivan Perez Perez 
**/

import java.util.Scanner;

public class Ejercicio2{
	
	public static void main(String [] args){
	int n;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Dame un numero");
	n = sc.nextInt();
	
	if(n<=1000){
		System.out.println("Res1  Res2  Res3");
	for(int i=0; i<=n; i++){
		System.out.println("2*"+i+"   4*"+i*i+"   6*"+i*i*i);
	}
	}else{
		System.out.println("Dato incorrecto");
	}
	}
}