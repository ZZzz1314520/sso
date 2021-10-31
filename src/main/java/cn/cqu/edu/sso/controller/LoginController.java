package cn.cqu.edu.sso.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import cn.cqu.edu.sso.domain.User;
import com.alibaba.fastjson.JSONObject;
import cn.cqu.edu.sso.service.LoginService;
import com.auth0.jwt.interfaces.DecodedJWT;

@RestController
public class LoginController {
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public JSONObject login(@RequestParam(value = "admin", required = true) String admin,
            @RequestParam(value = "password", required = true) String password) {
        User user = new User(admin, password);
        LoginService loginService = new LoginService();
        return loginService.loginPasswordCheck(user);
    }

    @RequestMapping(value = "/user/test", method = RequestMethod.POST)
    public boolean test(String token, String name, String pwd) {
        LoginService loginService = new LoginService();
        return loginService.tokenCheck(token, name, pwd);
    }
}
