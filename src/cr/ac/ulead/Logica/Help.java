package cr.ac.ulead.Logica;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Help {
    private Scanner input = new Scanner(System.in);

    public int Menu() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Elija la opcion que desea realizar: ");
        System.out.println("1.Insertar una persona");
        System.out.println("2. Leer las personas desde un archivo de texto separado por comas");
        System.out.println("3. Imprimir un árbol en IN-ORDER");
        System.out.println("4. Imprimir un árbol en PRE-ORDER");
        System.out.println("5. Imprimir un árbol en POST-ORDER");
        System.out.println("6. Salir");
        System.out.println("-----------------------------------------------------------------------");
        return input.nextInt();
    }

    public String  Nombre() {
        System.out.print("Ingrese su nombre: ");
        input.nextLine();
        return input.nextLine();
    }

    public String  Apellido() {
        System.out.print("Ingrese su apellido: ");
        return input.nextLine();
    }

    public LocalDate  FechaNacimiento() {
        LocalDate L = null;
        try {
            System.out.println("Introduzca su fecha de nacimiento\n  YYYY-MM-dd ");
            L = LocalDate.parse(input.nextLine());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
            formatter.format(L);
        } catch (Exception e) {
            System.out.println("Tiene que ser en el formato: year-month-day");
            FechaNacimiento();
        }
        return L;
    }

    public String  Cedula() {

        System.out.println("Introduzca su numero de cedula :");
        String option = input.nextLine();
        if (option.length() != 9){
            System.out.println("** Ha ocurrido un error, por favor ingrese su cedula con los nueve digitos **");
             Cedula();
        }
        return option;
    }


    public void posicionDerecha(Node newNode, Node parent) {
        if (parent.rightChild == null) {
            parent.rightChild = newNode;
    } else {
            posicionDerecha(newNode, parent.rightChild);
        }
    }

    public void posicionIzquierda(Node newNode, Node parent) {
        if (parent.leftChild == null) {
            parent.leftChild = newNode;

    } else {
            posicionIzquierda(newNode, parent.leftChild);
        }
    }
}



