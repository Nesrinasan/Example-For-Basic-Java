package dependencyInj.withoutDI;

/**
 * Created by Universal on 2/24/2018.
 */
public class WithoutDependencyInj {

    private EmailService email = new EmailService();
    private SmsService smsService = new SmsService ();

    public void processEmailMessages(String msg, String rec) {
        this.email.sendEmail(msg, rec);
    }

    public void processSmsMessages(String msg, String rec) {
        this.smsService.sendSms (msg, rec);
    }


}
