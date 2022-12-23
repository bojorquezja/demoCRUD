package com.example.demoCRUD;

import com.example.demoCRUD.ui.LoginView;
import com.vaadin.flow.spring.VaadinApplicationConfiguration;
import com.vaadin.flow.spring.security.VaadinWebSecurityConfigurerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootApplication
public class DemoCrudApplication extends VaadinWebSecurityConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(DemoCrudApplication.class, args);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		super.configure(http);
		setLoginView(http,LoginView.class);

	}

	@Override
	@Bean
	public UserDetailsService userDetailsServiceBean() throws Exception {
		return new InMemoryUserDetailsManager(
				User.withUsername("Alejandro")
						.password("{noop}password")
						.roles("ADMIN")
						.build(),
				User.withUsername("Maria")
						.password("{noop}p")
						.roles("ADMIN")
						.build()
		);
	}
}
