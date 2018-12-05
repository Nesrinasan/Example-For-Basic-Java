package dongulerKararYapilari;

/**
 * Created by Universal on 11/26/2018.
 */
public class ifElse {

    public static void main(String[] args) {
        boolean allow = false;
        /**
         * allow = true karşılaştırma yapmaz atama yapar. allow değişkeni başlangıçta false.
         * Ancak id bloğuna girdiğinde artık true olmuştur.
         */
        if(allow = true){
            System.out.println ("izin verildi");
        }else{
            System.out.println ("isin verilmedi");
        }

        /**
         * == ifadesi karşılaştırma yapar.
         *
         */
        if(allow == true){
            System.out.println ("izin verildi");
        }else{
            System.out.println ("isin verilmedi");
        }

    }
}
