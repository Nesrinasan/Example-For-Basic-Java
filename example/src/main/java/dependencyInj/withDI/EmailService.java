package dependencyInj.withDI;

/**
 * Created by Universal on 2/24/2018.
 */
public class EmailService implements IMessageService {

    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println ("Email sent to " + receiver + " with Message=" + message);
    }
}
