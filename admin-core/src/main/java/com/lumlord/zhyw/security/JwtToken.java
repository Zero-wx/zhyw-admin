package com.lumlord.zhyw.security;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Created on 2023/5/10
 *
 * @author huangwx
 * Description:
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
