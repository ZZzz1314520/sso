package cn.cqu.edu.sso.dao;

import cn.cqu.edu.sso.domain.User;
import java.util.ArrayList;
//虚拟数据库
public class VDataBase {
    private static ArrayList<User> userList = new ArrayList<User>()

    public static boolean checkUser(User u){
        return userList.contains(u);
    } 

    public static void main(String[] args)throws Exception
    {

    }
}
