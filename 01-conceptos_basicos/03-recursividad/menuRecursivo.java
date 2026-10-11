import javax.swing.JOptionPane;


public class menuRecursivo {

    public static void main(String[] args) {
        mostrar();
    }

    public static void mostrar() {
        String opcion;

        do {
            opcion = Menu.menuRecursividad();

            if (opcion == null) {
                return;
            }

            switch (opcion) {
                case "1":
                    sumaHastaN();
                    break;

                case "2":
                    factorial();
                    break;

                case "3":
                    multiplicacionMedianteSumas();
                    break;

                case "4":
                    potenciaMedianteMultiplicacion();
                    break;

                case "0":
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }

        } while (true);
    }

    //1) Suma de 1 a N
    private static void sumaHastaN() {
        int n = solicitarEntero("Introduce el valor de N:");

        JOptionPane.showMessageDialog(null,
                "La suma de 1 a " + n + " es: "
                + CalculosRecursivos.sumarHastaN(n));
    }

    //2) Factorial de un numero
    private static void factorial() {
        int n = solicitarEntero("Introduce el numero:");

        JOptionPane.showMessageDialog(null,
                "El factorial de " + n + " es: "
                + CalculosRecursivos.factorial(n));
    }

    //3) Multiplicacion mediante sumas
    private static void multiplicacionMedianteSumas() {
        int a = solicitarEntero("Introduce el primer numero:");
        int b = solicitarEntero("Introduce el segundo numero:");

        JOptionPane.showMessageDialog(null,
                a + " x " + b + " = "
                + CalculosRecursivos.multiplicarPorSumas(a, b));
    }

    //4) Potencia mediante multiplicacion
    private static void potenciaMedianteMultiplicacion() {
        int base = solicitarEntero("Introduce la base:");
        int exponente = solicitarEntero("Introduce el exponente:");

        JOptionPane.showMessageDialog(null,
                base + " ^ " + exponente + " = "
                + CalculosRecursivos.potencia(base, exponente));
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