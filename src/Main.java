import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by x3727349s on 10/11/16.
 */
public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        Excepciones ex = new Excepciones();

        do {
            System.out.println("Seleccione la excepcion que quieras ver:");
            System.out.println("---------------------------------------------");
            System.out.println("1.Excepcion NumberFormatException");
            System.out.println("2.Excepcion IOException");
            System.out.println("3.Excepcion UncheckedException");


            System.out.println("");

            opcion = sc.nextInt();

        // menú principal
            switch (opcion) {
                case 1:
                    ex.NumberFormatException();
                    System.out.println("");
                    break;
                case 2:
                    ex.IOException();
                    System.out.println("");
                    break;
                case 3:
                    ex.UncheckedException();
                    System.out.println("");
                    break;
                default:
                    System.out.println("ERROR, opción invalida");
                    break;
            }
            System.out.println("");
            System.out.println("");
        } while (opcion != 4 && opcion<4);

        System.out.println("\nCerrando el sistema..");



    }
}









