package com.schoolsync.schoolsynchback.infra.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.auth0.jwt.algorithms.Algorithm;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {
    // Pega do properties o valor da chave
    @Value("${api.security.token.secret}")
    private String secret;
    public String generateToken(User user){
        try{
            // Algoritmo de cripografia
            Algorithm algorithm = Algorithm.HMAC256(this.secret);
            return JWT.create()
                    .withIssuer("login-auth-api")
                    .withSubject(user.getEmail())
                    .withExpiresAt(this.generateExpirationDate())
                    .sign(algorithm);
        } catch(JWTCreationException jwtCreationException){
            throw new JWTCreationException(jwtCreationException.getMessage(), jwtCreationException);
        }
    }

    public String validateToken(String token){
        System.out.println(token);
        try{
            Algorithm algorithm = Algorithm.HMAC256(this.secret);
            return JWT.require(algorithm)
                    .withIssuer("login-auth-api")
                    .build()
                    .verify(token)
                    .getSubject();
        } catch(JWTVerificationException jwtVerificationException){
            return null;
        }
    }

    public Instant generateExpirationDate(){
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-3H"));
    }
}

