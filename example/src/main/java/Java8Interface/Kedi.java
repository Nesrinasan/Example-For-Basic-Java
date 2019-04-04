package Java8Interface;


/**
 * Created by Nesrin Aşan on 4/4/2019.
 */
public class Kedi implements IHayvan, ICanli {

    /**
     * aynı default metoda sahip iki adet interface'den implement olan Kedi classı hata verecektir.
     * Çünkü iki gövdeli metottan hangisini kullanacağını bilemediği için JVM bu duruma el atmaktadır.
     * ve birini override etmemiz gerektiğiniz söyleyecektir.
     */

    @Override
    public void beslenir() {
        /**
         * Ancak ben ovveride ettiğim bu metot içerisinde yeni bir veri girmek istemiyorum,
         * Hayvan interface'inde hali hazırda yazmış olduğum metot içeriğini kullanmak istiyorum.
         * Bu durumda aşağıdaki gibi çağırarak devam edebilirim.
         */
//        IHayvan.super.beslenir();

        /**
         * Eğer IHayvan içerisindeki metodum default değilde static olsaydı;
         * Javanın değişmeyen static kullanım anlayışı ile aynı olarak class üzerinden bu metotdu çağırabilrim.
         */
        IHayvan.beslenir();

    }
}
