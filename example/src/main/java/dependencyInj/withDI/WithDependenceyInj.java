package dependencyInj.withDI;

/**
 * Created by Universal on 2/24/2018.
 */
public class WithDependenceyInj {

    private IMessageService messageService ;

    public WithDependenceyInj(IMessageService messageService ){

        this.messageService = messageService;
    }

    public void sendText(String msg, String rec) {
        messageService.sendMessage(msg, rec);
    }
}
