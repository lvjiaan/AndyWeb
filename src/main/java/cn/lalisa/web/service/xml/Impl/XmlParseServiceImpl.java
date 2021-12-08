package cn.lalisa.web.service.xml.Impl;

import cn.lalisa.web.dao.base.BaseDao187;
import cn.lalisa.web.service.xml.ListXmlFiles;
import cn.lalisa.web.service.xml.XmlParseService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author lvja
 * @date 2021/9/24 0024 14:23
 */
@Service
public class XmlParseServiceImpl implements XmlParseService {
    private final BaseDao187 baseDao187;

    public XmlParseServiceImpl(BaseDao187 baseDao187) {
        this.baseDao187 = baseDao187;
    }


    @Override
    public void insertZip(String path) {
        //声明一个HashMap，用于存放XML文件，格式：<文件名，文件>，以文件名为KEY，可以得到整个文件所在的路径和文件名
        ListXmlFiles lxf = new ListXmlFiles();
        //存放xml文件的根目录
        String filePath = path;
        //声明一个List，用于存放所有得到的XML文件
        List<File> fileList = new ArrayList<>();
        lxf.getZIP(filePath, fileList);
        for (File f : fileList) {
            //把每个文件存放到HashMap中
            try {
                Map<String, Object> map = new HashMap<>(8);
                String sub = StrUtil.sub(f.getAbsolutePath().replace("\\", "@"), 3, -4);
                map.put("ID", sub);
                map.put("StoragePath", f.getAbsolutePath() + "");
                map.put("PackageName", f.getName() + "");
                String[] split = f.getAbsolutePath().split("\\\\");
                map.put("Type", split[2]);
                baseDao187.insert("DW_ResultLibrary.dbo.CT_FlieZIP", map, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public int getTextCount(String status) {
        if ("all".equals(status)){
            String id = baseDao187.selectOneCondition("count(1)", "DW_ResultLibrary.dbo.CT_FlieZIP", "(Type = 'FULLTEXT_INVENTION_PUBLICATION' or Type = 'FULLTEXT_INVENTION_GRANT' or Type = 'FULLTEXT_UTILITY_MODEL') and status = 0", "");
            return Integer.parseInt(id);
        }else{
            String id = baseDao187.selectOneCondition("count(1)", "DW_ResultLibrary.dbo.CT_FlieZIP", "(Type = 'FULLTEXT_INVENTION_PUBLICATION' or Type = 'FULLTEXT_INVENTION_GRANT' or Type = 'FULLTEXT_UTILITY_MODEL') and status = "+status, "");
            return Integer.parseInt(id);
        }
    }
}
