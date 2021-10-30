package cn.cqu.edu.sso.domain;
//用户类
public class User {
    private String name;
    private String pwd;

    public User(String name,String pwd){
        this.name = name;
        this.pwd = pwd;
    }
    public String getName(){
        return name;
    }
    public String getPwd(){
        return pwd;
    }
    public void setName(String s) {
        name = s;
    }
    public void setPwd(String s) {
        pwd = s;
    }
}
