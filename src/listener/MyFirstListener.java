package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.Date;
//包含content session attribute三类监听
@WebListener()
public class MyFirstListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    // Public constructor is required by servlet spec
    public MyFirstListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
        String appName=sce.getServletContext().getInitParameter("app_name");
        String version=sce.getServletContext().getInitParameter("version");
        sce.getServletContext().setAttribute("app_name",appName);
        sce.getServletContext().setAttribute("version",version);
        System.out.println("FirstListener init!appName="+appName+",version="+version);

    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
      String appName=(String) sce.getServletContext().getAttribute("app_name");
      String version=(String) sce.getServletContext().getAttribute("version");
        System.out.println("FirstListener destroyed!appName="+appName+",version="+version);

    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
        String sessionId=se.getSession().getId();
        Date createTime=new Date(se.getSession().getCreationTime());
        System.out.println("session id:"+sessionId+",createTime:"+createTime);
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
        String sessionId=se.getSession().getId();
        System.out.println("destroyed!session id:"+sessionId);
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
      System.out.println("ServletContext,attRemoved!name:"+sbe.getName()+",value:"+sbe.getValue());

    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attibute
         is replaced in a session.
      */
        System.out.println("ServletContext,attReplaced!name:"+sbe.getName()+",value:"+sbe.getValue());

    }
}
