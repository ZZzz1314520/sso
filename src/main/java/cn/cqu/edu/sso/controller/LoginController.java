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

@RestController
public class LoginController {
    @RequestMapping(value="/user/login",method = RequestMethod.POST)
    public boolean test(@RequestParam(value = "admin") String admin, 
    @RequestParam(value = "password") String password)
    {
    	
    	if(admin.equals("A") && password.equals("B")) {
    		return true;
    	}
        return false;
    }
}
