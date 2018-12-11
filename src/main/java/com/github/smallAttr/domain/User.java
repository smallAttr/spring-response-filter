package com.github.smallAttr.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Author: chenGang
 * Date: 2018/12/7 10:37 AM
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 42L;

    private Long id;

    private String userName;

    private String email;

    private String password;

    private Address address;
}
