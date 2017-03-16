package com.felipe.securitybasic.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * 	Automatically register the springSecurityFilterChain Filter for every URL in your application
	Add a ContextLoaderListener that loads the SecurityConfig.
	
 * @author fgajardo
 *
 */
public class SecurityWebInitializer extends AbstractSecurityWebApplicationInitializer{
    public SecurityWebInitializer() {
        super(WebSecurityConfig.class);
    }
}
