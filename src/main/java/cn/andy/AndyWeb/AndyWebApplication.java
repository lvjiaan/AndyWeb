package cn.andy.AndyWeb;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
//@MapperScan(value = {"com.yq.conversion.dao"})
@EnableCaching
public class AndyWebApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //此处的Application.class为带有@SpringBootApplication注解的启动类
        return builder.sources(AndyWebApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(AndyWebApplication.class, args);
    }

}
