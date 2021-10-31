package cn.cqu.edu.sso.dao;

import cn.cqu.edu.sso.domain.User;
import java.util.HashMap;

//虚拟数据库
public class VDataBase {
    HashMap<String, String> userList = new HashMap<String, String>();

    public VDataBase() {
        userList.put("aWei", "123456");
        userList.put("jieGe", "123456");
        userList.put("bingBing", "123456");
    }

    public boolean checkUser(User u) {
        if (userList.containsKey(u.getName()) && u.getPwd().equals(userList.get(u.getName()))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {

    }
}
