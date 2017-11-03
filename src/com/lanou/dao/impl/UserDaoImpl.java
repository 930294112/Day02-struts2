package com.lanou.dao.impl;

import com.lanou.dao.UserDao;
import com.lanou.domain.User;
import com.lanou.util.TxQueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * Created by dllo on 17/10/11.
 */
public class UserDaoImpl implements UserDao {
    private TxQueryRunner tqr = new TxQueryRunner();
    @Override
    public User login(User user) {
        /*定义查询语句*/
        String sql ="select * from tb_user where username=? and password=?";
        /*定义参数数组*/
        Object[]params = {user.getUsername(),user.getPassword()};
        /*调用查询语句*/
        try {
            User u = tqr.query(sql,new BeanHandler<User>(User.class),params);
            return u; //将查询到的用户对象作为方法返回值
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User register(User user) {
        String sql ="insert into tb_user(username,password,gender,hobby) values(?,?,?,?)";
        Object[]params = {user.getUsername(),user.getPassword(),user.getGender(),user.getHobby()};
        try {
            int i = tqr.update(sql,params);
            System.out.println(i);
            if (i>0){
                return user;
            }else {
                return null;
            }
        } catch (SQLException e) {
           throw new RuntimeException(e);
        }

    }
}
