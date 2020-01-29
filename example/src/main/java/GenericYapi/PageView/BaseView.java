package GenericYapi.PageView;

/**
 * Created by Universal on 1/27/2020.
 */
public abstract class BaseView {

    BasePage basePage;

    public BaseView() {
        System.out.println("Base View'deyim");
    }

    public BasePage getBasePage() {
        return basePage;
    }

    public void setBasePage(BasePage basePage) {
        this.basePage = basePage;
    }
}
