package com.fun.uncle.myshop.commons.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
* @Description:   
* @Author:         Xian
* @CreateDate:     2020/1/9  10:05
* @Version:        0.0.1-SNAPSHOT
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_user")
public class TbUser implements Serializable {
    /**
     * id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;

    /**
     * 密码，加密存储
     */
    @Column(name = "`password`")
    private String password;

    /**
     * 注册手机号
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 注册邮箱
     */
    @Column(name = "email")
    private String email;

    /**
     * created
     */
    @Column(name = "created")
    private Date created;

    /**
     * updated
     */
    @Column(name = "updated")
    private Date updated;

    private static final long serialVersionUID = 1L;
}