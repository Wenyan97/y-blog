package com.yan.yblog.entity;

import lombok.Data;

/**
 * @author wenyan
 */
@Data
public class User {

    /** 用户id*/
    private Integer userId;

    /** 用户姓名*/
    private String userName;

    /** 用户密码*/
    private String password;

    /** 用户昵称*/
    private String nickName;

    /** 用户性别 */
    private String userSex;

    /** 用户手机 */
    private String userPhone;

    /** 用户邮箱 */
    private String userEmail;

    private Byte locked;
}
