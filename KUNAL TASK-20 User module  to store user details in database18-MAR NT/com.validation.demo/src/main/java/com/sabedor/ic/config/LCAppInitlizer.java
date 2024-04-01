package com.sabedor.ic.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppInitlizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class arr[]= {demoAppconfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String arr[] = {"/"};                          //---> when user enters '/' then first login view will get open
				
				return arr;
	}

}