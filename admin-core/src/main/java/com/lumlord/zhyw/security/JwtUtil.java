package com.lumlord.zhyw.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.lumlord.zhyw.bean.entity.User;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.UUID;

/**
 * Created on 2023/5/10
 *
 * @author huangwx
 * Description:
 */

public class JwtUtil {

    /**
     * 校验Token 是否正确
     *
     * @param token    秘钥
     * @param username 用户名
     * @param password 用户密码
     * @return 是否正确
     */
    public static boolean verify(String token, String username, String password) {
        JWTVerifier verifier = null;
        try {
            Algorithm algorithm = Algorithm.HMAC256(password);
            verifier = JWT.require(algorithm).withClaim("username", username).build();
            DecodedJWT verify = verifier.verify(token);
        } catch (UnsupportedEncodingException e) {
            return false;
        }
        return true;
    }


    /**
     * 生成Token 签名
     *
     * @param user       用户
     * @param expireTime 过期时间
     * @return 加密的token
     */
    public static String sign(User user, long expireTime) {
        try {


            Date date = new Date(System.currentTimeMillis() + expireTime);
            Algorithm algorithm = Algorithm.HMAC256(user.getPassword());
            // 附带username信息
            return JWT.create()
                    .withClaim("username", user.getUsername())
                    .withClaim("userId", user.getId())
                    .withClaim("uuid", UUID.randomUUID().toString())
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

}