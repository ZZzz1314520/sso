package cn.cqu.edu.sso.service;

import cn.cqu.edu.sso.domain.User;
import cn.cqu.edu.sso.dao.VDataBase;

public class LoginService{

    VDataBase vDataBase;

    public LoginService(){
        this.vDataBase = new VDataBase();
    }

    public boolean loginPasswordCheck(User user){
        return vDataBase.checkUser(user);
    }
}