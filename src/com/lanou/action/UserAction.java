package com.lanou.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by dllo on 17/10/11.
 */
public class UserAction extends ActionSupport{
    private String username;  //用户名必须与表单中的name属性同名
    private String password;  //密码必须与表单中的name属性同名
    private String password1; //确认密码必须与表单中的name属性同



    /**
     * 登录
     **/
    public String login(){
        if (username.equals("666")){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }
    /**
     * 注册
     **/


    public String register(){
        System.out.println(username + " " + password + " " + password1);
        if (!username.equals("666")){
            return SUCCESS;
        }else {
            return ERROR;
        }

    }


    /**
     * 属性赋值要求改属性必须提供get/set方法
     **/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }
}
