package github.io.viniciuDias1001.com.House_L_System.vo;

import java.io.Serializable;
import java.util.Date;

public class TokenVO implements Serializable {

    private static final long serialVersionUID = 1l;

    private String username;
    private Boolean  authenticated;
    private Date created;
    private Date expiration;
    private String acessToken;
    private String refreshToken;

    private TokenVO() {}

    public TokenVO(String username,
                   Boolean authenticated,
                   Date created,
                   Date expiration,
                   String acessToken,
                   String refreshToken) {

        this.username = username;
        this.authenticated = authenticated;
        this.created = created;
        this.expiration = expiration;
        this.acessToken = acessToken;
        this.refreshToken = refreshToken;
    }
}
