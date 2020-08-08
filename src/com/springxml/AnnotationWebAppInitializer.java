package com.springxml;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AnnotationWebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		 /*AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
	        rootContext.register(RootConfig.class);

	        container.addListener(new ContextLoaderListener(rootContext));*/

	        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
	        dispatcherContext.register(WebConfig.class);

	        ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
	        dispatcher.setLoadOnStartup(1);
	        dispatcher.addMapping("/");
		
	}

}
