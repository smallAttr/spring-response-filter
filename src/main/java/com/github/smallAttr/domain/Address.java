package com.github.smallAttr.domain;

import lombok.Builder;
import lombok.Data;

/**
 * Author: chenGang
 * Date: 2018/12/7 10:39 AM
 */
@Data
@Builder
public class Address {

    private Long id;

    private Integer apartmentNumber;

    private Street street;





    @Data
    @Builder
    public static class Street {
        private Long id;

        private String streetName;

        private String streetNumber;
    }
}




