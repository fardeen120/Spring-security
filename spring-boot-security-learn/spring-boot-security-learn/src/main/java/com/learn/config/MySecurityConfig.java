package com.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.core.userdetails.User;



@Configuration
@EnableWebSecurity
public class MySecurityConfig {
	
	 @Bean
		public UserDetailsService userdetailservice() {
			UserDetails user=User.withUsername("fardeen").password(passwordencoder().encode("Great@1947")).roles("User").build();
			UserDetails admin=User.withUsername("sonu").password(passwordencoder().encode("1234")).roles("Admin").build();
			return new InMemoryUserDetailsManager(user,admin);
			
		}
	 
	 @Bean
	 public PasswordEncoder passwordencoder() {
		return new BCryptPasswordEncoder();
		 
	 }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpsecurity) throws Exception {
       
    	httpsecurity.csrf().disable()
    	.authorizeHttpRequests()
    	.requestMatchers("/user/add")
    	.permitAll()
    	.requestMatchers("/user/update")
    	.permitAll()
    	.requestMatchers("/user/delete/{userid}")
    	.permitAll()
    	.requestMatchers("/user/users")
    	.hasRole("User")
    	.requestMatchers("user/users/{userid}")
    	.hasRole("Admin")
    	.requestMatchers("/user/home")
    	.permitAll()
    	.anyRequest()
    	.authenticated()
    	.and()
    	.formLogin();
    	
    
    return httpsecurity.build();
    

}
    
   
}