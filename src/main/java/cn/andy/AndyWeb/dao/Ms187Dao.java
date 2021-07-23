package cn.andy.AndyWeb.dao;


import cn.andy.AndyWeb.entity.Emerging;
import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

@DS("ms187")
public interface Ms187Dao {


    @Select("SELECT bigCode,bigName,smallCode,smallName,classifyIn,classifyOut,keyWords FROM NingboTheme.dbo.DIM_Emerging_Industry")
    List<Emerging> getEmergingList();

    @Select("SELECT codeId FROM NingboTheme.dbo.DIM_IPC where not exists(select 1 from NingboTheme.dbo.DIM_IPC where codeid=#{ipc}) and codeid=#{ipc}+'/00' " +
            "union " +
            "SELECT codeId FROM NingboTheme.dbo.DIM_IPC where codeid=#{ipc}")
    String getRootIpc(String ipc);

    @Select("select codeId FROM NingboTheme.dbo.DIM_IPC WHERE parentId=#{ipc}")
    List<String> getSonIpcList(String ipc);

    @Insert("INSERT INTO NingboTheme.dbo.RESULT_Emerging_Industry_IPC(bigCode,bigName,smallCode,smallName,keyWords,ipcNum)" +
            "VALUES(#{bigCode},#{bigName},#{smallCode},#{smallName},#{keyWords},#{ipcNum})")
    void insertAIpc(String bigCode, String bigName, String smallCode, String smallName, String keyWords, String ipcNum);
}
