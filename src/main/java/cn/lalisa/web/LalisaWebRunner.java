package cn.lalisa.web;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class LalisaWebRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        System.out.println("server start");
    }
}
