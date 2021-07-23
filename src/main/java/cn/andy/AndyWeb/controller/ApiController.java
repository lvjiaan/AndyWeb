package cn.andy.AndyWeb.controller;

import cn.andy.AndyWeb.entity.FailMessage;
import cn.andy.AndyWeb.entity.ResKnowledgeAgency;
import cn.andy.AndyWeb.service.LvjaService;
import cn.andy.AndyWeb.service.LvjiaanService;
import cn.andy.AndyWeb.service.PostService;
import cn.andy.AndyWeb.service.WebServiceKnowledgeService;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping("/0221")
    public void r0221(){
        try {

            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
            // 设置代理地址
            jaxWsProxyFactoryBean.setAddress("http://www.yliuy.com/webservice/knowledgeProperty?wsdl");
            //设置用户名和密码
            jaxWsProxyFactoryBean.setUsername("baosight");
            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");

            // 设置接口类型
            jaxWsProxyFactoryBean.setServiceClass(WebServiceKnowledgeService.class);
            // 创建一个代理接口实现
            WebServiceKnowledgeService service = (WebServiceKnowledgeService) jaxWsProxyFactoryBean.create();

//            // 调用代理接口的方法调用并返回结果
////            List<ResKnowledgeAgency> list = new ArrayList<>();
////            for (int i =0; i < 10; i++) {
//            ResKnowledgeAgency data = new ResKnowledgeAgency();
//            //     list.add(data);
//
//            data.setAppServiceOrganizationCode("appServiceOrganizationCode");
//            data.setAppType                   ("02");
//            data.setCityCode                  ("cityCode                  ");
//            data.setCname                     ("cname                     ");
//            data.setCountryCode               ("countryCode               ");
//            data.setGradeLevel                (1);
//            data.setPlatCode                  ("platCode                  ");
//            data.setProductContent            ("productContent            ");
//            data.setProductLabel              ("productLabel              ");
//            data.setProductMainImg            ("productMainImg            ");
//            data.setProductPrice              ("productPrice              " );
//            data.setProductStatus             ("");
//            data.setProvinceCode              ("provinceCode              ");
//            data.setSynStatus              ("");
//            //  }
//            FailMessage result = service.knowledgeAgency(data);


            List<ResKnowledgeAgency> list = lvjiaanService.getResKnowledgeAgencyList();
//            KnowledgeAgency resKnowledgeAgency=new KnowledgeAgency();
            for (ResKnowledgeAgency resKnowledgeAgency : list) {
                FailMessage result = service.knowledgeAgency(resKnowledgeAgency);
                System.out.println(result.getFailCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
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
