# Tipos de Datos abstractos 

la idea central es que no se memorice TDA como una definicion.

La secuencia para entenderlo:

**problema**=>**datos**=>**operaciones**=>**reglas**=>**abstraccion**=>**TDA**=>**Implementacion**
=>**ClaseJava**=>**Estructura de Datoss**

para despues entrar a lo que es una *pila*, *cola* , *lista* y *arboles*

1. problema: 
>Supongamos que tenemos un sistema escolar y queremos manejar estudiantes.

cada estudiante:

- matricula,
- nombre, 
- carrera, 
- promedio 

hasta ahora estamos hablando de **datos**

pero el programa no solamente necesita almacenar esos datos. 
tambien necesita hacer cosas con ellos:

- registrar un cliente 
- consultar sus datos 
- cambiar su promedio 
- verificar si esta aprobado 
- mostrar informacion 

Entonces aparece una idea importante:

En programacion no solamente importa **que datos tenemos**, si no tambien **que operaciones podemos ralizar sobre esos datos**

nota: Este es el primer paso hacia un TDA 

2. Dato simple vs algo mas complejo 

ya conocemos:
```java 
int edad;
double promedio;
String nombre; 
```
Estos tipos de datos ya los conoce Java. 

por ejemplo: 
`int edad = 20;`

- java sabe que tipo de valor puede almacenar 
- cuanto espacio requiere, 
- que operaciones se pueden realizar 

con un int:
```java 
edad + 1 
edad - 1
edad > 18
edad++
++edad
```
pero si pensamos en:

`Estudiante`

Java originalmente no tiene un tipo llamado **Estudiante**

Necesitamos construirlo 

aqui empieza a aparecer la idea de crear **nuestros propios tipos de datos**

3. Que seria un tipo de dato?

se puede definir inicialmente asi:

>Un tipo de dato define que valores pueden existir y que operaciones pueden realizarce con esos valores 

por ejemplo:

*int*
valores posibles:

-10
0
5
100
2500

operaciones: Aritmeticas y Relacionales 

**boolean**
Valores:
```
true 
false 
```
Operaciones: 
