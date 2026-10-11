public class CalculosRecursivos {

    //1) Suma de 1 a N
    public static int sumarHastaN(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumarHastaN(n - 1);
    }

    //2) Factorial de un numero
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //3) Multiplicacion mediante sumas
    public static int multiplicarPorSumas(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b > 0) {
            return a + multiplicarPorSumas(a, b - 1);
        }
        return -multiplicarPorSumas(a, -b);
    }

    //4) Potencia mediante multiplicacion
    public static double potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        if (exponente > 0) {
            return base * potencia(base, exponente - 1);
        }
        return 1.0 / potencia(base, -exponente);
    }
}