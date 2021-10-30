package cn.cqu.edu.sso.dao;

import cn.cqu.edu.sso.domain.User;
import java.util.ArrayList;
//虚拟数据库
public class VDataBase {
    private ArrayList<User> userList = new ArrayList<User>()
    public VDataBase(){
        User aWei = new User("aWei","123456");
        User jieGe = new User("jieGe","123456");
        User bingBing = new User("bingBing","123456");
        userList.add(aWei);
        userList.add(jieGe);
        userList.add(bingBing);
    }
    public boolean checkUser(User u){
        return userList.contains(u);
    }

    public static void main(String[] args)throws Exception
    {

    }
}
