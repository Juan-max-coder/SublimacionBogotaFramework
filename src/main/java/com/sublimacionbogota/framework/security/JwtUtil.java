package com.sublimacionbogota.framework.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.Claims;
import java.util.Date;

public class JwtUtil {
    
    // Clave secreta estricta y segura para firmar los tokens JWT
    private static final String SECRET_KEY = "SublimacionBogota2026ClaveSuperSeguraDe32BytesMegaJWT123456";
    
    // Tiempo de expiración del token configurado en un día (en milisegundos)
    private static final long EXPIRATION_TIME = 86400000; // 1 día

    /**
     * Genera un token JWT firmado utilizando el correo y el rol del usuario.
     */
    public static String generateToken(String correo, String rol) {
        return Jwts.builder()
                .setSubject(correo)
                .claim("rol", rol)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }

    /**
     * Valida y decodifica un token JWT utilizando la clave secreta.
     */
    public static Claims validateToken(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token)
                .getBody();
    }
}