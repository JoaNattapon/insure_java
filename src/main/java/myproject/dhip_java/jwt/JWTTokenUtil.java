// package myproject.dhip_java.jwt;

// import java.util.Date;

// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.stereotype.Component;

// import io.jsonwebtoken.Jwts;
// import io.jsonwebtoken.SignatureAlgorithm;
// import myproject.dhip_java.Entity.AgentRegister;


// @Component
// public class JWTTokenUtil {
    
//     // Jwt expire in 24 hour
//     private static final  long EXPIRE_DURATION = 24 * 60 * 60 * 1000;

//     @Value("${app.jwt.secret}")
//     private String SECRET_KEY;

//     public String generateAccessToken(AgentRegister agentRegister) {
//         return Jwts.builder()
//                 .setSubject(String.format("%s,%s", agentRegister.getId(), agentRegister.getEmail()))
//                 .setIssuer("joalafreak")
//                 .setIssuedAt(new Date())
//                 .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_DURATION))
//                 .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
//                 .compact();
//     }
// }
