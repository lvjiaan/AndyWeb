package cn.andy.AndyWeb.service;


import cn.andy.AndyWeb.dao.PostDao;
import cn.andy.AndyWeb.utils.APIUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class PostService {
    final private PostDao postDao;

    public PostService(PostDao postDao) {
        this.postDao = postDao;
    }

//    private final String client_id = "5d8f767eac110007108d0e0a77f83ea8";
//    static String errorCode = "";
//
//    public void test715() {
//        int ccc=0;
//        String token = APIUtil.getAPItoken("http://www.nbippc.cn/Retrieval/getDiAccesstoken?appid=1051&appkey=1051");
//
//        List<String> applyNumList=postDao.getApplyNumList715();
//        for (String item:applyNumList) {
//            HashMap<String, Object> paramMap = new HashMap<>();
//            paramMap.put("client_id", client_id);
//            paramMap.put("access_token", token);
//            paramMap.put("scope", "read_ep");
//            paramMap.put("page", "1");
//            paramMap.put("lang", "cn");
//            paramMap.put("express", " (申请号 =  ( " + item + " ) ) ");
//            String result = HttpUtil.get("http://114.251.8.193/api/patent/search/expression2", paramMap);
//            System.out.println(result);
//            JSONObject jsonObject = null;
//            try {
//                jsonObject = JSONUtil.parseObj(result);
//                errorCode = jsonObject.getStr("errorCode");
//            } catch (Exception e) {
//                System.out.println("json解析失败" + item);
//                e.printStackTrace();
//            }
//            if ("000000".equals(errorCode)) {
//                String context = jsonObject.getStr("context");
//                if (!StrUtil.hasEmpty(context)) {
//                    JSONObject jsonObject2 = JSONUtil.parseObj(context);
//                    String records = jsonObject2.getStr("records");
//                    JSONArray recordsJsonArray = JSONUtil.parseArray(records);
//                    JSONObject recordsJson = recordsJsonArray.getJSONObject(0);
//                    JSONObject jsonObject3 = JSONUtil.parseObj(recordsJson);
//                    String pno = jsonObject3.getStr("pno");
//                    resultsApiDao.uppno(item,pno);
////                    getperson(pid, token, item);
//                }
//            }
//
//            System.out.println(++ccc);
//        }
//
//
//    }
//
//    private void getperson(String pid, String token,String applynum) {
//        System.out.println(pid);
//        HashMap<String, Object> paramMap = new HashMap<>();
//        paramMap.put("client_id", client_id);
//        paramMap.put("access_token", token);
//        paramMap.put("scope", "read_cn");
//        paramMap.put("lang", "cn");
//        paramMap.put("pid", pid);
//        String result = HttpUtil.get("http://114.251.8.193/api/patent/detail/catalog", paramMap);
//        JSONObject jsonObject = null;
//        try {
//            jsonObject = JSONUtil.parseObj(result);
//            errorCode = jsonObject.getStr("errorCode");
//        } catch (Exception e) {
//            System.out.println("json解析失败" + pid);
//            e.printStackTrace();
//        }
//        if ("000000".equals(errorCode)) {
//            String context = jsonObject.getStr("context");
//            if (!StrUtil.hasEmpty(context)) {
//                JSONObject jsonObject2=JSONUtil.parseObj(context);
//                String records = jsonObject2.getStr("records");
//                JSONArray recordsJsonArray = JSONUtil.parseArray(records);
//                if (recordsJsonArray.size()>=2) System.out.println("fuckfuckfuckfuck");
//                JSONObject  recordsJson = recordsJsonArray.getJSONObject(0);
//                JSONObject jsonObject3=JSONUtil.parseObj(recordsJson);
//                String catalogPatent = jsonObject3.getStr("catalogPatent");
//
//                JSONObject jsonObject4=JSONUtil.parseObj(catalogPatent);
//                String apo = jsonObject4.getStr("apo");
//                String aspo=jsonObject4.getStr("aspo");
//                String lssc=jsonObject4.getStr("lssc");
//                String tio=jsonObject4.getStr("tio");
////                resultsApiDao.updateapo(applynum,apo,aspo,lssc,tio);
////              String person=getperson(pid,token);
//
//            }
//        }
//
//
//
//    }
//
//
//
//    public void getpersonbypp() {
//        List<String> pnos=resultsApiDao.getApplyNumList715();
//        String token = APIUtil.getAPItoken("http://www.nbippc.cn/Retrieval/getDiAccesstoken?appid=1051&appkey=1051");
//        for (String pno:pnos){
//            HashMap<String, Object> paramMap = new HashMap<>();
//            paramMap.put("client_id", client_id);
//            paramMap.put("access_token", token);
//            paramMap.put("scope", "read_jp");
//            paramMap.put("lang", "cn");
//            paramMap.put("pno", pno);
//            String result = HttpUtil.get("http://114.251.8.193/api/patent/detail/catalog", paramMap);
//            JSONObject jsonObject = null;
//            try {
//                jsonObject = JSONUtil.parseObj(result);
//                errorCode = jsonObject.getStr("errorCode");
//            } catch (Exception e) {
//                System.out.println("json解析失败" + pno);
//                e.printStackTrace();
//            }
//            if ("000000".equals(errorCode)) {
//                String context = jsonObject.getStr("context");
//                if (!StrUtil.hasEmpty(context)) {
//                    JSONObject jsonObject2=JSONUtil.parseObj(context);
//                    String records = jsonObject2.getStr("records");
//                    JSONArray recordsJsonArray = JSONUtil.parseArray(records);
//                    if (recordsJsonArray.size()>=2) System.out.println("fuckfuckfuckfuck");
//                    JSONObject  recordsJson = recordsJsonArray.getJSONObject(0);
//                    JSONObject jsonObject3=JSONUtil.parseObj(recordsJson);
//                    String catalogPatent = jsonObject3.getStr("catalogPatent");
//                    String pdtStr = jsonObject3.getStr("pdtStr");//专利类型 ,
//                    JSONObject jsonObject4=JSONUtil.parseObj(catalogPatent);
//
//                    String apo = jsonObject4.getStr("apo");
//                    String aspo=jsonObject4.getStr("aspo");//当前权利人原始 ,
//                    String lssc=jsonObject4.getStr("lssc");//当前权利状态 ,
//                    String tio=jsonObject4.getStr("tio");//名称原始 ,
////                    String pdtStr=jsonObject4.getStr("pdtStr");//专利类型 ,
//                    String ad=jsonObject4.getStr("ad");//申请日
//                    String ino=jsonObject4.getStr("ino");//发明人
//                    String pd=jsonObject4.getStr("pd");//申请日
//                    resultsApiDao.updateapo(pdtStr,lssc,ad,tio,ino,aspo,pno,pd);
//                }
//
//            }
//        }
//    }
//
//
//
//    public void postExpression() {
//        int ccc=0;
//        String token = APIUtil.getAPItoken("http://www.nbippc.cn/Retrieval/getDiAccesstoken?appid=1051&appkey=1051");
//        List<String> applyNumList=resultsApiDao.getApplyNumList715();
//        for (String item:applyNumList) {
//            HashMap<String, Object> paramMap = new HashMap<>();
//            paramMap.put("client_id", client_id);
//            paramMap.put("access_token", token);
//            paramMap.put("scope", "read_tw");
//            paramMap.put("page", "1");
//            paramMap.put("lang", "cn");
//            paramMap.put("express", " (申请号 =  ( " + item + " ) ) ");
//            String result = HttpUtil.get("http://114.251.8.193/api/patent/search/expression", paramMap);
//            System.out.println(result);
//            JSONObject jsonObject = null;
//            try {
//                jsonObject = JSONUtil.parseObj(result);
//                errorCode = jsonObject.getStr("errorCode");
//            } catch (Exception e) {
//                System.out.println("json解析失败" + item);
//                e.printStackTrace();
//            }
//            if ("000000".equals(errorCode)) {
//                String context = jsonObject.getStr("context");
//                if (!StrUtil.hasEmpty(context)) {
//                    JSONObject jsonObject2 = JSONUtil.parseObj(context);
//                    String records = jsonObject2.getStr("records");
//                    JSONArray recordsJsonArray = JSONUtil.parseArray(records);
//                    JSONObject recordsJson = recordsJsonArray.getJSONObject(0);
//                    JSONObject jsonObject3 = JSONUtil.parseObj(recordsJson);
//                    String apo = jsonObject3.getStr("apo");
//                    resultsApiDao.upapo(item,apo);
////                    getperson(pid, token, item);
//                }
//            }
//
//            System.out.println(++ccc);
//        }
//
//
//    }


}
