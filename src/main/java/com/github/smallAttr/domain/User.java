package com.github.smallAttr.domain;

import lombok.Builder;
import lombok.Data;

/**
 * Author: chenGang
 * Date: 2018/12/7 10:37 AM
 */
@Data
@Builder
public class User {

    private Long id;

    private String userName;

    private String email;

    private String password;

    private Address address;
}
