PEREZ PEREZ JORGE IVAN
314211349

Preguntas 

�Qu� son los errores sint�cticos? 
Un error sint�ctico en el c�digo de Java es una en la que el lenguaje que se utiliza para crear su c�digo es incorrecto.
import java.util.Scanner;

              public class SuperficieCuadrado {
                  public static void main(String[] ar) {
                      Scanner teclado=new Scanner(System.in);
                      int lado;
                      int superficie;
 error de sintaxis--->system.out.print("Ingrese el valor del lado del cuadrado:");
                      lado=teclado.nextInt();
                      superficie=lado * lado;
                      System.out.print("La superficie del cuadrado es:");
                      System.out.print(superficie);
                }
�Qu� son los errores sem�nticos?
Se puede ver un error sem�ntico cuando la sintaxis de su c�digo es correcto, pero el uso del c�digo no lo es.

USO DE TIPOS INCOMPATIBLES:Este tipo de error sem�ntico puede ser complicado porque el compilador marcar� algunos errores y no otros.
Por ejemplo, si intenta asignar un flotador a una variable int, el compilador mostrar� un mensaje de error.

�Por qu� cuando tenemos errores sint�cticos no se genera el archivo .class correspondiente pero cuando tenemos errores sem�nticos s�?

�Cual es la direcci�n web de la p�gina oficial del sdk en su versi�n mas reciente?
http://www.oracle.com/technetwork/java/embedded/javame/javame-sdk/overview/index.html

�Para qu� nos sirve el API de Java?
La API Java es una interfaz de programaci�n de aplicaciones (API, por sus siglas del ingl�s: Application Programming Interface) 
provista por los creadores del lenguaje de programaci�n Java, que da a los programadores los medios para desarrollar aplicaciones Java.
Como el lenguaje Java es un lenguaje orientado a objetos, la API de Java provee de un conjunto de clases utilitarias para efectuar toda 
clase de tareas necesarias dentro de un programa. La API Java est� organizada en paquetes l�gicos, donde cada paquete contiene un conjunto 
de clases relacionadas sem�nticamente.

�Qu� quiere decir que java corra sobre una m�quina virtual? 
Que es capaz de interpretar y ejecutar instrucciones expresadas en un c�digo binario especial (el bytecode Java), 
el cual es generado por el compilador del lenguaje Java.

�Qu� ventajas y desventajas tiene? 
Ventajas:
El uso de m�quinas virtual implica disponer de menos equipos f�sicos. Por lo tanto el hecho de virtualizar servidores o sistemas operativos 
puede suponer un ahorro importante en mantenimiento y en consumo energ�tico.

Si hablamos del entorno empresarial, la virtualizaci�n de sistemas operativos y de servidores supone un ahorro econ�mico y de espacio considerable. 
Mediante el uso de la virtualizaci�n evitamos la inversi�n en multitud de equipos f�sicos ahorrando dinero y espacio.

Desventajas:
Las ordenadores virtuales tienen el inconveniente que agregan gran complejidad al sistema en tiempo de ejecuci�n provocando su ralentizaci�n.

Cuanta m�s memoria ocupa una m�quina virtual, m�s recursos consume y por lo tanto el rendimiento del ordenador f�sico disminuye dr�sticamente.

�Hay alg�n lenguaje que no necesite una m�quina virtual?
No.		
