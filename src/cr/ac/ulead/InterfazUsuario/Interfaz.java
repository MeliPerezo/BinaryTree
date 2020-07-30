package cr.ac.ulead.InterfazUsuario;

import cr.ac.ulead.Logica.Help;
import cr.ac.ulead.InformacionUsuario.Info_Persona;
import cr.ac.ulead.Logica.Tree;

public class Interfaz {
    private  int option = 0;
    private Tree T = new Tree();
    private Help H = new Help();


    public void menuPrincipal() {
        switch (H.Menu()) {
            case 1:
               T.insert(new Info_Persona(H.Nombre(), H.Apellido(), H.FechaNacimiento(), H.Cedula()));
               menuPrincipal();
                break;
            case 2:
                T.displayTree();
                menuPrincipal();
                break;
            case 3:
                T.traverse(1);
                menuPrincipal();
                break;
            case 4:
                T.traverse(2);
                menuPrincipal();
                break;
            case 5:
                T.traverse(3);
                menuPrincipal();
                break;
            case 6:
                System.out.println("Has salido");
                break;
            default:
                System.out.println("Tienes que introducir una opción valida");
                menuPrincipal();


        }

    }

}
