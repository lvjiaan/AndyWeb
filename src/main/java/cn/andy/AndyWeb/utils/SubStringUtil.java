package cn.andy.AndyWeb.utils;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @program: dataBase
 * @description: 截取字符串工具类
 * @author: cz
 * @create: 2019-10-25 12:27
 **/
public class SubStringUtil {
    /**
     * @Title: subString
     * @Description: 截取字符串str中指定字符 strStart、strEnd之间的字符串
     * @Param: str, strStart, strEnd
     * @return:
     * @Author: cz
     * @Date: 2019/10/25
     * @modifier:
     * @modifyContent:
     */
    public static String subString(String str, String strStart, String strEnd) {

        /* 找出指定的2个字符在 该字符串里面的 位置 */
        int strStartIndex = str.indexOf(strStart);
        int strEndIndex = str.indexOf(strEnd);

        /* index 为负数 即表示该字符串中 没有该字符 */
        if (strStartIndex < 0) {
//            return "字符串 :---->" + str + "<---- 中不存在 " + strStart + ", 无法截取目标字符串";
            return null;
        }
        if (strEndIndex < 0) {
//            return "字符串 :---->" + str + "<---- 中不存在 " + strEnd + ", 无法截取目标字符串";
            return null;
        }
        /* 开始截取 */
        String result = str.substring(strStartIndex, strEndIndex).substring(strStart.length());
        return result;
    }

    public static String Progressbar(int i, int size) {
        String tu = "--------------------";
        if (i > 0 && size > 0) {
            int c = 1;
            if (size > 10) {
                c = size / 10;
            }
            int count = i / c + 1;
            for (int j = 0; j < count; j++) {
                if (j == 0) {
                    tu = "--------------------";
                } else {
                    if (j == 1) {
                        tu = "";
                    }
                    tu += ">>";
                    if (j == count - 1) {
                        for (int k = 0; k <= 10 - count; k++) {
                            tu += "--";
                        }
                    }
                }
                if (size - 1 == i) {
                    tu = ">>>>>>>>>>>>>>>>>>>>";
                }
            }
        }
        return tu;
    }



    public static Map<String, String> sortMapByKey(Map<String, String> oriMap) {
        if (oriMap == null || oriMap.isEmpty()) {
            return null;
        }
        Map<String, String> sortedMap = new TreeMap<String, String>(new Comparator<String>() {
            @Override
            public int compare(String key1, String key2) {
                int intKey1 = 0, intKey2 = 0;
                try {
                    intKey1 = getInt(key1);
                    intKey2 = getInt(key2);
                } catch (Exception e) {
                    intKey1 = 0;
                    intKey2 = 0;
                }
                return intKey1 - intKey2;
            }
        });
        sortedMap.putAll(oriMap);
        return sortedMap;
    }
    private static Pattern NUMBER_PATTERN = Pattern.compile("^\\d+");
    private static int getInt(String str) {
        int i = 0;
        try {
            Matcher m = NUMBER_PATTERN.matcher(str);
            if (m.find()) {
                i = Integer.valueOf(m.group());
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return i;
    }


}
