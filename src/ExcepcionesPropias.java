/**
 * Created by PC on 16/11/2016.
 */
public class ExcepcionesPropias extends RuntimeException {

    public ExcepcionesPropias(){
            this("No voy a ");
        }

    public ExcepcionesPropias(String str){
            super(str+" dividir por cero.");
    }


}
