# ejercicios con matrices
1. objetivos 
aplicar la logica de arreglos bidimencionales o tambien conocidos como (matrices en java) utilizando el paradigma de 
programacion orientada a objetos o POO, implementando validaciones de dimensiones recorridos de indices y encapsulacion 

## Ejercicio 1 
- sistema de reserva de asientos 
diseña un metodo que se llame `reservaAsientos (int fila, int columna)` debe recibir un entero que sea una fila y una columna que 
controle el mapa de ocupacion de un teatro o sal de cine la matriz iniciara en 0 y ese significa libre.
- si el asiento solicitado contiene 0 cambialo a 1 (*ocupado*) y muestre un mensaje de exito 
- si el asiento ya contiene uno notifica que esta ocupado
- validar que las cordenadas ingresadas no exceda los limites de la matris 

## ejercicio 2
- M-N
- Acumulado de ventas de sucursal y mes (M*N)
- Una empresa registra las ventas enteras de M sucursales en N Meses 
- implementar un metodo que calcule la suma por cada fila (total por sucuersal)
- calcular la suma por cada columna (total por mes)
- genera un reporte formateado que muestre ambos totales en un solo panel de texto 

## ejercicio 3
- diagnostico de matris identidad y diagonal principal N(n*n) 
- implementa un modulo para analicis algebraico: validacion previa comprueba si la matriz es cuadrada, cancela la operacion y muestra un mensaje de advertencia 
- si es cuadrada, evalua si es una *matriz de identidad* unos en la diagonal principal y 0 en el restos 
- calcula y imprime la suma de la diagonal principal 

## ejercicio 4 
- transpocision dinamica de matriz (M*N ==> N*M) 
- Crea un metodo obtenerTranspuesta que invierta la orientacion de los datos 
- la funcion debe retonar una nueva instancia de la clase matriz con dimenciones invertidas N*M
- copia cada elemento siguiendo la regla de transpocision transpuesta [J][I] = original [I][J]

## ejercicio 5
- rotacion de la matris a 90 grados en snetido horario n*n
- simula el giro de una matris cuadrada de pixeles o mapa: validacion previa verifica la matris si es estrictamente cuadrada 
- retornar una nueva instancia de matris rotar a 90 grados a la derecha 