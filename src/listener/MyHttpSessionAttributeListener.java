package listener;

import cache.LoginCache;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {
    private static final String LOGIN_USER="loginUser";
    @Override
    public void attributeAdded(HttpSessionBindingEvent hsbe) {
        String attrName=hsbe.getName();
        if(LOGIN_USER.equals(attrName)){
            String attrVal=(String)hsbe.getValue();
            HttpSession session=hsbe.getSession();
            String sessionId=session.getId();
            String sessionId2= LoginCache.getInstance().getSessionIdByUsername(attrVal);
            if(null==sessionId2){

            }else {
                HttpSession session2=LoginCache.getInstance().getSessionIdBySessionId(sessionId2);
                session2.invalidate();
            }
            LoginCache.getInstance().setSesionIdByUsername(attrVal,sessionId);
            LoginCache.getInstance().setSessionBySessionId(sessionId,session);
        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent hsbe) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent hsbe) {

    }
}
