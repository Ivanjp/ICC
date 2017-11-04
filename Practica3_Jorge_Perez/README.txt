Jorge Ivan Perez Perez
314211349

PREGUNTAS:

a)¿Qué imprime en pantalla si ejecutamos el siguiente while?

int i=0; while(i<=5){
System.out.println(“Hola”);

}
¿Cuál crees que sea la explicación para que tenga ese comportamiento?

R= Nos imprime "Hola" indeterminadamente, esto pasa porque el valor de i no cambia por lo tanto nunca va a llegar a tener el valor de 5 y
el ciclo nunca va a acabar.

b)¿Qué diferencia hay en lo que imprimen estos dos for’s?

for(int i=0;i<10;i++){

System.out.println(“Numero: ”+i);

}

for(int i=0;i<10;++i){
System.out.println(“Numero: ”+i);

}
Explica con tus palabras cual es procedimiento del pos-decremento y el pre- decremento.

R= Los dos imprimen lo mismo, la diferencia es que el primer for el valor de ‘i’ se incrementa sólamente después de que el valor actual 
de ‘i’ haya sido utilizado en la expresión y en el segundo for primero se produce el incremento y después se utiliza el valor incrementado de ‘i’ 
en la expresión.

c)¿Qué pasa si en la estructura de control switch no agregamos la palabra break después de cada caso?
Por ejemplo que imprimirían estos dos switch.
switch(0){

case 0:

System.out.pritnln(“Hola”);

break:

case 1:

System.out.pritnln(“Mundo”); 
break:
}

switch(0){

case 0:

System.out.pritnln(“Hola”);

case 1:

System.out.pritnln(“Mundo”);
}

Explica con tus palabras para qué sirve la instrucción break en un switch

R= Los dos imprimen los mismo. El break sirve para salir del case en el que se encuentra. 

d)¿Qué es un bloque de código?
R= Son el principal mecanismo de encapsulamiento y se forman con un grupo de sentencias 
y de otros bloques de código delimitados por una llave de apertura y una de cierre.