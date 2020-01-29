package GenericYapi.PageView;

import GenericYapi.model.Student;

/**
 * Created by Nesrin Aşan on 1/24/2020.
 */
public class OgrenciPage extends BasePage<OgrenciView, Student>{

    public OgrenciPage() {
        super(OgrenciView.class, Student.class);
        System.out.println(getEntity().toString());
    }
}
