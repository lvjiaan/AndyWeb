
import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * @Describe:
 * @Author：lvja
 * @Date：2021/3/17 15:14
 * @Modifier：
 * @ModefiedDate:
 */
public class test {
    public static void main(String[] args) {

//        String json ="{\"records\":[{\"pdt\":\"说明书附图\",\"fimalyObjList\":[{\"pno\":\"CN1121256C\",\"ano\":\"CN01101467.9\",\"ad\":\"2001/01/16 00:00:00\",\"pns\":\"CN1121256C\",\"pd\":\"2003/09/17 00:00:00\",\"prno\":\"\",\"pid\":\"PIDCNC020030917000000000011210FCF0G7NIJ010330\",\"tic\":\"一种处理含二氧化硫废气的化学吸附剂\"},{\"pno\":\"CN1316289A\",\"ano\":\"CN01101467.9\",\"ad\":\"2001/01/16 00:00:00\",\"pns\":\"CN1316289A\",\"pd\":\"2001/10/10 00:00:00\",\"prno\":\"\",\"pid\":\"PIDCNA020011010000000000013160FCF0JSRPO01219D\",\"tic\":\"一种处理含二氧化硫废气的化学吸附剂\"}],\"feePaymentInformations\":[{\"pift\":\"发明专利第17年年费\",\"pir\":\"58269633\",\"pips\":\"处理结束\",\"pipd\":\"20170111\",\"pif\":\"8000\",\"piabn\":\"宁波太极环保设备有限公司\"},{\"pift\":\"发明专利第16年年费\",\"pir\":\"48845874\",\"pips\":\"处理结束\",\"pipd\":\"20160118\",\"pif\":\"8000\",\"piabn\":\"宁波太极环保设备有限公司\"},{\"pift\":\"发明专利第15年年费\",\"pir\":\"41234495\",\"pips\":\"处理结束\",\"pipd\":\"20150120\",\"pif\":\"6000\",\"piabn\":\"宁波太极环保设备有限公司\"},{\"pift\":\"发明专利第14年年费\",\"pir\":\"33966439\",\"pips\":\"处理结束\",\"pipd\":\"20140115\",\"pif\":\"6000\",\"piabn\":\"宁波太极环保设备有限公司\"},{\"pift\":\"发明专利第13年年费\",\"pir\":\"28183823\",\"pips\":\"处理结束\",\"pipd\":\"20130111\",\"pif\":\"6000\",\"piabn\":\"宁波太极环保设备有限公司\"},{\"pift\":\"发明专利年费滞纳金\",\"pir\":\"23172497\",\"pips\":\"处理结束\",\"pipd\":\"20120312\",\"pif\":\"200\",\"piabn\":\"宁波太极环保设备有限公司\"},{\"pift\":\"发明专利第12年年费\",\"pir\":\"23172497\",\"pips\":\"处理结束\",\"pipd\":\"20120312\",\"pif\":\"4000\",\"piabn\":\"宁波太极环保设备有限公司\"},{\"pift\":\"发明专利第11年年费\",\"pir\":\"17914367\",\"pips\":\"处理结束\",\"pipd\":\"20110106\",\"pif\":\"4000\",\"piabn\":\"史汉祥\"},{\"pift\":\"发明专利年费\",\"pir\":\"15894652\",\"pips\":\"处理结束\",\"pipd\":\"20100209\",\"pif\":\"4000\"},{\"pift\":\"发明专利年费\",\"pir\":\"15894652\",\"pips\":\"处理结束\",\"pipd\":\"20100125\",\"pif\":\"4000\"},{\"pift\":\"发明专利年费\",\"pir\":\"15894652\",\"pips\":\"处理结束\",\"pipd\":\"20100125\",\"pif\":\"4000\",\"piabn\":\"史汉祥\"},{\"pift\":\"发明专利年费\",\"pir\":\"11360964\",\"pips\":\"处理结束\",\"pipd\":\"20090105\",\"pif\":\"2000\",\"piabn\":\"史汉祥\"},{\"pift\":\"发明专利年费\",\"pir\":\"09743148\",\"pips\":\"处理结束\",\"pipd\":\"20080114\",\"pif\":\"2000\",\"piabn\":\"史汉祥\"},{\"pift\":\"发明专利年费\",\"pir\":\"07369971\",\"pips\":\"处理结束\",\"pipd\":\"20070111\",\"pif\":\"2000\",\"piabn\":\"史汉祥\"},{\"pift\":\"发明专利年费\",\"pir\":\"05989872\",\"pips\":\"处理结束\",\"pipd\":\"20060104\",\"pif\":\"1200\",\"piabn\":\"史汉祥\"}],\"citByRefdsNum\":\"1\",\"pdtStr\":\"发明\",\"catalogPatent\":{\"fterm\":\"\",\"aspc\":\"史汉祥\",\"bk2\":\"00\",\"pid\":\"PIDCNC020030917000000000011210FCF0G7NIJ010330\",\"aspe\":\"Shi Hanxiang\",\"cipca\":\"0\",\"uc\":\"\",\"ap1a\":\"CN330282\",\"pctao\":\"\",\"cpc\":\"\",\"depc\":\"4\",\"tio\":\"一种处理含二氧化硫废气的化学吸附剂\",\"awto\":\"\",\"aspo\":\"史汉祥\",\"ipc\":\"B01D53/50;B01D53/78;\",\"pctad\":\"        \",\"cipct\":\"0\",\"apo\":\"史汉祥\",\"ac\":\"CN\",\"plic\":\"0\",\"ad\":\"20010116\",\"cln\":\"1\",\"lssc\":\"无效\",\"ag\":\"袁忠卫;\",\"pctsd\":\"\",\"icln\":\"1\",\"pno\":\"CN1121256C\",\"awgdo\":\"\",\"dppad\":\"\",\"rd\":\"20210116\",\"pns\":\"CN1121256C\",\"ap1adc\":\"315301浙江省慈溪市宗汉镇史家村\",\"cie\":\"孔德辉;\",\"ap1ado\":\"315301浙江省慈溪市宗汉镇史家村\",\"fi\":\"\",\"bk\":\"\",\"pctpd\":\"\",\"pcc\":\"0\",\"tcc\":\"0\",\"pinc\":\"\",\"pct\":\"N\",\"awyo\":\"\",\"ppc\":\"0\",\"ano\":\"CN01101467.9\",\"efc\":\"2\",\"ans\":\"CN102001000001467\",\"ino\":\"史汉祥;\",\"cigc\":\"1\",\"dcln\":\"0\",\"sfc\":\"2\",\"ipcscc\":\"1\",\"pc\":\"CN\",\"pd\":\"20030917\",\"prno\":\"\",\"lc\":\"\",\"cipc\":\"3\",\"pctpo\":\"\",\"pk\":\"C\",\"aso\":\"史汉祥\",\"agc\":\"宁波诚源专利事务所有限公司\",\"dppano\":\"\"},\"abscnHTML\":\"http://image.zldsj.com/H/PID/CNC0/2003/0917/00000000001121/0FCF0G7NIJ010330/ABS/ABS_ZH.html\",\"feeNotices\":[{\"ntrn\":\"XQ12273090511\",\"ntabn\":\"袁忠卫\",\"nttd\":\"缴费通知书\",\"ntpd\":\"20120222\",\"ntt\":\"200701\"}],\"cits\":[{\"pno\":\"CN2281834Y\",\"ano\":\"CN97203180.4\",\"ad\":\"19970411\",\"pd\":\"19980520\",\"cisType\":\"审查员引证\",\"cies\":\"CN2281834Y\",\"cis\":\"EXA\",\"tic\":\"锅炉烟气脱硫除尘器\"},{\"pno\":\"CN2281834Y\",\"ano\":\"CN97203180.4\",\"ad\":\"19970411\",\"pd\":\"19980520\",\"cisType\":\"申请人引证\",\"cias\":\"CN2281834Y\",\"cis\":\"APP\",\"tic\":\"锅炉烟气脱硫除尘器\"},{\"pno\":\"CN85104062A\",\"ano\":\"CN85104062\",\"ad\":\"19850522\",\"pd\":\"19860716\",\"cisType\":\"申请人引证\",\"cias\":\"CN85104062A\",\"cis\":\"APP\",\"tic\":\"烟气催化脱硫剂及其制备方法\"},{\"pno\":\"US04629721A\",\"ano\":\"US06/838662\",\"ad\":\"19860312\",\"pd\":\"19861216\",\"cisType\":\"审查员引证\",\"cies\":\"US4629721A\",\"cis\":\"EXA\",\"tic\":\"Process for preparing desulfurizing and denitrating agents\"},{\"pno\":\"US04629721A\",\"ano\":\"US06/838662\",\"ad\":\"19860312\",\"pd\":\"19861216\",\"cisType\":\"申请人引证\",\"cias\":\"US4629721A\",\"cis\":\"APP\",\"tic\":\"Process for preparing desulfurizing and denitrating agents\"}],\"citsNum\":\"5\",\"debec\":\"\",\"citByRefds\":[{\"pno\":\"CN108722134A\",\"bydCis\":\"APP\",\"ano\":\"CN201711118060.3\",\"ad\":\"20171113\",\"pd\":\"20181102\",\"cisType\":\"申请人引证\",\"bydCias\":\"CN108722134A\",\"cis\":\"APP\",\"tic\":\"一种烟气脱硝方法及烟气脱硫脱硝方法\"}],\"fimalyNum\":\"2\",\"descnHTML\":\"http://image.zldsj.com/H/PID/CNC0/2003/0917/00000000001121/0FCF0G7NIJ010330/DES/DES_ZH.html\",\"imgArray\":[{\"图1\":\"http://image.zldsj.com/H/PID/CNC0/2003/0917/00000000001121/0FCF0G7NIJ010330/DRA/C0110146700071.GIF\"},{\"图2\":\"http://image.zldsj.com/H/PID/CNC0/2003/0917/00000000001121/0FCF0G7NIJ010330/DRA/C0110146700081.GIF\"}],\"clacnHTML\":\"http://image.zldsj.com/H/PID/CNC0/2003/0917/00000000001121/0FCF0G7NIJ010330/CLA/CLA_ZH.html\"}]}";
//        JSONObject jsonContext = JSONUtil.parseObj(json);
//        String records = jsonContext.getStr("records");
//        if (!StrUtil.hasEmpty(records)) {
//            String fimalyObjListStr=JSONUtil.parseObj(JSONUtil.parseArray(records).getJSONObject(0)).getStr("fimalyObjList");
//            if (!StrUtil.hasEmpty(fimalyObjListStr)) {
//                JSONArray jsonArray = JSONUtil.parseArray(fimalyObjListStr);
//                for (int i = 0; i < jsonArray.size(); i++) {
//                    String pid=jsonArray.getJSONObject(i).getStr("pid");
//                    System.out.println((i+1)+":"+pid);
//
//                }
//            }
//
//
////            System.out.println(fimalyObjListStr);
//        }
//        String unitName="fffff";
//
//        String express=String.format("( ( 原告或上诉人 = %s OR 被告或被上诉人 = %s OR 原告代理机构 = %s OR 被告代理机构 = %s) )",unitName,unitName,unitName,unitName);
//        System.out.println(express);
        for (int i=2;i<=3;i++){
            System.out.println(i);
        }

//        int totalPage= 133%50>0?133/50+1:133/50;
//        System.out.println(totalPage);
    }
}
