import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by x3727349s on 10/11/16.
 */
public class Excepciones {


    /**Nos muestra un error al introducir un valor no numerico a una variable integer
     * @valorintro le pasamos el valor introducido por teclado
     * @numero le pasamos el @valorintro cuando el valor no es numérico salta al catch y nos muestra el error
     */
    public void NumberFormatException(){

            try {
                Scanner sc = new Scanner(System.in);

                System.out.println("Introduce un valor numérico: (si introduces un valor no numérico salta la excepcion)");
                String valorintro = sc.nextLine();
                int numero = Integer.parseInt(valorintro);
                System.out.println(numero);

            } catch (NumberFormatException nfe) {
                //nfe.printStackTrace();
                System.out.println("ERROR, no ha introducido un valor numérico" + nfe);
            }
    }


    public void IOException() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix una ruta (si introdueixes una ruta que no existeix salta la excepció)");
        File f1 = new File(sc.nextLine());
        FileWriter fichero;

        try {
            // Las siguientes dos líneas pueden lanzar una excepción de tipo IOException
            fichero = new FileWriter(f1);
            fichero.write("Hola");
        } catch (IOException ioex) {
            // Aquí capturamos cualquier excepción IOException que se lance
            System.out.println("ERROR, El fitxer o directori no existeix"+ioex);
        }
    }


    public void UncheckedException(){

        try {

            int[] numerosPrimos = {1, 5, 10, 15, 20};
            int undecimoPrimo = numerosPrimos[8];// al intentar entrar a una posicion que no existe
            System.out.println(undecimoPrimo);

        }catch (ArrayIndexOutOfBoundsException AIOBE){
            System.out.println("ERROR, Intentas entrar a una posicion inexsistente"+AIOBE);
        }

    }

}
