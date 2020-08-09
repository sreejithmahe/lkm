/**
 * 
 */
package com.day03.activity03.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author k_sre
 *
 */
//@Configuration
public class RestAPIContentType  extends WebMvcConfigurationSupport{

	@Override
	protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		//configurer.enable();
	}
	@Override
	protected void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		/*
		 * configurer.favorPathExtension(false). favorParameter(true).
		 * parameterName("mime_type"). ignoreAcceptHeader(true).
		 * mediaType("xml",MediaType.APPLICATION_XML).
		 * mediaType("json",MediaType.APPLICATION_JSON).
		 * mediaType("json-utf8",MediaType.APPLICATION_JSON_UTF8).
		 * defaultContentType(MediaType.APPLICATION_XML);
		 */
		
	}
}
