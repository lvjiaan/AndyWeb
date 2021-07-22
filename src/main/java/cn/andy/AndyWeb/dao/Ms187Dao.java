package cn.andy.AndyWeb.dao;


import cn.andy.AndyWeb.entity.Emerging;
import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@DS("ms210")
public interface Ms187Dao {


    @Select("SELECT bigCode,bigName,smallCode,smallName,classifyIn,classifyOut,keyWords FROM NingboTheme.dbo.DIM_Emerging_Industry")
    List<Emerging> getEmergingList();
}
