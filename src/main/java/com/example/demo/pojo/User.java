package com.example.demo.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @Author wangguang
 * @Date 2020/1/22  9:45
 */
@Data
public class User {

    @Id
    private  Integer id;

    private  String username;

    private  String password;
}
