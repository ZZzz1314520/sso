package cn.cqu.edu.sso.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import cn.cqu.edu.sso.domain.User;

@RestController
public class LoginController {
    @GetMapping(value="/user/test")
    public String test()
    {
        return "test4";
    }
    @RequestMapping(value="/user/login")
    public String login(User user)
    {
        //检测用户是否已经登录
        return "待添加";
    }
}
