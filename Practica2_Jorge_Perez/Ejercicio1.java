/**Ejercicio 1
*Clase que nos da la suma, promedio, producto, el numero mayor y menor de 3 numeros
*@version 1.0
*@author Jorge Ivan Perez Perez 
**/

import java.util.Scanner;

public class Ejercicio1{

public static void main(String [] args){
	
	int n1,n2,n3,suma,promedio,producto,menor,mayor;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingresa el primer numero");
	n1 = sc.nextInt();
	System.out.println("Ingresa el segundo numero");
	n2 = sc.nextInt();
	System.out.println("Ingresa el tercer numero");
	n3 = sc.nextInt();
	
	suma = n1+n2+n3;
	promedio = (n1+n2+n3)/3;
	producto = n1*n2*n3;
	
	if(n1>n2 && n1>n3){
	mayor = n1;
	}else if(n2>n1 && n2>n3){
		mayor = n2;
	}else{
		mayor = n3;
	}
	
	if(n1<n2 && n1<n3){
	menor = n1;
	}else if(n2<n1 && n2<n3){
		menor = n2;
	}else{
		menor = n3;
	}
	
	
	System.out.println("La suma es: "+suma);
	System.out.println("El promedio es: "+promedio);
	System.out.println("El producto es: "+producto);
	System.out.println("El numero mas pequeno es: "+menor);
	System.out.println("El numero mas grande es: "+mayor);
	
}
}