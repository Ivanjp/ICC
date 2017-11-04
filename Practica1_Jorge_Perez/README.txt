PEREZ PEREZ JORGE IVAN
314211349

Preguntas 

¿Qué son los errores sintácticos? 
Un error sintáctico en el código de Java es una en la que el lenguaje que se utiliza para crear su código es incorrecto.
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
¿Qué son los errores semánticos?
Se puede ver un error semántico cuando la sintaxis de su código es correcto, pero el uso del código no lo es.

USO DE TIPOS INCOMPATIBLES:Este tipo de error semántico puede ser complicado porque el compilador marcará algunos errores y no otros.
Por ejemplo, si intenta asignar un flotador a una variable int, el compilador mostrará un mensaje de error.

¿Por qué cuando tenemos errores sintácticos no se genera el archivo .class correspondiente pero cuando tenemos errores semánticos sí?

¿Cual es la dirección web de la página oficial del sdk en su versión mas reciente?
http://www.oracle.com/technetwork/java/embedded/javame/javame-sdk/overview/index.html

¿Para qué nos sirve el API de Java?
La API Java es una interfaz de programación de aplicaciones (API, por sus siglas del inglés: Application Programming Interface) 
provista por los creadores del lenguaje de programación Java, que da a los programadores los medios para desarrollar aplicaciones Java.
Como el lenguaje Java es un lenguaje orientado a objetos, la API de Java provee de un conjunto de clases utilitarias para efectuar toda 
clase de tareas necesarias dentro de un programa. La API Java está organizada en paquetes lógicos, donde cada paquete contiene un conjunto 
de clases relacionadas semánticamente.

¿Qué quiere decir que java corra sobre una máquina virtual? 
Que es capaz de interpretar y ejecutar instrucciones expresadas en un código binario especial (el bytecode Java), 
el cual es generado por el compilador del lenguaje Java.

¿Qué ventajas y desventajas tiene? 
Ventajas:
El uso de máquinas virtual implica disponer de menos equipos físicos. Por lo tanto el hecho de virtualizar servidores o sistemas operativos 
puede suponer un ahorro importante en mantenimiento y en consumo energético.

Si hablamos del entorno empresarial, la virtualización de sistemas operativos y de servidores supone un ahorro económico y de espacio considerable. 
Mediante el uso de la virtualización evitamos la inversión en multitud de equipos físicos ahorrando dinero y espacio.

Desventajas:
Las ordenadores virtuales tienen el inconveniente que agregan gran complejidad al sistema en tiempo de ejecución provocando su ralentización.

Cuanta más memoria ocupa una máquina virtual, más recursos consume y por lo tanto el rendimiento del ordenador físico disminuye drásticamente.

¿Hay algún lenguaje que no necesite una máquina virtual?
No.		
