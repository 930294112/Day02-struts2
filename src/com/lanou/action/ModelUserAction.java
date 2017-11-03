package com.lanou.action;

import com.lanou.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;



/**
 * Created by dllo on 17/10/11.
 */
public class ModelUserAction extends ActionSupport implements ModelDriven<User>{

    private User user; //承接表单提供的数据

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private String[]hobby;//爱好,接收多个值
    //private List<String> hobby;
    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String login(){
        /*从实体类的属性判断是否登录成功*/
        if (user.getUsername().equals("666")){
            return SUCCESS;
        }else {
            return ERROR;
        }

    }

    public String register(){
        System.out.println(hobby);

        if (!user.getUsername().equals("666")){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }

    @Override
    /*
    创建一个空对象,并传递给模型驱动接口对其进行赋值
     */
    public User getModel() {
        user = new User();
        return user;
    }
}
