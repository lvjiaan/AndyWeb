package cn.andy.AndyWeb;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class AndyWebRunner implements ApplicationRunner {
    public void run(ApplicationArguments args) {
        System.out.println("server start");
    }
}
