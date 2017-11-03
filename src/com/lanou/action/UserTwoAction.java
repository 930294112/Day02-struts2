package com.lanou.action;

import com.lanou.domain.User;
import com.lanou.service.UserService;
import com.lanou.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.Arrays;

/**
 * Created by dllo on 17/10/11.
 */
public class UserTwoAction extends ActionSupport implements ModelDriven<User>{
    private User user;//接收页面数据的实体类对象
    //用户业务对象
    private UserService userService = new UserServiceImpl();

//   private String[]hobby;//爱好,接收多个值
//
//    public String[] getHobby() {
//        return hobby;
//    }
//
//    public void setHobby(String[] hobby) {
//        this.hobby = hobby;
//    }

    /**
     * 登录
     **/
    public String login_UI(){
        //调用业务层对象的登录方法 如果能正常返回 则进入登录界面
        if (userService.login(user)!=null){
            return SUCCESS;
        }else {
            return ERROR;
        }

    }

    /**
     * 注册
    **/
    public String register_UI(){
        //将表单的爱好数组转换为实体类中的字符串对象
      //  user.setHobbies(Arrays.toString(hobby));

//        StringBuilder builder = new StringBuilder();
//        for (String hobbies : hobby) {
//            builder.append(hobbies).append(",");
//        }

        if (userService.register(user)!=null){
            return "login";
        }
        return"register";
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public User getModel() {
        user = new User();
        return user;

    }
}
