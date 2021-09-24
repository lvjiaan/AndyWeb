package cn.lalisa.web.controller;

import cn.lalisa.web.service.xml.XmlParseService;
import cn.hutool.core.date.DateUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * TODO
 *
 * @author lvja
 * @date 2021/9/24 0024 14:17
 */
@Component
@RestController
public class XmlParseController {
    private final static Logger logger = LoggerFactory.getLogger(XmlParseController.class);
    private final XmlParseService xmlParseService;

    public XmlParseController(XmlParseService xmlParseService) {
        this.xmlParseService = xmlParseService;
    }


    @RequestMapping("searchZip")
    public void searchZip(int year) {
        List<String> lists = new ArrayList<>();
        getList(lists, "D:\\XML\\BIBLIOGRAPHIC_INDUSTRIAL_DESIGN", year);
        getList(lists, "D:\\XML\\BIBLIOGRAPHIC_INVENTION_GRANT", year);
        getList(lists, "D:\\XML\\BIBLIOGRAPHIC_INVENTION_PUBLICATION", year);
        getList(lists, "D:\\XML\\BIBLIOGRAPHIC_UTILITY_MODEL", year);
        getList(lists, "D:\\XML\\LEGALSTATUS", year);
        lists.forEach(path -> {
            logger.info(path);
            xmlParseService.insertZip(path);
        });
    }

    private static void getList(List<String> lists, String patha, int year) {
        Date date = DateUtil.parse(String.valueOf(year));
        Date newDate = DateUtil.offsetMonth(date, 1);
        int nextMonth = Integer.parseInt(DateUtil.format(newDate, "yyyyMMdd"));
        String path = patha;
        File file = new File(path);
        File[] tempList = file.listFiles();
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isDirectory()) {
                int month = Integer.parseInt(tempList[i].getName());
                if (month >= year && month < nextMonth ) {
                    lists.add(tempList[i].getPath());
                }
                //递归：
//                getList(lists, tempList[i].getPath(), year);
            }
        }
    }


}
