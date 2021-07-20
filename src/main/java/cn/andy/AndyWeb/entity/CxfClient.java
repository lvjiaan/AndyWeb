//package cn.andy.AndyWeb.entity;
//
//
//import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
//import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
//
//import org.springframework.web.bind.annotation.*;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/v1")
//public class CxfClient {
//
//    private static final String LocalWebServiceUrl01 = "http://www.yliuy.com/webservice/knowledgeProperty?wsdl";
//
////    private static final String webServiceUrl = "http://119.3.210.47/csjsite-admin/webservice/knowledgeProperty?wsdl";
////
////    private static final String webServiceUrl1 = "http://119.3.210.47/csjsite-admin/webservice/publicFund?wsdl";
////
////    private static final String webServiceUrl2 = "http://119.3.210.47/csjsite-admin/webservice/technologyMove?wsdl";
//
//    private static final String LocalWebServiceUrl00 = "http://119.3.210.47/csjsite-admin/webservice/publicFund?wsdl";
//
//    private static final String LocalWebServiceUrl02 = "http://119.3.210.47/csjsite-admin/webservice/technologyMove?wsdl";
//
//    private static final String LocalWebServiceUrl03 = "http://119.3.210.47/csjsite-admin/webservice/techFinance?wsdl";
//
//    private static final String LocalWebServiceUrl04 = "http://www.yliuy.com/webservice/knowledgeAccount?wsdl";
//
//
//
//   /* @RequestMapping("/0211")
//    public void r0211(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl00);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServicePublicFundService.class);
//            // 创建一个代理接口实现
//            WebServicePublicFundService webServicePublicFundService = (WebServicePublicFundService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<BaseInfoParam> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                BaseInfoParam data = new BaseInfoParam();
//                list.add(data);
//                data.setAcceptanceDate("Acceptancedate  	 " + i);
//                data.setApprovalDepartment ("Approvaldepartment" + i);
//                data.setAreaSize           ("Areasize          " + i);
//                data.setCategoryCode       (""+i);
//                data.setCityCode           ("Citycode          " + i);
//                data.setCname              ("Cname             " + i);
//                data.setCountryCode        ("Countrycode       " + i);
//                data.setEname              ("Ename             " + i);
//                data.setPlatCode           ("Platcode          " + i);
//                data.setProductContent     ("Productcontent    " + i);
//                data.setProductLabel       ("Productlabel      " + i);
//                data.setProductMainImg     ("Productmainimg    " + i);
//                data.setProductStatus      ("Productstatus     " + i);
//                data.setProductVideo       ("Productvideo      " + i);
//                data.setPromise            ("Promise           " + i);
//                data.setProvinceCode       ("Provincecode      " + i);
//                data.setResBaseCode        ("Resbasecode       " + i);
//                data.setResearchDirection  ("Researchdirection " + i);
//                data.setStartBuildingDate  ("Startbuildingdate " + i);
//                data.setSubordinateCompany ("Subordinatecompany" + i);
//                data.setSynStatus          ("0");
//            }
//            FailMessage result = webServicePublicFundService.resBaseInfo(list);
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @RequestMapping("/0212")
//    public void r0212(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl00);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServicePublicFundService.class);
//            // 创建一个代理接口实现
//            WebServicePublicFundService webServicePublicFundService = (WebServicePublicFundService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<ResInstrument> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                ResInstrument data = new ResInstrument();
//                list.add(data);
//
//                data.setAcquisitionDate(				"acquisitionDate        " + i);
//                data.setAnnExternalServiceHours(Long.valueOf(100));
//                data.setAnnTotalOperatingHours(Long.valueOf(100));
//                data.setAppArea(                "appArea                " + i);
//                data.setCityCode(               "cityCode               " + i);
//                data.setCname(                  "cname                  " + i);
//                data.setCountryCode(            "countryCode            " + i);
//                data.setEname(                  "ename                  " + i);
//                data.setInsCategory(            "insCategory            " + i);
//                data.setMainSpecifications(     "mainSpecifications     " + i);
//                data.setPlaAnAddress(           "plaAnAddress           " + i);
//                data.setPlatCode(               "platCode               " + i);
//                data.setProCountry(             "proCountry             " + i);
//                data.setProductContent(         "productContent         " + i);
//                data.setProductLabel(           "productLabel           " + i);
//                data.setProductMainImg(         "productMainImg         " + i);
//                data.setProductPrice(new BigDecimal(100));
//                data.setProductPriceUnit(       "productPriceUnit       " + i);
//                data.setProvinceCode(           "provinceCode           " + i);
//                data.setResBaseCode(            "resBaseCode            " + i);
//                data.setResFeatures(            "resFeatures            " + i);
//                data.setResManufacturer(        "resManufacturer        " + i);
//                data.setResModel(               "resModel               " + i);
//                data.setResUse(                 "resUse                 " + i);
//                data.setSerContent(             "serContent             " + i);
//                data.setSynStatus          ("0");
//                data.setTypServiceResults(      "typServiceResults      " + i);
//
//            }
//            FailMessage result = webServicePublicFundService.instrument(list);
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @RequestMapping("/0213")
//    public void r0213(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl00);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServicePublicFundService.class);
//            // 创建一个代理接口实现
//            WebServicePublicFundService webServicePublicFundService = (WebServicePublicFundService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<ResTechTalent> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                ResTechTalent data = new ResTechTalent();
//                list.add(data);
//
//                data.setCityCode(						"CityCode    				" + i);
//                data.setCname(              "Cname              " + i);
//                data.setCountryCode(        "CountryCode        " + i);
//                data.setPlatCode(           "PlatCode           " + i);
//                data.setProductContent(     "ProductContent     " + i);
//                data.setProductLabel(       "ProductLabel       " + i);
//                data.setProductMainImg(     "ProductMainImg     " + i);
//                data.setProvinceCode(       "ProvinceCode       " + i);
//                data.setSubordinateCompany( "SubordinateCompany " + i);
//                data.setSynStatus          ("0");
//                data.setTechTalentCode(     "TechTalentCode     " + i);
//
//            }
//            FailMessage result = webServicePublicFundService.techTalent(list);
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @RequestMapping("/0214")
//    public void r0214(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl00);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServicePublicFundService.class);
//            // 创建一个代理接口实现
//            WebServicePublicFundService webServicePublicFundService = (WebServicePublicFundService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<ResInstitute> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                ResInstitute data = new ResInstitute();
//                list.add(data);
//
//                data.setCityCode(   	"cityCode 				" + i);
//                data.setCname(            "cname            " + i);
//                data.setCountryCode(      "countryCode      " + i);
//                data.setPlatCode(         "platCode         " + i);
//                data.setProductMainImg(   "productMainImg   " + i);
//                data.setProvinceCode(     "provinceCode     " + i);
//                data.setResInstituteCode( "resInstituteCode " + i);
//                data.setResearchDirection("researchDirection" + i);
//                data.setSynStatus          ("0");
//
//            }
//            FailMessage result = webServicePublicFundService.institute(list);
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//    @RequestMapping("/02310")
//    public void r02310(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl02);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServiceTechnologyMoveService.class);
//            // 创建一个代理接口实现
//            WebServiceTechnologyMoveService service = (WebServiceTechnologyMoveService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<BaseInfoParam> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                BaseInfoParam data = new BaseInfoParam();
//                list.add(data);
//
//                data.setAcceptanceDate("Acceptancedate  	 " + i);
//                data.setApprovalDepartment ("Approvaldepartment" + i);
//                data.setAreaSize           ("Areasize          " + i);
////                data.setCategoryCode       (""+i);
//                data.setCityCode           ("Citycode          " + i);
//                data.setCname              ("Cname             " + i);
//                data.setCountryCode        ("Countrycode       " + i);
//                data.setEname              ("Ename             " + i);
//                data.setPlatCode           ("Platcode          " + i);
//                data.setProductContent     ("Productcontent    " + i);
//                data.setProductLabel       ("Productlabel      " + i);
//                data.setProductMainImg     ("Productmainimg    " + i);
//                data.setProductStatus      ("Productstatus     " + i);
//                data.setProductVideo       ("Productvideo      " + i);
//                data.setPromise            ("Promise           " + i);
//                data.setProvinceCode       ("Provincecode      " + i);
//                data.setResBaseCode        ("Resbasecode       " + i);
//                data.setResearchDirection  ("Researchdirection " + i);
//                data.setStartBuildingDate  ("Startbuildingdate " + i);
//                data.setSubordinateCompany ("Subordinatecompany" + i);
//                data.setSynStatus          ("0");
//            }
//            FailMessage result = service.technologyBaseInfo(list);
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//*/
//
//    @RequestMapping("/0221")
//    public void r0221(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl01);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServiceKnowledgeService.class);
//            // 创建一个代理接口实现
//            WebServiceKnowledgeService service = (WebServiceKnowledgeService) jaxWsProxyFactoryBean.create();
//
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
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
///*
//
//    @RequestMapping("/02210")
//    public void r02210(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl01);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServiceKnowledgeService.class);
//            // 创建一个代理接口实现
//            WebServiceKnowledgeService service = (WebServiceKnowledgeService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<ResKnowledgeAgency> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                ResKnowledgeAgency data = new ResKnowledgeAgency();
//                list.add(data);
//
//                data.setAppServiceOrganizationCode("appServiceOrganizationCode");
//                data.setAppType                   ("02");
//                data.setCityCode                  ("cityCode                  ");
//                data.setCname                     ("cname                     ");
//                data.setCountryCode               ("countryCode               ");
//                data.setGradeLevel                (1);
//                data.setPlatCode                  ("platCode                  ");
//                data.setProductContent            ("productContent            ");
//                data.setProductLabel              ("productLabel              ");
//                data.setProductMainImg            ("productMainImg            ");
//                data.setProductPrice              ("productPrice              " );
//                data.setProductStatus             ("");
//                data.setProvinceCode              ("provinceCode              ");
//                data.setSynStatus              ("");
//            }
//            FailMessage result = service.batchKnowledgeAgency(list);
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    @RequestMapping("/0241")
//    public void r0241(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl03);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServiceTechFinanceService.class);
//            // 创建一个代理接口实现
//            WebServiceTechFinanceService service = (WebServiceTechFinanceService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<ResTechFinanceOrg> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                ResTechFinanceOrg data = new ResTechFinanceOrg();
//                list.add(data);
//                data.setCityCode(					"cityCode"				+ i);
//                data.setCname(            "cname"           + i);
//                data.setContactName(      "contactName"     + i);
//                data.setContactPhone(     "contactPhone"    + i);
//                data.setCountryCode(      "countryCode"     + i);
//                data.setFinanceType(      "02");
//                data.setGradeLevel(       ""      + i);
//                data.setIsCertification(  "isCertification" + i);
//                data.setPlatform(         "platform"        + i);
//                data.setProductContent(   "productContent"  + i);
//                data.setProductLabel(     "productLabel"    + i);
//                data.setProductLevel(     "productLevel"    + i);
//                data.setProductMainImg(   "productMainImg"  + i);
//                data.setProductQua(       "productQua"      + i);
//                data.setProvinceCode(     "provinceCode"    + i);
//                data.setSerAgencyCode(    "serAgencyCode"   + i);
//                data.setServAgencyType(   "02");
//                data.setServiceProduct(   "serviceProduct"  + i);
//                data.setSynState("0");
//
//            }
//            FailMessage result = service.techFinanceOrg(list);
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//
//
//
//
//    @RequestMapping("/0231")
//    public void r0231(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl02);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServiceTechnologyMoveService.class);
//            // 创建一个代理接口实现
//            WebServiceTechnologyMoveService service = (WebServiceTechnologyMoveService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<ResTechnologyResults> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                ResTechnologyResults data = new ResTechnologyResults();
//                list.add(data);
//                data.setCity(              		"city"+ i);
//                data.setCoherentUnits(        "coherentUnits"+ i);
//                data.setContact(              "contact"+ i);
//                data.setContactPhone(         "contactPhone"+ i);
//                data.setDealStatus(           "0"+ i);
//                data.setEndPrice(new BigDecimal(i));
//                data.setFileUrl(              "fileUrl"+ i);
//                data.setImgUrl(               "imgUrl"+ i);
//                data.setIndustryCategory1(    "industryCategory1"+ i);
//                data.setIndustryCategory2(    "industryCategory2"+ i);
//                data.setIntroduction(         "introduction"+ i);
//                data.setMaturity(             "maturity"+ i);
//                data.setPlatCode(             "platCode"+ i);
//                data.setProvince(             "province"+ i);
//                data.setStartPrice(new BigDecimal(i));
//                data.setSyncCode(             "0");
//                data.setTechAchiveCode(       "techAchiveCode"+ i);
//                data.setTechnologicalFields1( "technologicalFields1"+ i);
//                data.setTechnologicalFields2( "technologicalFields2"+ i);
//                data.setTitle(                "title"+ i);
//                data.setWaysOfCoop("waysOfCoop"  + i);
//
//            }
//            FailMessage result = service.technologyResults(list);
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    @RequestMapping("/0233")
//    public void r0233(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl02);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServiceTechnologyMoveService.class);
//            // 创建一个代理接口实现
//            WebServiceTechnologyMoveService service = (WebServiceTechnologyMoveService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<ResTechnologyRequire> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                ResTechnologyRequire data = new ResTechnologyRequire();
//                list.add(data);
//                data.setCity(    							"city" + i);
//                data.setCoherentUnits(       "coherentUnits" + i);
//                data.setContact(             "contact" + i);
//                data.setContactPhone(        "contactPhone" + i);
//                data.setDealStatus(          "0" + i);
//                data.setFileUrl(             "fileUrl" + i);
//                data.setImgUrl(              "imgUrl" + i);
//                data.setIndustryCategory1(   "industryCategory1" + i);
//                data.setIndustryCategory2(   "industryCategory2" + i);
//                data.setIntroduction(        "introduction" + i);
//                data.setInvestmentBudget(new BigDecimal(i));
//                data.setPlatCode(            "platCode" + i);
//                data.setProvince(            "province" + i);
//                data.setSynStatue(           "0");
//                data.setTechDemandsCode(     "techDemandsCode" + i);
//                data.setTechnologicalFields1("technologicalFields1" + i);
//                data.setTechnologicalFields2("technologicalFields2" + i);
//                data.setTitle(               "title" + i);
//                data.setWaysOfCoop(          "waysOfCoop" + i);
//
//            }
//            FailMessage result = service.technologyRequire(list);
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @RequestMapping("/0234")
//    public void r0234(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl02);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServiceTechnologyMoveService.class);
//            // 创建一个代理接口实现
//            WebServiceTechnologyMoveService service = (WebServiceTechnologyMoveService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<ResTechnologyAssess> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                ResTechnologyAssess data = new ResTechnologyAssess();
//                list.add(data);
//
//                data.setCoherentUnits(					    "coherentUnits"+ i);
//                data.setContact(                    "contact"+ i);
//                data.setContactPhone(               "contactPhone"+ i);
//                data.setImgUrl(                     "imgUrl"+ i);
//                data.setIndustryCategory1(          "industryCategory1"+ i);
//                data.setIndustryCategory2(          "industryCategory2"+ i);
//                data.setName(                       "name"+ i);
//                data.setPlatCode(                   "platCode"+ i);
//                data.setProvince(                   "province"+ i);
//                data.setSynState(                   "0");
//                data.setTechEvaluationCode(         "techEvaluationCode"+ i);
//                data.setTechnologicalFields1(       "technologicalFields1"+ i);
//                data.setTechnologicalFields2(       "technologicalFields2"+ i);
//
//            }
//            FailMessage result = service.technologyAssess(list);
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//    @RequestMapping("/0237")
//    public void r0237(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl02);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServiceTechnologyMoveService.class);
//            // 创建一个代理接口实现
//            WebServiceTechnologyMoveService service = (WebServiceTechnologyMoveService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<ResRegisterRecord> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                ResRegisterRecord data = new ResRegisterRecord();
//                list.add(data);
//
//                data.setBuyer(					"buyer"+ i);
//                data.setContact(       "contact"+ i);
//                data.setContactPhone(  "contactPhone"+ i);
//                data.setContent(       "content"+ i);
//                data.setDealAmount(new BigDecimal(i));
//                data.setDomain(        "domain"+ i);
//                data.setLaws(          "laws"+ i);
//                data.setMethod(        "method"+ i);
//                data.setName(          "name"+ i);
//                data.setOpenDate(      "openDate"+ i);
//                data.setPlatCode(      "platCode"+ i);
//                data.setPrice(new BigDecimal(i));
//                data.setRegiRecordCode("regiRecordCode"+ i);
//                data.setRegion(        "region"+ i);
//                data.setRegisterTime(  "registerTime"+ i);
//                data.setSeller(        "seller"+ i);
//                data.setSynCode(       "0"+ i);
//                data.setTheirPc(       "theirPc"+ i);
//                data.setTranName(      "tranName"+ i);
//
//            }
//            FailMessage result = service.registerRecord(list);
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    @RequestMapping("/0238")
//    public void r0238(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl02);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServiceTechnologyMoveService.class);
//            // 创建一个代理接口实现
//            WebServiceTechnologyMoveService service = (WebServiceTechnologyMoveService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<ResSuccessCase> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                ResSuccessCase data = new ResSuccessCase();
//                list.add(data);
//                data.setAppName(					"appName"+ i);
//                data.setBuyer(            "buyer"+ i);
//                data.setContactPhone(     "contactPhone"+ i);
//                data.setContent(          "content"+ i);
//                data.setDomain(           "domain"+ i);
//                data.setEndTime(          "endTime"+ i);
//                data.setImgUrl(           "imgUrl"+ i);
//                data.setLaws(             "laws"+ i);
//                data.setMethod(           "method"+ i);
//                data.setName(             "name"+ i);
//                data.setPlatCode(         "platCode"+ i);
//                data.setPrice(new BigDecimal(i));
//                data.setRegion(           "region"+ i);
//                data.setSeller(           "seller"+ i);
//                data.setStartTime(        "startTime"+ i);
//                data.setStatus(           "0"+ i);
//                data.setSuccCaseCode(     "succCaseCode"+ i);
//                data.setSynCode(          "0");
//                data.setTheirPc(          "theirPc"+ i);
//                data.setTranName(         "tranName"+ i);
//
//
//            }
//            FailMessage result = service.successCase(list);
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }*/
//
//
//    @RequestMapping("/02261")
//    public void r02261(){
//        try {
//
//            Scheduler scheduler = null;
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl04);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServiceKnowAccountService.class);
//            // 创建一个代理接口实现
//            WebServiceKnowAccountService service = (WebServiceKnowAccountService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<ResKnowledgeAccount> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                ResKnowledgeAccount data = new ResKnowledgeAccount();
//                list.add(data);
//                data.setPlatCode("0");
//                data.setIdEmail("IdEmail" + i);
//                data.setIdName("IdName"+i);
//                data.setIdPassword("IdPassword"+i);
//                data.setIdPhone("IdPhone"+i);
//                data.setAythType("IdAuth"+i);
//            }
//            FailMessage result = service.knowledgeAccountList(list);
//
//            System.out.println(result.toString());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//  /*  @RequestMapping("/02262")
//    public void r02262(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl04);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServiceKnowAccountService.class);
//            // 创建一个代理接口实现
//            WebServiceKnowAccountService service = (WebServiceKnowAccountService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<ResKnowledgeAccount> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                ResKnowledgeAccount data = new ResKnowledgeAccount();
//                list.add(data);
//                data.setPlatCode("1");
//                data.setIdEmail("IdEmail" + i);
//                data.setIdName("IdName"+i);
//                data.setIdPassword("IdPassword"+i);
//                data.setIdPhone("IdPhone"+i);
//                data.setAythType("IdAuth"+i);
//            }
//            FailMessage result = service.knowledgeAccountList(list);
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @RequestMapping("/02263")
//    public void r02263(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl04);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServiceKnowAccountService.class);
//            // 创建一个代理接口实现
//            WebServiceKnowAccountService service = (WebServiceKnowAccountService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<ResKnowledgeAccount> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                ResKnowledgeAccount data = new ResKnowledgeAccount();
//                list.add(data);
//                data.setPlatCode("2");
//                data.setIdEmail("IdEmail" + i);
//                data.setIdName("IdName"+i);
//                data.setIdPassword("IdPassword"+i);
//                data.setIdPhone("IdPhone"+i);
//                data.setAythType("IdAuth"+i);
//            }
//            FailMessage result = service.knowledgeAccountList(list);
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @RequestMapping("/02264")
//    public void r02264(){
//        try {
//
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(LocalWebServiceUrl04);
//            //设置用户名和密码
//            jaxWsProxyFactoryBean.setUsername("baosight");
//            jaxWsProxyFactoryBean.setPassword("baosight_lkjendhe@3dgbe$A");
//
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(WebServiceKnowAccountService.class);
//            // 创建一个代理接口实现
//            WebServiceKnowAccountService service = (WebServiceKnowAccountService) jaxWsProxyFactoryBean.create();
//
//            // 调用代理接口的方法调用并返回结果
//            List<ResKnowledgeAccount> list = new ArrayList<>();
//            for (int i =0; i < 10; i++) {
//                ResKnowledgeAccount data = new ResKnowledgeAccount();
//                list.add(data);
//                data.setPlatCode("3");
//                data.setIdEmail("IdEmail" + i);
//                data.setIdName("IdName"+i);
//                data.setIdPassword("IdPassword"+i);
//                data.setIdPhone("IdPhone"+i);
//                data.setAythType("IdAuth"+i);
//            }
//            FailMessage result = service.knowledgeAccountList(list);
//
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }*/
//
//
//}
