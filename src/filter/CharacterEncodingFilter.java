package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "CharacterEncodingFilter")
public class CharacterEncodingFilter implements Filter {
    private FilterConfig config;

    public FilterConfig getConfig() {
        return config;
    }

    public void setConfig(FilterConfig config) {
        this.config = config;
    }

    public void destroy() {
        System.out.println("characterEncodingFilter destroy2");

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding(config.getInitParameter("charset"));
        chain.doFilter(req, resp);

        String systemName=config.getInitParameter("systemName");
        String version=config.getInitParameter("version");
        System.out.println("systemName:"+systemName);
        System.out.println("version:"+version);
        System.out.println("characterEncodingFilter doFilter");
    }

    public void init(FilterConfig config) throws ServletException {
        this.config=config;
        System.out.println("characterEncodingFilter init");
    }

}
