import javax.swing.JOptionPane;


public class menuMatricial {

    private static Matriz matrizAsientos;

    public static void main(String[] args) {
        mostrar();
    }

    public static void mostrar() {
        String opcion;

        do {
            opcion = Menu.menuMatrices();
            switch (opcion) {
                case "1":
                    llenarMatriz();
                    break;
                case "2":
                    reservaDeAsientos();
                    break;

                case "3":
                    acumuladoDeVentas();
                    break;

                case "4":
                    matrizIdentidad();
                    break;

                case "5":
                    diagonalPrincipal();
                    break;

                case "6":
                    transposicion();
                    break;

                case "7":
                    rotacion();
                    break;

                case "0":
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (true);
    }

    //1) Llenar matriz
    private static void llenarMatriz() {
        int filas = solicitarDimension("Introduce el número de filas:");
        int columnas = solicitarDimension("Introduce el número de columnas:");

        Matriz matriz = new Matriz(filas, columnas);
        matriz.llenarMatriz();

        JOptionPane.showMessageDialog(null,
                "Matriz:\n" + matriz.imprimir());
    }

    //2) Ejercicio 1: Sistema de reserva de asientos
    private static void reservaDeAsientos() {

        if (matrizAsientos == null) {
            int filas = solicitarDimension("Número de filas del mapa de asientos:");
            int columnas = solicitarDimension("Número de columnas del mapa de asientos:");
            matrizAsientos = new Matriz(filas, columnas);
        }

        int fila = solicitarEntero("Introduce la fila del asiento:");
        int columna = solicitarEntero("Introduce la columna del asiento:");

        int resultado = matrizAsientos.reservarAsiento(fila, columna);

        switch (resultado) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Asiento reservado con éxito");
                break;
            case 0:
                JOptionPane.showMessageDialog(null,
                        "El asiento ya está ocupado");
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Coordenadas fuera de los límites del mapa");
        }

        JOptionPane.showMessageDialog(null,
                "Mapa de asientos:\n" + matrizAsientos.imprimir());
    }

    //3) Ejercicio 2: Acumulado de ventas por sucursal y por mes
    private static void acumuladoDeVentas() {
        int sucursales = solicitarDimension("Número de sucursales:");
        int meses = solicitarDimension("Número de meses:");

        Matriz ventas = new Matriz(sucursales, meses);
        ventas.llenarMatriz();

        JOptionPane.showMessageDialog(null,
                "Ventas:\n" + ventas.imprimir()
                + "\n" + ventas.generarReporteVentas());
    }

    //4) Ejercicio 3: Validación de matriz de identidad
    private static void matrizIdentidad() {
        int filas = solicitarDimension("Introduce el número de filas:");
        int columnas = solicitarDimension("Introduce el número de columnas:");

        Matriz matriz = new Matriz(filas, columnas);
        matriz.llenarMatriz();

        if (!matriz.esCuadrada()) {
            JOptionPane.showMessageDialog(null,
                    "La matriz debe ser cuadrada para esta operación");
            return;
        }

        String esIdentidad = matriz.esIdentidad() ? "Sí" : "No";

        JOptionPane.showMessageDialog(null,
                "Matriz:\n" + matriz.imprimir()
                + "\n¿Es matriz de identidad? " + esIdentidad);
    }

    //5) Ejercicio 3: Suma de la diagonal principal
    private static void diagonalPrincipal() {
        int filas = solicitarDimension("Introduce el número de filas:");
        int columnas = solicitarDimension("Introduce el número de columnas:");

        Matriz matriz = new Matriz(filas, columnas);
        matriz.llenarMatriz();

        if (!matriz.esCuadrada()) {
            JOptionPane.showMessageDialog(null,
                    "La matriz debe ser cuadrada para esta operación");
            return;
        }

        JOptionPane.showMessageDialog(null,
                "Matriz:\n" + matriz.imprimir()
                + "\nSuma de la diagonal principal: "
                + matriz.sumarDiagonalPrincipal());
    }

    //6) Ejercicio 4: Transposición dinámica
    private static void transposicion() {
        int filas = solicitarDimension("Introduce el número de filas:");
        int columnas = solicitarDimension("Introduce el número de columnas:");

        Matriz matriz = new Matriz(filas, columnas);
        matriz.llenarMatriz();

        Matriz transpuesta = matriz.obtenerTranspuesta();

        JOptionPane.showMessageDialog(null,
                "Matriz original:\n" + matriz.imprimir()
                + "\nMatriz transpuesta:\n" + transpuesta.imprimir());
    }

    //7) Ejercicio 5: Rotación 90° en sentido horario
    private static void rotacion() {
        int filas = solicitarDimension("Introduce el número de filas:");
        int columnas = solicitarDimension("Introduce el número de columnas:");

        Matriz matriz = new Matriz(filas, columnas);
        matriz.llenarMatriz();

        if (!matriz.esCuadrada()) {
            JOptionPane.showMessageDialog(null,
                    "La matriz debe ser cuadrada para esta operación");
            return;
        }

        Matriz rotada = matriz.rotar90Horario();

        JOptionPane.showMessageDialog(null,
                "Matriz original:\n" + matriz.imprimir()
                + "\nMatriz rotada 90°:\n" + rotada.imprimir());
    }

    private static int solicitarDimension(String mensaje) {

        int valor;

        do {
            valor = solicitarEntero(mensaje);

            if (valor <= 0) {
                JOptionPane.showMessageDialog(null,
                        "El valor debe ser mayor a 0");
            }

        } while (valor <= 0);

        return valor;
    }

    private static int solicitarEntero(String mensaje) {

        do {
            try {

                String entrada = JOptionPane.showInputDialog(
                        null, mensaje, "Dato", JOptionPane.QUESTION_MESSAGE);

                if (entrada == null) {
                    return 0;
                }

                if (entrada.trim().isEmpty()) {
                    throw new Exception();
                }

                return Integer.parseInt(entrada);

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null,
                        "Debes introducir un número entero válido");
            }

        } while (true);
    }
}