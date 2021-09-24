package cn.lalisa.web.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

/**
 * @program: dataBase
 * @description: 获取APItoken
 * @author: cz
 * @create: 2019-10-25 13:11
 **/
public class APIUtil {
    /**
     * @Title: getAPItoken
     * @Description: 获取商标检索token
     * @Param:
     * @return: 返回token字符串
     * @Author: cz
     * @Date: 2019/10/25
     * @modifier:
     * @modifyContent:
     */
    public static String getAPItoken(String url) {
        url = HttpRequestUtil.sendGet(url, "");
        String result = SubStringUtil.subString(url, "result\":\"", "\"}");
        return result;
    }

    /**
     * @author: lvja
     * @Description： 获取出版社api token 进行异常抛出 发邮件。
     * @date: 2021/4/19 17:33
     */
//    public static String getPublisherApiToken() throws Exception {
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        HttpGet request = new HttpGet("http://www.nbippc.cn/Retrieval/getDiAccesstoken?appid=1051&appkey=1051");
//        CloseableHttpResponse response = httpClient.execute(request);
//        HttpEntity httpEntity = response.getEntity();
//        String html = EntityUtils.toString(httpEntity, "utf-8");
//        String result=SubStringUtil.subString(html, "result\":\"", "\"}");
//        if (StrUtil.hasEmpty(result)){
//            EmailUtil.sendEmail("Token出错通知","获取出版社token失败了", Arrays.asList("yupp@zjyiqiao.com","lvja@zjyiqiao.com","shengyx@zjyiqiao.com"));
//            throw new Exception("Failed to get token..");
//        }
//        return result;
//    }

    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }


    public static void AppendContentToFile(String filename, String content) {
        FileWriter fw = null;
        File f = new File(filename);
        try {
            fw = new FileWriter(f, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);
        pw.println(content);
        pw.flush();
        try {
            fw.flush();
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
