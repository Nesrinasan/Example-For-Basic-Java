package dependencyInj.withoutDI;

/**
 * Created by Universal on 2/24/2018.
 */

public class EmailService {

    public void sendEmail(String message, String receiver) {

        System.out.println ("Email sent to " + receiver + " with Message=" + message);

    }
}
