/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jwteg.jwtejemplo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author sosag
 */
public class JWTUtil {


    public static String generateToken(String subject,String secret_key){
    
        return Jwts.builder()
                .setId("tk931")
                .setSubject(subject)
                .setIssuer("ABC_LTD")
                .setAudience("XYZ_LTd")
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+TimeUnit.HOURS.toMillis(1)))
                .signWith(SignatureAlgorithm.HS512,Base64.getEncoder().encode(secret_key.getBytes()))
                .compact();
                
    }
    
    public static Claims getClaims(String token,String secret_key){
    return Jwts.parser()
            .setSigningKey(Base64.getEncoder().encode(secret_key.getBytes()))
            .parseClaimsJws(token)
            .getBody();
    
    
    
    }



    
}
