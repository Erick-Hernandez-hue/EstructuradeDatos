import javax.swing.JOptionPane;

public class arreglosmenu {

    public static void mostrar(){
        String opcion;
        do {
            opcion=Menu.menuArreglos();
            switch (opcion) {
                case "1":
                    menuVectores();
                    break;

                case "2":
                    menuMatrices();
                    break; 

                case "3":
                    menuRecursividad();
                    break;

                case "0":
                    return ;
                default:
                    JOptionPane.showMessageDialog(null, "opcion no valida");
            }
        } while (true);
    }

    public static  void menuVectores(){
        menuPrincipal.mostrar();
    }

    public static  void menuMatrices(){
        menuMatricial.mostrar();
    }

    public static  void menuRecursividad(){
        menuRecursivo.mostrar();
    }
}