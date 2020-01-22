package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author wangguang
 * @Date 2020/1/22  9:47
 */

@Repository
public interface UserMapper  {

    @Select("select * from user id=#{id}")
    User findUserById(Integer id);

    @Insert("insert into user (username,password)values(#{username},#{password})")
    Integer insertUser(User user);
}
