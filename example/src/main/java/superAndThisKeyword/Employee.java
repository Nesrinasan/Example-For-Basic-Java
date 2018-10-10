package superAndThisKeyword;

import java.util.Date;

/**
 * Created by Nesrin ÜLGAY on 2/4/2018.
 */
public class Employee {

    protected double salary;
    protected String name;
    private String birthDate;
    int i = 5;
    static int deger = 10;
//
    public Employee() {
        getProduct();
        carp();
    }

    public Employee(int i) {
        this(); // this kelimesi ile class içeirisndeki diğer constructure'ları kullanabiliriz.
        this.i = i; // this kelimesi ile class içerisindeki değişkenleri kullanabiliriz. Aynı isimdeki global ve yerel değişkenler bu şekilde ayırt edilebilir.
        System.out.println("kalem");
    }

    public static void main(String[] args) {
        Employee employee = new Employee(8);
        System.out.println(employee.i);

    }

    protected String getDetails() {
        return "Name: " + name + "\n"
                + "Salary: " + salary;
    }

    public void getProduct() {
        birthDate = "01.02.2017";
        System.out.println("phone");
    }

    public void carp() {
        int a = 4, b = 5;

        int carp = a * b;

        System.out.println(carp);

    }

    public Employee employee() {

        return this;
    }


}
