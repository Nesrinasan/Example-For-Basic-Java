package exceptionhandling;

import egitim.Okul;

/**
 * Created by Universal on 12/7/2019.
 */
public class test {

    public static void main(String[] args) {
        int[] diziList = new int[5];
        for (int i = 0; i < 10; i++) {
            if(i==diziList.length){
                try {
                    throw new myException("Dizi boyutu yeterince büyük değil");
                } catch (myException e) {
                    e.printStackTrace();
                    e.getMessage();
                }
            }
            diziList[i] = i;
        }
        System.out.println("Hata");

//        finally {
//            System.out.println("Runtime hatası aldım ama finally bloğuna girdim");
//        }
    }


}
