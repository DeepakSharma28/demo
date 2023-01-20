//package com.cs.smoothy.filter;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	 //private AuthenticationSuccessHandler authenticationSuccessHandler;
//
////	    @Autowired
////	    public WebSecurityConfig(AuthenticationSuccessHandler authenticationSuccessHandler) {
////	        this.authenticationSuccessHandler = authenticationSuccessHandler;
////	    }
//	    
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
////    	 http
////         .authorizeRequests()
////         .antMatchers( "/css/**", "/images/**", "/favicon.ico").permitAll()
////         .anyRequest().authenticated()
////         .and()
////         .formLogin()
////         .loginPage("/login")
////         .defaultSuccessUrl("/index")
////         .permitAll()
////         .and()
////         .logout()
////         .permitAll()
////         .and().csrf().disable();
//    	
////    	 http.
////         httpBasic()
////         .and()
////         .authorizeRequests()
////         .antMatchers("/index").hasRole("USER")
////         .antMatchers("/details").hasAnyRole("admin_role","student")
////         .and()
////         .formLogin();
//
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//        .inMemoryAuthentication()
//        .withUser("user").password("{noop}pass").roles("USER")
//        .and()
//        .withUser("admin").password("{noop}pass").roles("ADMIN");
//    }
//}