package util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestHash {
    public static void main(String[] args) {
        String rawPassword = "mayis2007"; // tu clave en texto plano
        String encodedPassword = new BCryptPasswordEncoder().encode(rawPassword);
        System.out.println(encodedPassword);
    }
}