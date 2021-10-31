package cn.cqu.edu.sso.service;

import cn.cqu.edu.sso.domain.User;
import cn.cqu.edu.sso.util.JwtUtil;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;
import cn.hutool.core.bean.BeanUtil;
import cn.cqu.edu.sso.dao.VDataBase;
import com.auth0.jwt.interfaces.DecodedJWT;

public class LoginService {

    VDataBase vDataBase;

    public LoginService() {
        this.vDataBase = new VDataBase();
    }

    public JSONObject loginPasswordCheck(User user) {
        JSONObject result = new JSONObject();
        // 确认账号密码
        if (vDataBase.checkUser(user)) {
            Map<String, String> map = new HashMap<String, String>();
            BeanUtil.copyProperties(user, map);
            result.put("token", JwtUtil.getToken(map));
        } else {
            result.put("error", "账号或密码出错");
        }
        return result;
    }

    public String tokenCheck(String token) {
        return JwtUtil.dateToString(JwtUtil.verifier(token).getExpiresAt());
    }
}