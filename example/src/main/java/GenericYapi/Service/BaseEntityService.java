package GenericYapi.Service;

import GenericYapi.model.BaseEntity;

/**
 * Created by Nesrin Aşan on 1/23/2020.
 */
public class BaseEntityService<T extends BaseEntity> {

    private Class<T> baseClass;

    public BaseEntityService(Class<T> baseClass) {
        this.baseClass = baseClass;
    }

    public void getClassValue(T baseClass){
        System.out.println(baseClass.toString());
    }
}
