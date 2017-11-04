/**Problema 1
*Clase que calcula la cantidad de litros que un humano respira al dia
*@version 1.0
*@author Jorge Ivan Perez Perez 
**/

public class Problema1{

public static void main(String[] args){
	
	int respiracion = 663; 
	
	double respdia = ((663*20)*60)*24; 
	
	double litros = (respdia/1000); 
	
	System.out.println("La cantidad aproximada de litros de aire que introducimos al dia es de " +litros+ " litros"); 
}
}