import java.io.File;
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
                System.out.println("ERROR, no ha introducido un valor numérico  --->" + nfe);
            }
    }

    public void IOException() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix una ruta (si no introdueixes una ruta salta la excepció)");
        File f1 = new File(sc.nextLine());
        FileWriter fichero;

        try {
            // Las siguientes dos líneas pueden lanzar una excepción de tipo IOException
            fichero = new FileWriter(f1);
            fichero.write("Hola");
        } catch (IOException ioex) {
            // Aquí capturamos cualquier excepción IOException que se lance
            System.out.println("ERROR, El fitxer o directori no existeix ------>"+ioex);
        }
    }

    public void ArrayIndexOutOfBoundsException(){

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Introdueix una posicio del vector que vulguis veure (si introdueixes una posicio més gran a 6 salta la excepció)");
            int num = sc.nextInt();

            int[] numerosPrimos = {1, 5, 10, 15, 20};
            int undecimoPrimo = numerosPrimos[num];// al intentar entrar a una posicion que no existe
            System.out.println(undecimoPrimo);

        }catch (ArrayIndexOutOfBoundsException AIOBE){
            System.out.println("ERROR, Intentas entrar a una posicion del vector inexsistente -----> "+AIOBE);
        }

    }

    public void ExcepcionesPropias(){

        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Introdueix un numero per multiplicar: ");
            int num = sc.nextInt();
            System.out.println("Introdueix un altre numero per multiplicar: (si introdueixes el \"1\" salta la excepcio) ");
            int num2 = sc.nextInt();


            divide(num,num2);
        } catch(ExcepcionesPropias edu){
                System.out.println(edu.getMessage());
        }
    }

    public void divide(int a, int b) throws ExcepcionesPropias{
        if(b==1){
            throw new ExcepcionesPropias("ERROR, Dividir por uno no esta permitido, ");
        } else {
            System.out.println(a/b);
        }
    }


}
