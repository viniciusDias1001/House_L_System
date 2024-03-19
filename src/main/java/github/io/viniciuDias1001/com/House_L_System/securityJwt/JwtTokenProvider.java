package github.io.viniciuDias1001.com.House_L_System.securityJwt;

import com.auth0.jwt.algorithms.Algorithm;
import github.io.viniciuDias1001.com.House_L_System.vo.TokenVO;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.Date;
import java.util.List;

@Service
public class JwtTokenProvider {

    @Value("${security.jwt.token.secret-key:secret}")
    private String secretKey = "secret";

    @Value("${security.jwt.token.expire-lenght:3600000}")
    private long validityInMilliseconds = 3600000; //1h

    Algorithm algorithm = null;

    @PostConstruct
    protected void init(){
        secretKey = Base64.getEncoder().encodeToString(secretKey.getBytes());
        algorithm = Algorithm.HMAC256(secretKey.getBytes());
    }

    public TokenVO createAcessToken(String username, List<String> roles){
        Date now = new Date();
        Date validity = new Date(now.getTime() + validityInMilliseconds);
        var acessToken = getAccessToken(username, roles, now, validity);
        var refreshToken = getAccessToken(username, roles, now, validity);
        return new TokenVO(username, true, now, validity, accesToken, refreshToken);
    }

    private String getAccessToken(String username, List<String> roles, Date now, Date validity) {
        return null;
    }

    private String getAccessToken(String username, List<String> roles, Date now) {
        return null;
    }
    
}
