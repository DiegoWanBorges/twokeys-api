package com.twokeys.twokeysapi.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import com.twokeys.twokeysapi.config.multitenant.TenantContext;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class TenantFilter extends GenericFilterBean{
	 
	@Override
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
	    HttpServletRequest httpRequest = (HttpServletRequest) request;
	    TenantContext.setCurrentTenant(httpRequest.getHeader("schema"));
	    chain.doFilter(req, res);
	}

}
