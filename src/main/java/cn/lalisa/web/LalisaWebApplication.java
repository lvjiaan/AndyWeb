package cn.lalisa.web;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan(value = {"cn.andy.AndyWeb.dao"})
@EnableCaching
public class LalisaWebApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //此处的Application.class为带有@SpringBootApplication注解的启动类
        return builder.sources(LalisaWebApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(LalisaWebApplication.class, args);
    }

}
