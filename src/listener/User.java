package listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener {
    private String userName;
    private String passWord;
    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name=httpSessionBindingEvent.getName();
        System.out.println("valueBound,name:"+name);
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name=httpSessionBindingEvent.getName();
        System.out.println("valueUnbound,name:"+name);
    }

}
