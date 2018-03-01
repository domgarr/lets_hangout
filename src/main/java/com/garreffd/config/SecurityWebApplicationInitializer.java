package com.garreffd.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/*
 * All that needs to be done here is to inherit from AbstractSecurityWebApplication
 * 
 * 	This configuration creates a ServletFilter called springSecurityFilterChain, whose purpose is
 * protect URLs, validate users, and redirect to the log form.
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
	
}
