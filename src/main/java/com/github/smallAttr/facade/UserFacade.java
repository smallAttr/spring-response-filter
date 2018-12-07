package com.github.smallAttr.facade;

import com.github.smallAttr.domain.Address;
import com.github.smallAttr.domain.User;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Optional;

/**
 * Author: chenGang
 * Date: 2018/12/7 11:00 AM
 */
@Component
public class UserFacade {

    private List<User> users;


    @PostConstruct
    public void init() {
        users.add(this.initUser());
    }



    public User login(String email, String password) {
        Optional<User> optionalUser = users.stream().filter(user -> user.getEmail().equals(email) && this.secretPassword(password).equals(user.getPassword())).findAny();
        if (!optionalUser.isPresent()) {
            throw new IllegalArgumentException("login failed");
        }
        return optionalUser.get();
    }



    private User initUser() {
        return User.builder()
                .id(1L)
                .email("smallAttr@gmail.com")
                .userName("smallAttr")
                .password(secretPassword("12345"))
                .address(this.initAddress())
                .build();
    }

    private Address initAddress() {
        return Address.builder()
                .id(1L)
                .apartmentNumber(22)
                .street(this.initStreet())
                .build();
    }

    private Address.Street initStreet() {
        return Address.Street.builder()
                .id(1L)
                .streetName("33")
                .streetName("streetName")
                .build();
    }

    private String secretPassword(String password) {
        return MD5Encoder.encode(password.getBytes(Charset.forName("UTF-8")));
    }
}
