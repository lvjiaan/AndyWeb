package cn.lalisa.web.controller;

import cn.lalisa.web.service.LvjaService;
import cn.lalisa.web.service.LvjiaanService;

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
    private final PostService postService;
    private final LvjaService lvjaService;

    public ApiController(LvjiaanService lvjiaanService, PostService postService, LvjaService lvjaService) {
        this.lvjiaanService = lvjiaanService;
        this.postService = postService;
        this.lvjaService = lvjaService;
    }


    @RequestMapping("d")
    public String hello(){
        return "damn it";
    }

    @RequestMapping("TEST")
    public void TEST(){
        lvjiaanService.insertTest();
    }

    @RequestMapping("/testPost")
    public void testPost(){

    }

    //战略性新兴产业分类 与 IPC 清洗


    @RequestMapping("/TmtIpc")
    public void TmtIpc(){
//        System.out.println(lvjaService.getAllIpcFromRoot("B22F9/02"));

        lvjaService.TmtIpc();
    }

























}
