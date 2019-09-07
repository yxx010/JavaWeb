package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements ServletContextAttributeListener {

    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("attributeAdded!name:"+servletContextAttributeEvent.getName()+",value:"+servletContextAttributeEvent.getValue());

    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("attributeRemoved!name:"+servletContextAttributeEvent.getName()+",value:"+servletContextAttributeEvent.getValue());

    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("attributeReplaced!name:"+servletContextAttributeEvent.getName()+",value:"+servletContextAttributeEvent.getValue());

    }
}
