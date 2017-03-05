package cn.json.quicknCore.dispatcher;

import cn.json.quicknCore.common.Setting;
import org.mortbay.jetty.Request;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {

	private String characterEncoding;
	private String jettyGetEncoding;

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding(Setting.DEFAULT_CHARSET);
		if (request instanceof Request) {
			Request req = (Request) request;
			req.setQueryEncoding(jettyGetEncoding);
		}
		chain.doFilter(request, response);		
	}

	public void init(FilterConfig config) throws ServletException {
		characterEncoding = config.getInitParameter("CharacterEncoding");
		if(characterEncoding==null)
			characterEncoding = "utf-8";	
		jettyGetEncoding = System.getProperty("JettyUriEncoding");
		if(jettyGetEncoding==null)
			jettyGetEncoding = "GBK";
	}

}
