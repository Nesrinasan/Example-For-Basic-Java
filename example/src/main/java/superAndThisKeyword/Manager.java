package superAndThisKeyword;

/**
 * Created by Nesrin ÜLGAY on 2/4/2018.
 */
public class Manager extends Employee {

    protected static String department;

    public Manager() {
        super();  //miras alındığı sınıfın constructure'ını çağırır.
        department = getDetails();
        department = super.getDetails();
        System.out.println(super.name);

        /**
         * this kelimesi bulunduğu  sınıfı return eden bir metot olabilr.
         * this kelimesi, o anda üzerinde işlem yapılan nesnenin referansını döndürür
         */
        employee();

    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println(manager.department);
        manager.dongu();

    }

    @Override
    protected String getDetails() {
        return super.getDetails();  // üst sınıfın metodunu çağırır.
    }


    public void dongu() {

        int k = 4;

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                return;
            }
            k++;
        }

    }
}