package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public class MyServletRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("request listener,listener destroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        HttpServletRequest request=(HttpServletRequest)servletRequestEvent.getServletRequest();
        String path=request.getRequestURI();
        String par=request.getParameter("par");
        System.out.println("request listener init!path："+path+"，par："+par);

    }
}
