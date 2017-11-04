/**Problema 3
*Clase que calcula el área de un triángulo a partir de la longitud de sus lados
*@version 1.0
*@author Jorge Ivan Perez
**/

public class Problema3{

public static void main(String [] args){
	
	double lado1 = 14;
	
	double lado2 = 8;
	
	double lado3 = 7;
	
	double sp = (lado1+lado2+lado3)/2;
	
	double area = (Math.sqrt(sp*(sp-lado1)*(sp-lado2)*(sp-lado3)));
	
	System.out.println("El area del triangulo es "+area);
}
}