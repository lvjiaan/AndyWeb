package cn.lalisa.web.service.xml;

/**
 * @program: bigdata
 * @description:
 * @author: cz
 * @create: 2020-03-16 10:19
 **/

import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class ListXmlFiles {

    /**
     * 获取所有XML文件
     * @param path 文件路径
     * @param fileList 存放所有XML文件的列表
     */

    public void getXmlFiles(String path, List<File> fileList, List<File> GIFList) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (File fileIndex : files) {
            if (!fileIndex.exists()) {
                throw new NullPointerException("Cannot find " + fileIndex);
            } else if (fileIndex.isFile()) {
                if(fileIndex.getPath().contains(".XML")){
                    fileList.add(fileIndex);
                }
                if (fileIndex.getPath().contains(".GIF")){
                    GIFList.add(fileIndex);
                }
            } else {
                if (fileIndex.isDirectory()) {
                    getXmlFiles(fileIndex.getAbsolutePath(), fileList,GIFList);
                }
            }
        }
    }

    /**
     * TODO 获取压缩包
     * @Title: getZIP
     * @param path
     * @param fileList
     * @return: void
     * @Author: cz
     * @Date: 2020/3/17
     * @modifier:
     * @modifyContent:
     **/
    public void getZIP(String path, List<File> fileList) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (File fileIndex : files) {
            if (!fileIndex.exists()) {
                throw new NullPointerException("Cannot find " + fileIndex);
            } else if (fileIndex.isFile()) {
                if(fileIndex.getPath().contains(".zip")||fileIndex.getPath().contains(".ZIP")){
                    fileList.add(fileIndex);
                }
            } else {
                if (fileIndex.isDirectory()) {
                    getZIP(fileIndex.getAbsolutePath(), fileList);
                }
            }
        }
    }

    public void getFile(String path, List<File> fileList) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (File fileIndex : files) {
            if (!fileIndex.exists()) {
                throw new NullPointerException("Cannot find " + fileIndex);
            } else if (fileIndex.isFile()) {
                if(fileIndex.getPath().contains("DOCUMENTS_LIST.XML")){
                    fileList.add(fileIndex);
                }
            } else {
                if (fileIndex.isDirectory()) {
                    getFile(fileIndex.getAbsolutePath(), fileList);
                }
            }
        }
    }
}
