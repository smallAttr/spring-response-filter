package com.github.smallAttr.facade;

import com.github.smallAttr.domain.Address;
import com.github.smallAttr.domain.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Author: chenGang
 * Date: 2018/12/7 11:00 AM
 */
@Component
public class UserFacade {

    private List<User> users = new ArrayList<>();


    @PostConstruct
    public void init() {
        users.add(this.initUser());
    }



    public User login(String email, String password) {
        Optional<User> optionalUser = users.stream().filter(user -> user.getEmail().equals(email) && password.equals(user.getPassword())).findAny();
        if (!optionalUser.isPresent()) {
            throw new IllegalArgumentException("login failed");
        }
        return optionalUser.get();
    }



    private User initUser() {
        User user = new User();
        user.setId(1L);
        user.setEmail("smallAttr@gmail.com");
        user.setUserName("smallAttr");
        user.setPassword("12345");
        user.setAddress(this.initAddress());
        return user;
    }

    private Address initAddress() {
        Address address = new Address();
        address.setId(1L);
        address.setApartmentNumber(22);
        address.setStreet(this.initStreet());
        return address;
    }

    private Address.Street initStreet() {
        Address.Street street = new Address.Street();
        street.setId(1L);
        street.setStreetNumber(33);
        street.setStreetName("streetName");
        return street;
    }
}
