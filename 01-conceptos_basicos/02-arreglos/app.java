import javax.swing.JOptionPane;

public class app {

    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        String opcion;

        do {
            opcion = Menu.menuPrincipal();

            if (opcion == null) {
                return;
            }

            switch (opcion) {
                case "1":
                    arreglosmenu.mostrar();
                    break;

                case "2":
                    JOptionPane.showMessageDialog(null, "Listas: pendiente");
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, "Pilas: pendiente");
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, "Colas: pendiente");
                    break;

                case "5":
                    JOptionPane.showMessageDialog(null, "Arboles: pendiente");
                    break;

                case "0":
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }

        } while (true);
    }
}