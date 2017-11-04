/**Ejercicio 
*Clase que simula un hiperdado de 50 caras
*@version 1.0
*@author Jorge Ivan Perez Perez 
**/

import java.util.Random;

public class Ejercicio1{
public static void main(String [] args){
		
		Random rnd = new Random();
		int valor, limite = 10000;
		int suma = 0;
		int arreglo[] = new int[50];
		
		
		for(int x = 0; x < limite; x++){
			valor = rnd.nextInt(50)+1;
			arreglo[valor-1]++;
		}
		
		for(int i=0; i<arreglo.length; i++) {
            suma+= arreglo[i];
		}
 
		System.out.println("Cara       Salida");
		for(int x = 0; x < arreglo.length; x++){
		System.out.println((x+1)+"           "+arreglo[x]);		
		}
		System.out.println("La suma de las frecuencias es = "+suma);
 }
 }