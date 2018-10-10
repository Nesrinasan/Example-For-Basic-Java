package dependencyInj;

import dependencyInj.withDI.EmailService;
import dependencyInj.withDI.IMessageService;
import dependencyInj.withDI.SmsService;
import dependencyInj.withDI.WithDependenceyInj;
import dependencyInj.withoutDI.WithoutDependencyInj;

import java.util.ArrayList;

/**
 * Created by Universal on 2/24/2018.
 */
public class Test {

    public static void main(String[] args) {

        /**
         * Eğer bağımlılıkları en aza indirmezsek, burada mail yerine sms göndermek için
         * WithoutDependencyInj sınıfını yeniden dizayn etmek gerekecektir.
         * Bu durumdan kurtulmak için Interfacelerden yararlanabiliriz.
         */
        WithoutDependencyInj app = new WithoutDependencyInj();
        app.processEmailMessages ("Selam", "nsrn.ulgy@gmail.com");
        app.processSmsMessages (    "Selam", "536685656");

        /**
         * Bağımlılıkları en aza indiren DI yöntemi kullanıldı.
         * DI kullanılarak nesnenin oluşturulduğu asıl yer olan WithDependenceyInj class'ı içerisine hiç dokunulmayacaktır.
         * DI olmadan ise ana class içerisinde sürekli kod ekleme çıkarma vs işlemleri yapılacaktır.
         */

        WithDependenceyInj app1 = new WithDependenceyInj(new EmailService ());
        app1.sendText ("Selam", "nsrn.ulgy@gmail.com");

        WithDependenceyInj app2 = new WithDependenceyInj(new SmsService ());
        app2.sendText ("Selam", "5088768543");


    }
}
