import javax.swing.JOptionPane;

public class Matriz {

    private int[][] matriz;

    public Matriz(int filas, int columnas) {
        if (validarDimensiones(filas, columnas)) {
            matriz = new int[filas][columnas];
        } else {
            matriz = new int[2][2];
        }
    }

    public Matriz(int[][] datos) {
        this.matriz = copiarDatos(datos);
    }

    private boolean validarDimensiones(int filas, int columnas) {
        return filas > 0 && columnas > 0;
    }

    public int obtenerFilas() {
        return matriz.length;
    }

    public int obtenerColumnas() {
        return matriz[0].length;
    }

    public int[][] obtenerMatriz() {
        return copiarDatos(matriz);
    }

    private int[][] copiarDatos(int[][] datos) {
        int[][] copia = new int[datos.length][datos[0].length];

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                copia[i][j] = datos[i][j];
            }
        }
        return copia;
    }

    //llenarMatriz
    public void llenarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                boolean valorValido = false;

                do {
                    try {
                        String entrada = JOptionPane.showInputDialog(
                                null,
                                "Introduce el valor entero para la posición ["
                                + i + "][" + j + "]:",
                                "Llenar matriz",
                                JOptionPane.QUESTION_MESSAGE);

                        if (entrada == null) {
                            matriz[i][j] = 0;
                            valorValido = true;
                        } else if (entrada.trim().isEmpty()) {
                            throw new Exception();
                        } else {
                            matriz[i][j] = Integer.parseInt(entrada);
                            valorValido = true;
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,
                                "Debes introducir un número entero válido");
                    }

                } while (!valorValido);
            }
        }
    }

    //Imprimir
    public String imprimir() {
        String resultado = "";

        for (int i = 0; i < matriz.length; i++) {
            resultado += "[";
            for (int j = 0; j < matriz[i].length; j++) {
                resultado += matriz[i][j];

                if (j < matriz[i].length - 1) {
                    resultado += ", ";
                }
            }
            resultado += "]\n";
        }

        return resultado;
    }

    //Ejercicio 1: Sistema de reserva de asientos
    //Retorna 1 = reservado con éxito, 0 = ya estaba ocupado, -1 = coordenadas inválidas
    public int reservarAsiento(int fila, int columna) {

        if (fila < 0 || fila >= matriz.length
                || columna < 0 || columna >= matriz[0].length) {
            return -1;
        }

        if (matriz[fila][columna] == 1) {
            return 0;
        }

        matriz[fila][columna] = 1;
        return 1;
    }

    //Ejercicio 2: Acumulado de ventas por sucursal (filas) y por mes (columnas)
    public int[] sumarPorFila() {
        int[] totales = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            totales[i] = suma;
        }
        return totales;
    }

    public int[] sumarPorColumna() {
        int[] totales = new int[matriz[0].length];

        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }
            totales[j] = suma;
        }
        return totales;
    }

    public String generarReporteVentas() {
        int[] porSucursal = sumarPorFila();
        int[] porMes = sumarPorColumna();

        String resultado = "Total por sucursal:\n";

        for (int i = 0; i < porSucursal.length; i++) {
            resultado += "Sucursal " + (i + 1) + ": " + porSucursal[i] + "\n";
        }

        resultado += "\nTotal por mes:\n";

        for (int j = 0; j < porMes.length; j++) {
            resultado += "Mes " + (j + 1) + ": " + porMes[j] + "\n";
        }

        return resultado;
    }

    //Ejercicio 3: Validación de matriz cuadrada, de identidad y diagonal principal
    public boolean esCuadrada() {
        return matriz.length == matriz[0].length;
    }

    public boolean esIdentidad() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    if (matriz[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (matriz[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public int sumarDiagonalPrincipal() {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    //Ejercicio 4: Transposición dinámica (m*n -> n*m)
    public Matriz obtenerTranspuesta() {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return new Matriz(transpuesta);
    }

    //Ejercicio 5: Rotación 90° en sentido horario (n*n)
    public Matriz rotar90Horario() {
        int n = matriz.length;

        int[][] rotada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotada[j][n - 1 - i] = matriz[i][j];
            }
        }

        return new Matriz(rotada);
    }
}