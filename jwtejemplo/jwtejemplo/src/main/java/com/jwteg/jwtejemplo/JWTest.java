/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jwteg.jwtejemplo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import java.util.Base64;

/**
 *
 * @author sosag
 */
public class JWTest {
    
    private static String secret_key="J@!gt*K";
    
    public static void main(String[] args){
    
   String token= JWTUtil.generateToken("Token1", secret_key);
            System.out.println("---------------TOKEN-----------------");
            System.out.println(token);
            System.out.println();
            System.out.println("----------CLAIMS--------------");
        
            Claims claims=Jwts.parser()
                    .setSigningKey(Base64.getEncoder().encode(secret_key.getBytes()))
                    .parseClaimsJws(token)
                    .getBody();
            
            System.out.println("TokenId: "+claims.getId());
            System.out.println("Token Subject: "+claims.getSubject());
            System.out.println("Token Issuer: "+claims.getIssuer());
            System.out.println("Token Issue Date: "+claims.getIssuedAt());
            System.out.println("Token Expiration Date: "+claims.getExpiration());
            System.out.println("Token Audiance: "+claims.getAudience());
            
    
    
    }
    
    
}
