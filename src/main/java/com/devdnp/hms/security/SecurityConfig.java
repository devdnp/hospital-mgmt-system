package com.devdnp.hms.security;



//
// @Configuration
//@EnableWebSecurity
public class SecurityConfig
        //extends WebSecurityConfigurerAdapter
{
/*
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/login", "/signup").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/dashboard") // Redirect to the dashboard after successful login
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // Configure in-memory user details for simplicity
        auth
                .inMemoryAuthentication()
                .passwordEncoder(NoOpPasswordEncoder.getInstance()) // Use NoOpPasswordEncoder for simplicity (Not recommended for production)
                .withUser("user").password("password").roles("USER");
    }*/
}

