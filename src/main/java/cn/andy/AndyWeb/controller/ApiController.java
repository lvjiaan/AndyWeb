package cn.andy.AndyWeb.controller;

import cn.andy.AndyWeb.service.LvjiaanService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describe:
 * @Author：lvja
 * @Date：2021/3/17 11:46
 * @Modifier：
 * @ModefiedDate:
 */
@Component
@RestController
public class ApiController {
    private final LvjiaanService lvjiaanService;

    public ApiController(LvjiaanService lvjiaanService) {
        this.lvjiaanService = lvjiaanService;
    }


    @RequestMapping("d")
    public String hello(){
        return "damn it";
    }

    @RequestMapping("TEST")
    public void TEST(){
        lvjiaanService.insertTest();
    }



}
