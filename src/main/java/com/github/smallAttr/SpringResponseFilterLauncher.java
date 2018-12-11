package com.github.smallAttr;

import com.jfilter.EnableJsonFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Author: chenGang
 * Date: 2018/12/7 10:56 AM
 */
@SpringBootApplication
@ComponentScan({"com.jfilter.components", "com.github.smallAttr"})
@EnableJsonFilter
public class SpringResponseFilterLauncher {

    public static void main(String[] args) {
        SpringApplication.run(SpringResponseFilterLauncher.class, args);
    }
}
