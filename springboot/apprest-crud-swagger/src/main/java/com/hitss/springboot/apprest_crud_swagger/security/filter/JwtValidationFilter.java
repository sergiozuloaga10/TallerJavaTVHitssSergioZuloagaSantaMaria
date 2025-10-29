package com.hitss.springboot.apprest_crud_swagger.security.filter;

import static com.hitss.springboot.apprest_crud_swagger.security.TokenJwtConfig.HEADER_AUTHORIZATION;
import static com.hitss.springboot.apprest_crud_swagger.security.TokenJwtConfig.PREFIX_TOKEN;
import static com.hitss.springboot.apprest_crud_swagger.security.TokenJwtConfig.SECRET_KEY;

import java.io.IOException;
import java.util.Collection;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.lang.Arrays;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtValidationFilter extends BasicAuthenticationFilter{

    public JwtValidationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
        
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, 
                                    HttpServletResponse response, 
                                    FilterChain chain)
            throws IOException, ServletException {
        
        String header = request.getHeader(HEADER_AUTHORIZATION);
            
        if(header == null || header.startsWith(PREFIX_TOKEN)){
            chain.doFilter(request, response);
            return;
        }

        String token = header.replace(PREFIX_TOKEN, "");

        Claims claims = Jwts.parser().verifyWith(SECRET_KEY)
                            .build().parseSignedClaims(token).getPayload();
        
        String username = claims.getSubject();
        Object authoritiesClaims = claims.get("authorities");

        Collection<? extends GrantedAuthority> authorities = Arrays.asList(
            new ObjectMapper()
                .readValue(authoritiesClaims.toString().getBytes(), SimpleGrantedAuthority[].class)
        ) ;
    }

    

}
