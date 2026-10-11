import javax.swing.JOptionPane;

public class Menu {
    public static String  menuPrincipal(){
        String opcciones=
        "==================== ESTRUCTURA DE DATOS =======================\n"+
        "1)Arreglos\n"+
        "2)Listas\n"+
        "3)Pilas\n"+
        "4)Colas\n"+
        "5)Arboles\n"+
        "0)Salir\n"+
        "Seleccione una opccion:";

        return JOptionPane.showInputDialog(opcciones);
    }

    public static String menuArreglos(){
        String opcciones=
        "==================== ARREGLOS =======================\n"+
        "1)Vectores\n"+
        "2)Matrices\n"+
        "3)Recursividad\n"+
        "0)Regresar\n"+
        "Seleccione una opccion:";

        return JOptionPane.showInputDialog(opcciones);
    }

        public static String  menuVectores(){
        String opcciones=
        "==================== VECTORES =======================\n"+
        "1)Vector Entero (operaciones)\n"+
        "2)Empleados (registro)\n"+
        "0)Regresar\n"+
        "Seleccione una opccion:";

        return JOptionPane.showInputDialog(opcciones);
    }

    public static String  menuMatrices(){
        String opcciones=
        "==================== MATRICES =======================\n"+
        "1)Llenar matriz\n"+
        "2)Reserva de asientos \n"+
        "3)Acumulado de ventas  \n"+
        "4)Matriz identidad \n"+
        "5)Diagonal Principal \n"+
        "6)Transposicion  \n"+
        "7)Rotacion  \n"+
        "0)Regresar\n"+
        "Seleccione una opccion:";

        return JOptionPane.showInputDialog(opcciones);
    }

    //Menu listas 
    public static  String  menuListas(){

        return "";
    }

    //Menu colas 
    public static  String  menuColas(){

        return "";
    }
    //Menu pilas 
    public static  String  menuPilas(){

        return "";
    }

    //Menu arboles 
    public static  String  menuArboles(){

        return "";
    }

    //Menu recursividad
    public static String menuRecursividad(){
        String opcciones=
        "==================== RECURSIVIDAD =======================\n"+
        "1)Suma de 1 a N\n"+
        "2)Factorial de un numero\n"+
        "3)Multiplicacion mediante sumas\n"+
        "4)Potencia mediante multiplicacion\n"+
        "0)Regresar\n"+
        "Seleccione una opccion:";

        return JOptionPane.showInputDialog(opcciones);
    }
}