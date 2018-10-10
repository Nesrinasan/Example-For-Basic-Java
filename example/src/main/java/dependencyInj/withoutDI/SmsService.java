package dependencyInj.withoutDI;

/**
 * Created by Universal on 2/24/2018.
 */
public class SmsService {

    public void sendSms(String message, String receiver) {

        System.out.println ("Sms sent to " + receiver + " with Message=" + message);

    }
}
