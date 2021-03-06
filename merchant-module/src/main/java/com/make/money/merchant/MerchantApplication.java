package com.make.money.merchant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.make.money")
@MapperScan(basePackages = {"com.make.money.data.mapper"})
public class MerchantApplication {

    public static void main(String[] args) {
        SpringApplication.run(MerchantApplication.class, args);
    }

    /**
     * 这里要创建一下。 不然无法注入
     * @return
     */
    @Bean
    public RestTemplate restTemplate() {

        HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        //10s
        httpRequestFactory.setConnectionRequestTimeout(10000);
        //10s
        httpRequestFactory.setConnectTimeout(10000);
        //60s
        httpRequestFactory.setReadTimeout(60000);

        return new RestTemplate(httpRequestFactory);
    }

}
