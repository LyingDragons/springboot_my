package com.mj.config;

import com.mj.config.RootConfig;
import com.mj.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 加载SpringMVCDispatcherServlet
 *
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	// 加载根容器
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { RootConfig.class };
	}

	// 加载SpringMVC容器
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { WebConfig.class };
	}

	// SpringMVCDispatcherServlet 拦截的请求 /
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}

}
