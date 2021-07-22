package cn.andy.AndyWeb.utils;

import cn.hutool.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;


public class HttpRequestUtil {
    /**
     * 向指定URL发送GET方法的请求
     *
     * @param url   发送请求的URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
//                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param url   发送请求的 URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, JSONObject param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("content-type", "application/json");
            //conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    /**
     * @Title: returnJson
     * @Description: 返回请求url的json值
     * @Param:
     * @return:
     * @Author: cz
     * @Date: 2019/10/24
     * @modifier:
     * @modifyContent:
//     */
//    public String returnJson(ParamUtilCN paramUtilCN) {
//        String resultJson = "false";
//        try {
//            resultJson = com.yq.dataBase.utils.HttpRequestUtil.sendGet("http://114.251.8.193/api/trademark/detail/china", paramUtilCN.toString());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return resultJson;
//    }

    /**
     *  
     * 向指定 URL 发送 POST请求 
     *  
     *
     * @param strUrl        发送请求的 URL 
     * @param requestParams 请求参数，格式 name1=value1&name2=value2 
     * @return 远程资源的响应结果       
     */
    public static String sendPost(String strUrl, String requestParams) {

        URL url = null;
        HttpURLConnection httpURLConnection = null;
        try {
            url = new URL(strUrl);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestProperty("Accept", "application / json");// 设置接收数据的格式
            httpURLConnection.setRequestProperty("Content - Type", "application / json");  // 设置发送数据的格式
            httpURLConnection.connect();// 建立连接
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                    httpURLConnection.getOutputStream(), "UTF-8");
            outputStreamWriter.append(requestParams);
            outputStreamWriter.flush();
            outputStreamWriter.close();

            // 使用BufferedReader输入流来读取URL的响应
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                    httpURLConnection.getInputStream(), "utf-8"));
            StringBuffer stringBuffer = new StringBuffer();
            String strLine = "";
            while ((strLine = bufferedReader.readLine()) != null) {
                stringBuffer.append(strLine);
            }
            bufferedReader.close();
            String responseParams = stringBuffer.toString();
            System.out.println(responseParams);

            return responseParams;
        } catch (IOException e) {
            e.getMessage();
        } finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
        return null;
    }
}