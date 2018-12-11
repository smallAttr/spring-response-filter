package com.github.smallAttr.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Author: chenGang
 * Date: 2018/12/7 10:39 AM
 */
@Data
public class Address implements Serializable {

    private static final long serialVersionUID = 42L;

    private Long id;

    private Integer apartmentNumber;

    private Street street;





    @Data
    public static class Street implements Serializable {

        private static final long serialVersionUID = 42L;

        private Long id;

        private String streetName;

        private Integer streetNumber;
    }
}




