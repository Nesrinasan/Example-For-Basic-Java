package exceptionhandling;

/**
 * Created by Universal on 12/7/2019.
 */
public class myException extends Exception{

    String mesaj;
    public myException(String mesaj){
        this.mesaj = mesaj;
    }

    /**
     * ya da
     */
    @Override
    public String getMessage() {
        return mesaj;
    }
}
