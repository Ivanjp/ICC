Jorge Ivan Perez Perez
314211349

PREGUNTAS:

a)�Qu� imprime en pantalla si ejecutamos el siguiente while?

int i=0; while(i<=5){
System.out.println(�Hola�);

}
�Cu�l crees que sea la explicaci�n para que tenga ese comportamiento?

R= Nos imprime "Hola" indeterminadamente, esto pasa porque el valor de i no cambia por lo tanto nunca va a llegar a tener el valor de 5 y
el ciclo nunca va a acabar.

b)�Qu� diferencia hay en lo que imprimen estos dos for�s?

for(int i=0;i<10;i++){

System.out.println(�Numero: �+i);

}

for(int i=0;i<10;++i){
System.out.println(�Numero: �+i);

}
Explica con tus palabras cual es procedimiento del pos-decremento y el pre- decremento.

R= Los dos imprimen lo mismo, la diferencia es que el primer for el valor de �i� se incrementa s�lamente despu�s de que el valor actual 
de �i� haya sido utilizado en la expresi�n y en el segundo for primero se produce el incremento y despu�s se utiliza el valor incrementado de �i� 
en la expresi�n.

c)�Qu� pasa si en la estructura de control switch no agregamos la palabra break despu�s de cada caso?
Por ejemplo que imprimir�an estos dos switch.
switch(0){

case 0:

System.out.pritnln(�Hola�);

break:

case 1:

System.out.pritnln(�Mundo�); 
break:
}

switch(0){

case 0:

System.out.pritnln(�Hola�);

case 1:

System.out.pritnln(�Mundo�);
}

Explica con tus palabras para qu� sirve la instrucci�n break en un switch

R= Los dos imprimen los mismo. El break sirve para salir del case en el que se encuentra. 

d)�Qu� es un bloque de c�digo?
R= Son el principal mecanismo de encapsulamiento y se forman con un grupo de sentencias 
y de otros bloques de c�digo delimitados por una llave de apertura y una de cierre.