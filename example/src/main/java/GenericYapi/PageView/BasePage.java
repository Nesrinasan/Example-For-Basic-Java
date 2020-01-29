package GenericYapi.PageView;

import GenericYapi.model.BaseEntity;

/**
 * Created by Universal on 1/24/2020.
 */
public abstract class BasePage<T extends BaseView, U extends BaseEntity> {

    Class<T> viewClazz;
    Class<U> entity;
    T view;

    public BasePage(Class<T> viewClazz, Class<U> entity) {
        this.viewClazz = viewClazz;
        this.entity = entity;
        try {
            T view = this.viewClazz.newInstance();
            view.setBasePage(this);
            setView(view);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public Class<T> getViewClazz() {
        return viewClazz;
    }

    public void setViewClazz(Class<T> viewClazz) {
        this.viewClazz = viewClazz;
    }

    public Class<U> getEntity() {
        return entity;
    }

    public void setEntity(Class<U> entity) {
        this.entity = entity;
    }

    public T getView() {
        return view;
    }

    public void setView(T view) {
        this.view = view;
    }
}
