package com.devdnp.hms.security;

import com.devdnp.hms.helper.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@Component
public class JwtAuthenticationFilter
        //extends OncePerRequestFilter
{
    /*
    private static final Logger logger = LoggerFactory.getLogger(JwtAuthenticationFilter.class);
    @Autowired
    private JwtUtil jwtTokenHelper;
    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        logger.debug("Filtering request for JWT header verification");

        try {
            String requestToken = request.getHeader("Authorization");

            if (requestToken!=null  && requestToken.startsWith("Bearer ")) {

                String username = this.jwtTokenHelper.getUsernameFromToken(requestToken.substring(7));

                UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken
                        (userDetails, null, userDetails.getAuthorities());
                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        } catch (Exception ex) {
            logger.error("Could not set user authentication in security context", ex);
        }

        filterChain.doFilter(request, response);
    }


     */

}
