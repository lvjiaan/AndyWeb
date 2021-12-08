package cn.lalisa.web.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: bigdata
 * @description: 压缩包表
 * @author: cz
 * @create: 2020-03-17 11:27
 **/
@Data
public class CTFlieZIP {
    private String ID;
    private String StoragePath;
    private String PackageName;
    private String Status;
    private Date CreateTime;
    private String Type;
}
