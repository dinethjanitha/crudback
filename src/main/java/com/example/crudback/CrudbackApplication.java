package com.example.crudback;

import org.apache.catalina.mapper.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudbackApplication.class, args);
    }


    @Bean
    public Mapper modelMapper(){
        return new Mapper();
    }


}
