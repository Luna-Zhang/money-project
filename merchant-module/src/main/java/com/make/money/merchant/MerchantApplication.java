package com.make.money.merchant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.make.money")
@MapperScan(basePackages = {"com.make.money.data.mapper"})
public class MerchantApplication {

    public static void main(String[] args) {
        SpringApplication.run(MerchantApplication.class, args);
    }

}
