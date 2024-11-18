package com.lentra.SecurityApp.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.core.codec.Decoder;
import org.springframework.stereotype.Service;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.Key;
import java.util.*;

@Service
public class JWTService {

    private String secretKey = "HgIQnAx30Htd8Y04QxAgDR5js1T3W2ErUUkYzw72a7c";

    // generating a secret for token creation.
    public JWTService() {
        try {

            KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
            SecretKey sk = keyGen.generateKey( );
            secretKey = Base64.getEncoder( ).encodeToString(sk.getEncoded( ));

        } catch (Exception e) {
            e.printStackTrace( );
        }
    }

    // here all the logic for token creation.
    public String generateToken(String username) {

        Map <String, Object> claims = new HashMap <>( );

        return Jwts.builder( )
                .claims( )
                .add(claims)
                .subject(username)
                .issuedAt(new Date(System.currentTimeMillis( )))
                .expiration(new Date(System.currentTimeMillis( ) + 60 * 60 * 30))
                .and( )
                .signWith(getKey( ))
                .compact( );
    }

    // here we get a string and then encode it to Key.
    private Key getKey() {
        System.out.println("Plain Secret key : " + secretKey);
        byte[] key = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(key);
    }
}
