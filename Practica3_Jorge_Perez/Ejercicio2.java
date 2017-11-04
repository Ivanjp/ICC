/**Ejercicio 2
*Clase que nos da el numero mas grande de un arreglo
*@version 1.0
*@author Jorge Ivan Perez Perez 
**/

import java.util.Scanner;

public class Ejercicio2{
	
	public static void main(String [] args){
		
		int n,mayor,posicion,lugar;
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("En cuantos numeros quieres encontrar el maximo: ");
		n = sc.nextInt();
		
		int x[] = new int [n];
		
		for(int i=0; i<x.length; i++){
		System.out.print("Dame el "+(i+1)+" numero: ");
		x[i] = sc.nextInt();
		}
		
		mayor=x[0];
		posicion=0;
		
		for(int j=1;j<x.length;j++){
			if(x[j]>mayor){
				
				mayor=x[j];
			
			}
			posicion=j;
		}
		
		lugar = x[posicion]+1;

		System.out.print("El maximo de los valores es: "+mayor+" y fue encontrado en la posicion: "+lugar);
		
		
	}
}